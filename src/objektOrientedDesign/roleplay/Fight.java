package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.Gamefigurine;
import objektOrientedDesign.roleplay.items.*;
import objektOrientedDesign.roleplay.weapons.Weapon;

import java.util.HashMap;

import static objektOrientedDesign.roleplay.TextStuff.*;

public class Fight {

    public static void startTheFight(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(ANSI_CYAN + "It seems all preparations are done from both ends time to start the fight lets see who gets the First Hit" + ANSI_RESET);
        if(playerOne.getSpeed() > playerTwo.getSpeed()) {
            fightOptions(playerOne, playerTwo);
        } else {
            if(playerTwo.getSpeed() > playerOne.getSpeed()) fightOptions(playerTwo, playerOne);
        }
        play20Rounds(playerOne, playerTwo);
    }
            // Todo: Interfaces genauer anschauen. Eigenes Klasse mit Interface schreiben und diese instanzieren und mit dem Interface dann implementieren.
    private static void play20Rounds(Gamefigurine playerOne, Gamefigurine playerTwo) {
        int i;
        for (i = 0; i <= 20; i++) {
            if(i <= 20) {
                fightOptions(playerOne, playerTwo);
                i = winningConditions(playerOne, playerTwo, i);
                fightOptions(playerTwo, playerOne);
                i = winningConditions(playerTwo, playerOne, i);
                draw(playerOne, playerTwo, i);      //draw because no one won
            }
        }
    }

    private static void draw(Gamefigurine playerOne, Gamefigurine playerTwo, int i) {
        if(i == 20) {
            System.out.println(ANSI_VIOLET + "It seems the Game has ended in a Draw bc no one had under 0 HP");
            System.out.println(anyLine("white"));
            System.out.println(ANSI_GOLD + playerOne.getlP() + ANSI_BLUE + " there was still that much Health in the Character " + playerOne.getName());
            System.out.println(ANSI_GOLD + playerTwo.getlP() + ANSI_RED + " there was still that much Health in the Character " + playerTwo.getName() + ANSI_RESET);
            System.out.println(anyLine("white"));
        }
    }

    private static int winningConditions(Gamefigurine playerOne, Gamefigurine playerTwo, int i) {
        if(playerOne.getlP() < 0 || playerTwo.getlP() < 0) {
            if(playerOne.getlP() < 0) {
                if(Math.random() * 1 < 0 + playerOne.getSpeed()) {
                    attackOpponent(playerOne, playerTwo);
                    if(playerTwo.getlP() < 0) {
                        i = 21;
                        playerOneWins(playerOne, playerTwo);
                    } else {
                        i = 21;
                        playerTwoWins(playerOne, playerTwo);
                    }
                } else {
                    i = 21;
                    playerTwoWins(playerOne, playerTwo);
                }
                i = 21;
                playerTwoWins(playerOne, playerTwo);
            } else {
                if(playerTwo.getlP() < 0) {
                    if(Math.random() * 1 < 0 + playerTwo.getSpeed()) {
                        attackOpponent(playerTwo, playerOne);
                        if(playerOne.getlP() < 0) {
                            playerTwoWins(playerOne, playerTwo);
                        } else {
                            i = 21;
                            playerOneWins(playerOne, playerTwo);
                        }
                    } else {
                        i = 21;
                        playerOneWins(playerOne, playerTwo);
                    }
                    i = 21;
                    playerOneWins(playerOne, playerTwo);
                }
            }
        }
        return i;
    }

    private static void playerOneWins(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(anyLine("blue"));
        System.out.println(ANSI_PURPLE + "So the player who chose : " + color("gold") + playerOne.getName() + color("purple") + " won" + color(""));
        System.out.println(anyLine("blue"));
        System.out.println(anyLine("green"));
        System.out.println(ANSI_GOLD + playerOne.getlP() + ANSI_BLUE + " Is the Remaining amount of health on " + playerOne.getName());
        System.out.println(ANSI_GOLD + playerTwo.getlP() + ANSI_RED + " has died with that amount on " + playerTwo.getName() + ANSI_RESET);
        System.out.println(anyLine("green"));
        Log.addMessage(playerOne.getName() + " Won");
        System.out.println(ANSI_ICEBLUE + "This is the log of the Game" + ANSI_RESET);
        System.out.println(anyLine("ice"));
        Log.printLog();
        System.out.println(anyLine("ice"));
        System.exit(0);
    }

