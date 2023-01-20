package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.Gamefigurine;
import objektOrientedDesign.roleplay.items.*;
import objektOrientedDesign.roleplay.weapons.Weapon;

import java.util.HashMap;

import static objektOrientedDesign.roleplay.TextStuff.*;

public class Fight {

    public static void startTheFight(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(color("cyan") + "It seems all preparations are done from both ends time to start the fight lets see who gets the First Hit" + color("r"));
        if(playerOne.getSpeed() > playerTwo.getSpeed()) {
            fightOptions(playerOne, playerTwo);
        } else {
            if(playerTwo.getSpeed() > playerOne.getSpeed()) fightOptions(playerTwo, playerOne);
        }
        play20Rounds(playerOne, playerTwo);
    }

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
            System.out.println(color("violet") + "It seems the Game has ended in a Draw bc no one had under 0 HP");
            System.out.println(anyLine("white"));
            System.out.println(color("gold") + playerOne.getlP() + color("blue") + " there was still that much Health in the Character " + playerOne.getName() + color(""));
            System.out.println(color("gold") + playerTwo.getlP() + color("red") + " there was still that much Health in the Character " + playerTwo.getName() + color(""));
            System.out.println(anyLine("white"));
        }
    }

    private static int winningConditions(Gamefigurine playerOne, Gamefigurine playerTwo, int i) {
        if(playerOne.getlP() < 0 || playerTwo.getlP() < 0) {
            if(playerOne.getlP() < 0) {
                i = 21;
                playerTwoWins(playerOne, playerTwo);
            } else {
                if(playerTwo.getlP() < 0) {
                    i = 21;
                    playerOneWins(playerOne, playerTwo);
                }
            }
        }
        return i;
    }

    private static void playerOneWins(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(anyLine("blue"));
        System.out.println(color("purple") + "So the player who chose : " + color("gold") + playerOne.getName() + color("purple") + " won" + color(""));
        System.out.println(anyLine("blue"));
        System.out.println(anyLine("green"));
        System.out.println(color("gold") + playerOne.getlP() + color("blue") + " Is the Remaining amount of health on " + playerOne.getName() + color(""));
        System.out.println(color("gold") + playerTwo.getlP() + color("red") + " has died with that amount on " + playerTwo.getName() + color(""));
        System.out.println(anyLine("green"));   //
        Log.addMessage(playerOne.getName() + " Won");
        System.out.println(color("ice") + "This is the log of the Game" + color(""));
        System.out.println(anyLine("ice"));
        Log.printLog();
        System.out.println(anyLine("ice"));
        System.exit(0);
    }

    private static void playerTwoWins(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(anyLine("blue"));
        System.out.println(color("purple") + "So the player who chose : " + color("gold") + playerTwo.getName() + color("purple") + " won" + color(""));
        System.out.println(anyLine("blue"));
        System.out.println(anyLine("green"));
        System.out.println(color("gold") + playerTwo.getlP() + color("blue") + " Is the Remaining amount of health on " + playerTwo.getName() + color(""));
        System.out.println(color("gold") + playerOne.getlP() + color("red") + " has died with that amount on " + playerOne.getName() + color(""));
        System.out.println(anyLine("green"));
        Log.addMessage(playerTwo.getName() + " Won");
        System.out.println(color("ice") + "This is the log of the Game" + color(""));
        System.out.println(anyLine("ice"));
        Log.printLog();
        System.out.println(anyLine("ice"));
        System.exit(0);
    }

    public static void fightOptions(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(color("cyan") + "Seems that the player who chose " + color("purple") + player.getName() + color("cyan") + " Will Be the one to choose their move" + color(""));
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
                player.setfV(player.getfV() - player.getWeapon().getfV());
                player.setcC(player.getcC() + player.getWeapon().getWeight());
                player.setWeapon(null);
                player.setfV(1);
                Log.addMessage(player.getName() + " dropped his weapon");
            }
            case 4 -> {
                if(player.getItemBackpack() != null) {
                    for (Item items : player.getItemBackpack()) {
                        System.out.println(items.getItem());
                    }
                    InputIn.nextLine();
                    String useItem = InputIn.nextLineOut(color("cyan") + "What item do you want to use?" + color(""));
                    try {
                        potionsAndRings(player, opponent, player.getItemBackpack().stream()
                                                                .filter(a -> a.getItem().equals(useItem)).toList()
                                                                .get(0));
                    } catch (Exception e) {
                        System.out.println(color("red") + "Item not Found!" + color(""));
                    }
                }
            }
            case 5 ->{
                try {
                    player.setRes(player.getRes() - player.getArmor().getRes());
                    player.setcC(player.getcC() + player.getArmor().getWeight());
                    player.setSpeed(player.getSpeed() + player.getArmor().getSlowness());
                    player.setArmor(null);
                    Log.addMessage(player.getName() + " dropped his armor");
                }catch (Exception e){
                    System.out.println(ANSI_RED + "You do not have Armor");
                }

            }
            case 6 -> {
                System.out.println(color("lime") + "Ok seems understandable?" + color(""));
                Log.addMessage(player.getName() + " did nothing");
            }
            case 7 -> {
                player.setlP(-1);
                Log.addMessage(player.getName() + " gave up");
                winningConditions(player, opponent, 21);
            }
            default -> {
                System.out.println(color("orange") + "So just do the same as 5? Got it." + color(""));
                Log.addMessage(player.getName() + " failed to press a number from 1-6");
            }
        }
    }

    private static void activateNewWeapon(Gamefigurine player) {
        if(player.getWeaponBackpack() != null) {
            String changeWeapon = InputIn.nextLineOut(color("cyan") + "what weapon do you wish to activate?" + color(""));
            for (Weapon weapons : player.getWeaponBackpack()) {
                System.out.println(weapons.getWeapon());
                player.setfV(player.getfV() - weapons.getfV());
                player.setcC(player.getcC() + weapons.getWeight());
                if(weapons.getWeapon().equals(changeWeapon)) {
                    player.setWeapon(weapons);
                    player.setfV(player.getfV() + weapons.getfV());
                    player.setcC(player.getcC() - weapons.getWeight());
                    Log.addMessage(player.getName() + " changed his weapon to:" + weapons.getWeapon());
                } else {
                    System.out.println(color("red") + "seems like you dont have a weapon like that in your inventory" + color(""));
                    Log.addMessage(player.getName() + " tried to changed his weapon to:" + weapons.getWeapon() + " but failed");
                }
            }
        } else {
            System.out.println(color("red" + "You dont have any other weapons than the one you are using. Well you just wasted your turn." + color("")));
        }
    }

    private static void potionsAndRings(Gamefigurine player, Gamefigurine opponent, Item choice) {
        if(choice.getClass().equals(DamagePotion.class)) {
            damagePot(player, choice);
        } else {
            if(choice.getClass().equals(HealthPotion.class)) {
                healthPot(player, opponent, choice);
            } else {
                if(choice.getClass().equals(PowerPotion.class)) {
                    powerPot(player, choice);
                } else {
                    rings(player, opponent, choice);
                }
            }
        }
    }

    private static void rings(Gamefigurine player, Gamefigurine opponent, Item choice) {
        if(choice.getClass().equals(StrengthRing.class)) {
            strengthRing(player, choice);

        } else {
            if(choice.getClass().equals(CharmRing.class)) {
                charmRing(player, opponent, (CharmRing) choice);
            } else {
                if(choice.getClass().equals(ShieldRing.class)) {
                    player.setRes(player.getRes() + ((ShieldRing) choice).getMoreRes());
                    player.getItemBackpack().remove(choice);
                }
            }
        }
    }

    private static void charmRing(Gamefigurine player, Gamefigurine opponent, CharmRing choice) {
        if(Math.random() * 1 < 0 + choice.getCharm()) {
            opponent.setfV(opponent.getfV() - choice.getLessenEnemiesFV());
            Log.addMessage(opponent.getName() + " was charmed by " + choice.getItem());
            player.getItemBackpack().remove(choice);
        } else {
            System.out.println(color("red") + "Charm Ring was used but it was unable to charm the Opponent" + color(""));
        }
    }

    private static void strengthRing(Gamefigurine player, Item choice) {
        Log.addMessage(player.getName() + " used a " + choice.getItem());
        player.setcC(player.getcC() + ((StrengthRing) choice).getMoreCC());
        player.setcC(player.getcC() + choice.getWeight());
        player.getItemBackpack().remove(choice);
    }

    private static void powerPot(Gamefigurine player, Item choice) {
        Log.addMessage(player.getName() + " used a " + choice.getItem());
        player.setcC(player.getcC() + ((PowerPotion) choice).getGiveMoreCC());
        player.setcC(player.getcC() + choice.getWeight());
        player.getItemBackpack().remove(choice);
    }

    private static void healthPot(Gamefigurine player, Gamefigurine opponent, Item choice) {
        Log.addMessage(player.getName() + " used a " + choice.getItem());
        player.setlP(player.getlP() + ((HealthPotion) choice).getGiveLP());
        player.setcC(player.getcC() + choice.getWeight());
        giveOutRemainingLP(player, opponent);
        player.getItemBackpack().remove(choice);
    }

    private static void damagePot(Gamefigurine player, Item choice) {
        Log.addMessage(player.getName() + " used a " + choice.getItem());
        player.setfV(player.getfV() + ((DamagePotion) choice).getAddFV());
        player.setcC(player.getcC() + choice.getWeight());
        player.getItemBackpack().remove(choice);
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
        System.out.println(color("orange") + "The Opponent Evaded the attack" + color(""));
        giveOutRemainingLP(player,opponent);
    }

    private static void gotArmor(Gamefigurine player, Gamefigurine opponent) {
        if(opponent.getArmor() != null) {       //Seeing if you have Armor if yes it does the stuff with the probability
            checkIfArmorWillSaveEnemy(player, opponent);
        } else {
            if(Math.random() * 1 < 0 + player.getInstantDeath()) {
                Log.addMessage(opponent.getName() + " Instantly Died");
                System.out.println(color("ice") + "It seems you have perished instantly because death favored your opponent player: " + player.getName() + color(""));
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
                Log.addMessage(opponent.getName() + " Instantly Died");     //Todo: ask if i have to put this in the specific class
                System.out.println(color("ice") + "It seems you have perished instantly because death favored your opponent player: " + opponent.getName() + color(""));
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
        System.out.println(color("orange") + "You missed" + color(""));     //Looks if you had enough accuracy to hit
        giveOutRemainingLP(player, opponent);
    }

    private static void giveOutRemainingLP(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(color("gold") + player.getlP() + color("blue") + " Is the Remaining amount of health on " + player.getName() + color(""));
        System.out.println(color("gold") + opponent.getlP() + color("red") + " Is the Remaining amount of health on " + opponent.getName() + color(""));
    }

    private static void noDamageBcArmor(Gamefigurine player, Gamefigurine opponent) {
        Log.addMessage(opponent.getName() + " Armor saved him from Damage");
        System.out.println(color("orange") + "It seems you hit your opponent bur their armor saved them from taking Damage" + color(""));
        giveOutRemainingLP(player,opponent);
    }

    private static void damageDeal(Gamefigurine player, Gamefigurine opponent) {
        Log.addMessage(player.getName() + " attacked " + opponent.getName());
        opponent.setlP(opponent.getlP() - (player.getfV() / opponent.getRes()));
        giveOutRemainingLP(player, opponent);
    }
}