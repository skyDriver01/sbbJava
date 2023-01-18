package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.Gamefigurine;
import objektOrientedDesign.roleplay.items.*;
import objektOrientedDesign.roleplay.weapons.Weapon;

import java.util.HashMap;

import static objektOrientedDesign.roleplay.TextStuff.*;

public class Fight {
    private static int i = 0;

    public static void startTheFight(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(color("cyan") + "It seems all preparations are done from both ends time to start the fight lets see who gets to start" + color("r"));
        if(playerOne.getSpeed() > playerTwo.getSpeed()) {
            fightOptions(playerOne, playerTwo);                     //Todo: Bugfix if you give up on first round it keeps going for like 2 more rounds
        } else if(playerTwo.getSpeed() > playerOne.getSpeed()) {
            fightOptions(playerTwo, playerOne);
        }
        if(i <= 20) {
            for (i = 0; i <= 20; i++) {
                fightOptions(playerOne, playerTwo);
                i = winningConditions(playerOne, playerTwo, i);
                fightOptions(playerTwo, playerOne);
                i =
                        winningConditions(playerTwo, playerOne, i);     //Todo: yeah the thing with who has more health wins i need to make the method to check that but dont know when to implement it here or how.
            }
        }
    }

    private static int winningConditions(Gamefigurine playerOne, Gamefigurine playerTwo, int i) {
        if(playerOne.getlP() < 0 || playerTwo.getlP() < 0) {
            if(playerOne.getlP() < 0) {
                i = 21;
                System.out.println(blueLine());
                System.out.println(color("purple") + "So the player who chose : " + playerTwo.getName() + " won" + color(""));
                System.out.println(blueLine());
                System.out.println(greenLine());
                System.out.println(color("gold") + playerTwo.getlP() + color("blue") + " Is the Remaining amount of health on " + playerTwo.getName() + color(""));
                System.out.println(color("gold") + playerOne.getlP() + color("red") + " has died with that amount on " + playerOne.getName() + color(""));
                System.out.println(greenLine());
            } else if(playerTwo.getlP() < 0) {              //Todo: small bugfix to be done that is that the winner and loser thing gets printed twice
                i = 21;
                System.out.println(blueLine());
                System.out.println(color("purple") + "So the player who chose : " + playerOne.getName() + " won" + color(""));
                System.out.println(blueLine());
                System.out.println(greenLine());
                System.out.println(color("blue") + playerOne.getlP() + " Is the Remaining amount of health on " + playerOne.getName() + color(""));
                System.out.println(color("red") + playerTwo.getlP() + " has died with that amount on " + playerTwo.getName() + color(""));
                System.out.println(greenLine());
            }
        }
        return i;
    }

    public static void fightOptions(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(color("cyan") + "Seems that the player who chose " + color("purple") + player.getName() + color("cyan") + " Will Be the one to choose their move" + color(""));
        HashMap <Integer, String> chooseNextMove = new HashMap <>();
        System.out.println(greenLine());
        chooseNextMove.put(1, "1: Attack enemy");
        chooseNextMove.put(2, "2: Activate Different Weapon");
        chooseNextMove.put(3, "3: Drop Weapon");
        chooseNextMove.put(4, "4: Use Item");
        chooseNextMove.put(5, "5: Do Nothing");
        chooseNextMove.put(6, "6: Give up");
        for (int i = 1; i <= chooseNextMove.size(); i++) {
            System.out.println(chooseNextMove.get(i));
        }
        System.out.println(greenLine());
        int yourMove = InputIn.nexIntOut("Choose what you would like to do this round");
        switch (yourMove) {
            case 1 -> attackOpponent(player, opponent);

            case 2 -> {
                if(player.getWeaponBackpack() != null) {
                    String changeWeapon =
                            InputIn.nextLineOut(color("cyan") + "what weapon do you wish to activate?" + color(""));
                    for (Weapon weapons : player.getWeaponBackpack()) {
                        System.out.println(weapons.getWeapon());
                        player.setfV(player.getfV() - weapons.getfV());
                        player.setcC(player.getcC() + weapons.getWeight());
                        if(weapons.getWeapon().equals(changeWeapon)) {
                            player.setWeapon(weapons);
                            player.setfV(player.getfV() + weapons.getfV());
                            player.setcC(player.getcC() - weapons.getWeight());
                        } else {
                            System.out.println(color("red") + "seems like you dont have a weapon like that in your inventory" + color(""));
                        }
                    }

                } else {
                    System.out.println(color("red" + "You dont have any other weapons than the one you are using. Well you just wasted your turn." + color("")));
                }
            }
            case 3 -> {
                player.setfV(player.getfV() - player.getWeapon().getfV());
                player.setcC(player.getcC() + player.getWeapon().getWeight());
                player.setWeapon(null);
                player.setfV(1);
            }
            case 4 -> {
                if(player.getItemBackpack() != null) {
                    String useItem = InputIn.nextLineOut(color("cyan") + "What item do you want to use?" + color(""));
                    for (Item items : player.getItemBackpack()) {
                        System.out.println(items.getItem()); //Todo: dk atm maybe make cases for the items or smth idk yet see if the name is equal if so give the stat effects like how to make this usable
                        if(items.getItem().equals(useItem)) {
                            if(items.getClass().equals(DamagePotion.class)) {
                                opponent.setlP(opponent.getlP() - ((DamagePotion) items).getTakeLp());
                                player.setcC(player.getcC() + items.getWeight());
                                player.getItemBackpack().remove(items);
                            } else if(items.getClass().equals(HealthPotion.class)) {
                                player.setlP(player.getlP() + ((HealthPotion) items).getGiveLP());
                                player.setcC(player.getcC() + items.getWeight());
                                player.getItemBackpack().remove(items);
                            } else if(items.getClass().equals(PowerPotion.class)) {
                                player.setcC(player.getcC() + ((PowerPotion) items).getGiveMoreCC());
                                player.setcC(player.getcC() + items.getWeight());
                                player.getItemBackpack().remove(items);
                            }else if(items.getClass().equals(StrenghtRing.class)){
                                player.setcC(player.getcC() + ((StrenghtRing) items).getMoreCC());
                                player.setcC(player.getcC() + items.getWeight());
                                player.getItemBackpack().remove(items);
                            } else if(items.getClass().equals(CharmRing.class)) {
                                if(Math.random() * 1 < 0 + ((CharmRing) items).getCharm()) {
                                    opponent.setfV(opponent.getfV() - ((CharmRing) items).getLessenEnemiesFV());
                                    player.getItemBackpack().remove(items);
                                } else {
                                    System.out.println(color("red") + "Charm Ring was used but it was unable to charm the Opponent" + color(""));
                                    player.getItemBackpack().remove(items);
                                }
                            } else if(items.getClass().equals(ShieldRing.class)) {
                                player.setRes(player.getRes() + ((ShieldRing) items).getMoreRes());
                                player.getItemBackpack().remove(items);
                            }
                        }
                    }
                }
            }
            case 5 -> System.out.println(color("lime") + "Ok seems understandable?" + color(""));
            case 6 -> {
                player.setlP(-1);
                winningConditions(player, opponent, 21);
            }
            default -> System.out.println(color("orange") + "So just do the same as 5? Got it." + color(""));
        }
    }