    private static void playerTwoWins(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(anyLine("blue"));
        System.out.println(ANSI_PURPLE + "So the player who chose : " + ANSI_GOLD + playerTwo.getName() + ANSI_PURPLE + " won");
        System.out.println(anyLine("blue"));
        System.out.println(anyLine("green"));
        System.out.println(ANSI_GOLD + playerTwo.getlP() + ANSI_BLUE + " Is the Remaining amount of health on " + playerTwo.getName());
        System.out.println(ANSI_GOLD + playerOne.getlP() + ANSI_RED + " has died with that amount on " + playerOne.getName() + ANSI_RESET);
        System.out.println(anyLine("green"));
        Log.addMessage(playerTwo.getName() + " Won");
        System.out.println(ANSI_ICEBLUE + "This is the log of the Game");
        System.out.println(anyLine("ice"));
        Log.printLog();
        System.out.println(anyLine("ice"));
        System.exit(0);
    }

    public static void fightOptions(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(ANSI_CYAN + "Seems that the player who chose " + ANSI_PURPLE + player.getName() + ANSI_CYAN + " Will Be the one to choose their move" + ANSI_RESET);
        HashMap <Integer, String> chooseNextMove = new HashMap <>();
        System.out.println(anyLine("green"));
        chooseNextMove.put(1, "1: Attack enemy");
        chooseNextMove.put(2, "2: Activate Different Weapon");
        chooseNextMove.put(3, "3: Drop Weapon");
        chooseNextMove.put(4, "4: Use Item");
        chooseNextMove.put(5, "5: Drop Armor");
        chooseNextMove.put(6, "6: Do Nothing");
        chooseNextMove.put(7, "7: Give up");
        for (int i = 1; i <= chooseNextMove.size(); i++) {
            System.out.println(chooseNextMove.get(i));
        }
        System.out.println(anyLine("green"));
        moveChoices(player, opponent);
    }

    private static void moveChoices(Gamefigurine player, Gamefigurine opponent) {
        int yourMove = InputIn.nexIntOut("Choose what you would like to do this round");
        switch (yourMove) {
            case 1 -> attackOpponent(player, opponent);
            case 2 -> activateNewWeapon(player);
            case 3 -> {
                try {
                    player.setfV(player.getfV() - player.getWeapon().getfV());
                    player.setcC(player.getcC() + player.getWeapon().getWeight());
                    player.setWeapon(null);
                    player.setfV(1);
                    Log.addMessage(player.getName() + " dropped his weapon");
                } catch (Exception e) {
                    System.out.println(ANSI_RED + " You can't really drop your Fists");
                    Log.addMessage(player.getName() + " Tried to drop his Fists");
                }

            }
            case 4 -> {
                if(player.getItemBackpack() != null) {
                    for (Item items : player.getItemBackpack()) {
                        System.out.println(items.getItem());
                    }
                    InputIn.nextLine();
                    String useItem = InputIn.nextLineOut(ANSI_CYAN + "What item do you want to use?" + ANSI_RESET);
                    try {
                        potionsAndRings(player, opponent, player.getItemBackpack().stream()
                                                                .filter(a -> a.getItem().equals(useItem)).toList()
                                                                .get(0));
                    } catch (Exception e) {
                        System.out.println(ANSI_RED + "Item not Found!" + ANSI_RESET);
                    }
                }
            }
            case 5 -> {
                try {
                    player.setRes(player.getRes() - player.getArmor().getRes());
                    player.setcC(player.getcC() + player.getArmor().getWeight());
                    player.setSpeed(player.getSpeed() + player.getArmor().getSlowness());
                    player.setArmor(null);
                    Log.addMessage(player.getName() + " dropped his armor");
                } catch (Exception e) {
                    System.out.println(ANSI_RED + "You do not have Armor");
                    Log.addMessage(player.getName() + " Tried to drop Armor that he did not have on");
                }
            }
            case 6 -> {
                System.out.println(ANSI_LIME + "Ok seems understandable?" + ANSI_RESET);
                Log.addMessage(player.getName() + " did nothing");
            }
            case 7 -> {
                player.setlP(-1);
                Log.addMessage(player.getName() + " gave up");
                winningConditions(player, opponent, 21);
            }
            default -> {
                System.out.println(ANSI_ORANGE + "So just do the same as 5? Got it." + ANSI_RESET);
                Log.addMessage(player.getName() + " failed to press a number from 1-6");
            }
        }
    }

