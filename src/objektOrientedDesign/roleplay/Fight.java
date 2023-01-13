package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.Gamefigurine;

import java.util.HashMap;

import static objektOrientedDesign.roleplay.TextStuff.*;

public class Fight {
    private static int i = 0;


    public static void startTheFight(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println(color ("cyan") + "It seems all preparations are done from both ends time to start the fight lets see who gets to start" + color("r"));
        if(playerOne.getSpeed() > playerTwo.getSpeed()) {
            fightOptions(playerOne, playerTwo);
        } else if(playerTwo.getSpeed() > playerOne.getSpeed()) {
            fightOptions(playerTwo, playerOne);
        }
        if(i <= 20) {
            for (i = 0; i <= 20; i++) {
                fightOptions(playerOne, playerTwo);
                i = winningConditions(playerOne, playerTwo, i);
                fightOptions(playerTwo, playerOne);
                i = winningConditions(playerTwo, playerOne, i);
            }
        }
    }

    private static int winningConditions(Gamefigurine playerOne, Gamefigurine playerTwo, int i) {
        if(playerOne.getlP() < 0 || playerTwo.getlP() < 0) {
            if(playerOne.getlP() < 0) {
                i = 21;
                System.out.println(blueLine());
                System.out.println(color("purple") + "So the player who chose : " + playerTwo.getName() + " won" + color("r"));
                System.out.println(blueLine());
                System.out.println(greenLine());
                System.out.println(color("blue") + playerTwo.getlP() + " Is the Remaining amount of health on " + playerTwo.getName() + color("r"));
                System.out.println(color("red") + playerOne.getlP() + " has died with that amount on " + playerOne.getName() + color("r"));     //r = reset
                System.out.println(greenLine());

            } else if(playerTwo.getlP() < 0) {              //Todo: small bugfix to be done that is that the winner and loser thing gets printed twice
                i = 21;
                System.out.println(blueLine());
                System.out.println(color("purple") + "So the player who chose : " + playerOne.getName() + " won" + color("r"));
                System.out.println(blueLine());
                System.out.println(greenLine());
                System.out.println(color("blue") + playerOne.getlP() + " Is the Remaining amount of health on " + playerOne.getName() + color("r"));
                System.out.println(color("red") + playerTwo.getlP() + " has died with that amount on " + playerTwo.getName() + color("r"));
                System.out.println(greenLine());
            }
        }
        return i;
    }


    public static void fightOptions(Gamefigurine player, Gamefigurine opponent) {
        System.out.println( color("cyan") + "Seems that the player who chose " + color("purple") + player.getName() + color("cyan") +" Will Be the one to choose their move" + color("r"));
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
                System.out.println("what weapon do you wish to activate?");
                //TOdo find a list to make a stream or for each
                //TODO: When making this lookout for the bug where the character activates other weapon but the last weapons effects still stay bc that will be broken
            }
            case 3 -> {
                player.setcC(player.getcC() + player.getWeapon().getWeight());
                player.setWeapon(null);

            }
            case 4 -> {
                //TODO : is supposed to take up the turn
            }
            case 5 ->
                    System.out.println("Ok seems understandable?");
            case 6 -> {
                player.setlP(-1);
                winningConditions(player, opponent, 21);
            }
            default -> System.out.println("So just do the same as 4? Got it.");
        }
    }

    private static void attackOpponent(Gamefigurine player, Gamefigurine opponent) {
        if(Math.random() * 1 < 0 + player.getAccuracy()) {
            if(opponent.getArmor() != null) {
                //Also look about how to make the instant death thing in here, so it can occur if the player has it
                if(!(Math.random() * 1 < 0 + opponent
                        .getArmor()
                        .getNoDamage())) {
                    opponent.setlP(opponent.getlP() - (player.getfV() / opponent.getRes()));
                    System.out.println(color("blue") + player.getlP() + " Is the Remaining amount of health on " + player.getName() + color("r"));
                    System.out.println(color("red") + opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName() + color("r"));
                } else {
                    System.out.println(color("orange") + "It seems you hit your opponent bur their armor saved them from taking Damage" + color("r"));
                    System.out.println(color("blue") + player.getlP() + " Is the Remaining amount of health on " + player.getName() + color("r"));
                    System.out.println(color("red") + opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName() + color("r"));
                }
            } else {
                opponent.setlP(opponent.getlP() - (player.getfV() / opponent.getRes()));
                System.out.println(color("blue") + player.getlP() + " Is the Remaining amount of health on " + player.getName() + color("r"));
                System.out.println(color("red") + opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName() + color("r"));
            }
        } else if(Math.random() * 1 < 0 + opponent.getEvasion()) {
            System.out.println(color("orange") + "The Opponent Evaded the attack" + color("r"));
            System.out.println(color("blue") + player.getlP() + " Is the Remaining amount of health on " + player.getName() + color("r"));
            System.out.println(color("red") + opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName() + color("r"));
        } else {
            System.out.println(color("orange") + "You missed" + color("r"));
            System.out.println(color("blue") + player.getlP() + " Is the Remaining amount of health on " + player.getName() + color("r"));
            System.out.println(color("red") + opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName() + color("r"));
        }
    }
}