    private static void attackOpponent(Gamefigurine player, Gamefigurine opponent) {
        //Todo: Also look about how to make the instant death thing in here, so it can occur if the player has it
        checkAccuracyToHit(player, opponent);
    }

    private static void checkAccuracyToHit(Gamefigurine player, Gamefigurine opponent) {
        if(Math.random() * 1 < 0 + player.getAccuracy()) {  //Checks if you could hit your Attack to then check Armor and more
            gotArmor(player, opponent); //Checks if Enemy has Armor On
        } else if(Math.random() * 1 < 0 + opponent.getEvasion()) {        //Looks if the evasion was high enought to evade the attack
            attackEvaded(player, opponent);
        } else {
            attackMissed(player, opponent);
        }
    }

    private static void attackEvaded(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(color("orange") + "The Opponent Evaded the attack" + color(""));
        System.out.println(color("gold") + player.getlP() + color("blue") + " Is the Remaining amount of health on " + player.getName() + color(""));
        System.out.println(color("gold") + opponent.getlP() + color("red") + " Is the Remaining amount of health on " + opponent.getName() + color(""));
    }

    private static void gotArmor(Gamefigurine player, Gamefigurine opponent) {
        if(opponent.getArmor() != null) {       //Seeing if you have Armor if yes it does the stuff with the probability
            checkIfArmorWillSaveEnemy(player, opponent);
        } else {
            damageDeal(player, opponent);
        }
    }

    private static void checkIfArmorWillSaveEnemy(Gamefigurine player, Gamefigurine opponent) {
        if(!(Math.random() * 1 < 0 + opponent.getArmor()                 //Checking the probability of the Armor saving you if not then you deal damage.
                .getNoDamage())) {
            damageDeal(player, opponent);
        } else {
            noDamageBcArmor(player, opponent);  //Armor saves you from the Damage
        }
    }

    private static void attackMissed(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(color("orange") + "You missed" + color(""));     //Looks if you had enough accuracy to hit
        System.out.println(color("gold") + player.getlP() + color("blue") + " Is the Remaining amount of health on " + player.getName() + color(""));
        System.out.println(color("gold") + opponent.getlP() + color("red") + " Is the Remaining amount of health on " + opponent.getName() + color(""));
    }

    private static void noDamageBcArmor(Gamefigurine player, Gamefigurine opponent) {
        System.out.println(color("orange") + "It seems you hit your opponent bur their armor saved them from taking Damage" + color(""));
        System.out.println(color("gold") + player.getlP() + color("blue") + " Is the Remaining amount of health on " + player.getName() + color(""));
        System.out.println(color("gold") + opponent.getlP() + color("red") + " Is the Remaining amount of health on " + opponent.getName() + color(""));
    }

    private static void damageDeal(Gamefigurine player, Gamefigurine opponent) {
        opponent.setlP(opponent.getlP() - (player.getfV() / opponent.getRes()));
        System.out.println(color("gold") + player.getlP() + color("blue") + " Is the Remaining amount of health on " + player.getName() + color(""));
        System.out.println(color("gold") + opponent.getlP() + color("red") + " Is the Remaining amount of health on " + opponent.getName() + color(""));
    }
}