    private static void activateNewWeapon(Gamefigurine player) {
        if(player.getWeaponBackpack() != null) {
            for (Weapon weapons : player.getWeaponBackpack()) {
                System.out.println(weapons.getWeapon());
            }
            InputIn.nextLine();
            String changeWeapon = InputIn.nextLineOut(ANSI_CYAN + "what weapon do you wish to activate?" + ANSI_RESET);
            for (Weapon weapon : player.getWeaponBackpack()) {
                if(weapon.getWeapon().equals(changeWeapon)) {
                    player.setfV(player.getfV() - weapon.getfV());
                    player.setcC(player.getcC() + weapon.getWeight());
                    weaponChange(player, changeWeapon, weapon);
                } else {
                    System.out.println(ANSI_RED + " not here");
                }
            }
        } else {
            System.out.println(ANSI_RED + "You dont have any other weapons than the one you are using. Well you just wasted your turn." + ANSI_RESET);
            Log.addMessage(" Used a turn trying to change his weapon");
        }
    }

    private static void weaponChange(Gamefigurine player, String changeWeapon, Weapon weapons) {
        if(weapons.getWeapon().equals(changeWeapon)) {
            player.setWeapon(weapons);
            player.setfV(player.getfV() + weapons.getfV());
            player.setcC(player.getcC() - weapons.getWeight());         //BUGFIX dont let it check all weapons Xd
            Log.addMessage(player.getName() + " changed his weapon to:" + weapons.getWeapon());
        } else {
            System.out.println(ANSI_RED + "seems like you dont have a weapon like that in your inventory" + ANSI_RESET);
            Log.addMessage(player.getName() + " tried to changed his weapon to:" + weapons.getWeapon() + " but failed");
        }
    }

    private static void potionsAndRings(Gamefigurine player, Gamefigurine opponent, Item choice) {
        if(choice instanceof DamagePotion) {
            damagePot(player, choice);
        } else {
            if(choice instanceof HealthPotion) {
                healthPot(player, opponent, choice);
            } else {
                if(choice instanceof PowerPotion) {
                    powerPot(player, choice);
                } else {
                    rings(player, opponent, choice);
                }
            }
        }
    }

    private static void rings(Gamefigurine player, Gamefigurine opponent, Item choice) {
        if(choice instanceof StrengthRing) {
            strengthRing(player, choice);

        } else {
            if(choice instanceof CharmRing) {
                charmRing(player, opponent, (CharmRing) choice);
            } else {
                if(choice instanceof ShieldRing) {
                    player.setRes(player.getRes() + ((ShieldRing) choice).getMoreRes());
                    itemUsed(player, choice);
                }
            }
        }
    }

    private static void charmRing(Gamefigurine player, Gamefigurine opponent, CharmRing choice) {
        if(Math.random() * 1 < 0 + choice.getCharm()) {
            opponent.setfV(opponent.getfV() - choice.getLessenEnemiesFV());
            itemUsed(player, choice);
        } else {
            System.out.println(ANSI_RED + "Charm Ring was used but it was unable to charm the Opponent" + ANSI_RESET);
        }
    }

    private static void strengthRing(Gamefigurine player, Item choice) {
        player.setcC(player.getcC() + ((StrengthRing) choice).getMoreCC());
        itemUsed(player, choice);
    }

    private static void powerPot(Gamefigurine player, Item choice) {
        player.setcC(player.getcC() + ((PowerPotion) choice).getGiveMoreCC());
        itemUsed(player, choice);
    }

    private static void itemUsed(Gamefigurine player, Item choice) {
        Log.addMessage(player.getName() + " used a " + choice.getItem());
        player.setcC(player.getcC() + choice.getWeight());
        player.getItemBackpack().remove(choice);
    }

    private static void healthPot(Gamefigurine player, Gamefigurine opponent, Item choice) {
        player.setlP(player.getlP() + ((HealthPotion) choice).getGiveLP());
        itemUsed(player, choice);
        giveOutRemainingLP(player, opponent);
    }

    private static void damagePot(Gamefigurine player, Item choice) {
        player.setfV(player.getfV() + ((DamagePotion) choice).getAddFV());
        itemUsed(player, choice);
    }

    private static void attackOpponent(Gamefigurine player, Gamefigurine opponent) {
        checkAccuracyToHit(player, opponent);
    }

    private static void checkAccuracyToHit(Gamefigurine player, Gamefigurine opponent) {
        if(Math.random() * 1 < 0 + player.getAccuracy()) {  //Checks if you could hit your Attack to then check Armor and more
            gotArmor(player, opponent); //Checks if Enemy has Armor On
        } else {
            if(Math.random() * 1 < 0 + opponent.getEvasion()) {        //Looks if the evasion was high enough to evade the attack
                attackEvaded(player, opponent);
            } else {
                attackMissed(player, opponent);
            }
        }
    }

    private static void attackEvaded(Gamefigurine player, Gamefigurine opponent) {
        Log.addMessage(opponent.getName() + " Evaded an attack");
        System.out.println(ANSI_ORANGE + "The Opponent Evaded the attack" + ANSI_RESET);
        giveOutRemainingLP(player, opponent);
    }

    private static void gotArmor(Gamefigurine player, Gamefigurine opponent) {
        if(opponent.getArmor() != null) {       //Seeing if you have Armor if yes it does the stuff with the probability
            checkIfArmorWillSaveEnemy(player, opponent);
        } else {
            if(Math.random() * 1 < 0 + player.getInstantDeath()) {
                Log.addMessage(opponent.getName() + " Instantly Died");
                System.out.println(ANSI_ICEBLUE + "It seems you have perished instantly because death favored your opponent player: " + player.getName() + ANSI_RESET);
                opponent.setlP(-999999);
            } else {
                damageDeal(player, opponent);
            }
        }
    }

    private static void checkIfArmorWillSaveEnemy(Gamefigurine player, Gamefigurine opponent) {
        if(!(Math.random() * 1 < 0 + opponent.getArmor()                 //Checking the probability of the Armor saving you if not then you deal damage.
                                             .getNoDamage())) {
            if(Math.random() * 1 < 0 + player.getInstantDeath()) {
                Log.addMessage(opponent.getName() + " Instantly Died");
                System.out.println(ANSI_ICEBLUE + "It seems you have perished instantly because death favored your opponent player: " + opponent.getName() + ANSI_RESET);
                opponent.setlP(-999999);
            } else {
                damageDeal(player, opponent);
            }
        } else {
            noDamageBcArmor(player, opponent);  //Armor saves you from the Damage
        }
    }

    private static void attackMissed(Gamefigurine player, Gamefigurine opponent) {
        Log.addMessage(player.getName() + " missed");
        System.out.println(ANSI_ORANGE + "You missed" + ANSI_RESET);     //Looks if you had enough accuracy to hit
        giveOutRemainingLP(player, opponent);
    }

    private static void giveOutRemainingLP(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(ANSI_GOLD + player.getlP() + ANSI_BLUE + " Is the Remaining amount of health on " + player.getName());
        System.out.println(ANSI_GOLD + opponent.getlP() + ANSI_RED + " Is the Remaining amount of health on " + opponent.getName() + ANSI_RESET);
    }

    private static void noDamageBcArmor(Gamefigurine player, Gamefigurine opponent) {
        Log.addMessage(opponent.getName() + " Armor saved him from Damage");
        System.out.println(ANSI_ORANGE + "It seems you hit your opponent bur their armor saved them from taking Damage" + ANSI_RESET);
        giveOutRemainingLP(player, opponent);
    }

    private static void damageDeal(Gamefigurine player, Gamefigurine opponent) {
        Log.addMessage(player.getName() + " attacked " + opponent.getName());
        opponent.setlP(opponent.getlP() - (player.getfV() / opponent.getRes()));
        giveOutRemainingLP(player, opponent);
    }
}