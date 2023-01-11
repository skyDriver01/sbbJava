package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.Gamefigurine;

import java.util.HashMap;

public class Fight {

    public static void startTheFight(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println("It seems all preparations are done from both ends time to start the fight lets see who gets to start");
        if(playerOne.getSpeed() > playerTwo.getSpeed()) {
            fightOptions(playerOne);            // Todo: Find a better way for this. Not for the random speed thats good but for the 2 player to then get chosen who plays after who with the 20 round max rule.
        } else if(playerTwo.getSpeed() > playerOne.getSpeed()) {
            fightOptions(playerTwo);
        }
    }

    public static void fightOptions(Gamefigurine player) {
        System.out.println("Seems that the player who chose " + player.getName() + " Will Be the one to choose their move");
        HashMap <Integer, String> chooseNextMove = new HashMap <>();
        chooseNextMove.put(1, "1: Attack enemy");
        chooseNextMove.put(2, "2: Activate Different Weapon");
        chooseNextMove.put(3, "3: Use Item");
        chooseNextMove.put(4, "4: Do Nothing");
        chooseNextMove.put(5, "5: Give up");
        for (int i = 1; i <= chooseNextMove.size(); i++) {
            System.out.println(chooseNextMove.get(i));
        }
        int yourMove = InputIn.nexIntOut("Choose what you would like to do this round");
        switch (yourMove) {
            case 1 -> {
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> System.out.println("Ok seems understandable?");
            case 5 -> System.exit(0);   //When there is the possibility with the winner and the upper to-do is changed this to also say who won due to the enemy giving up
            default -> System.out.println("So just do the same as 4? Got it.");
        }
    }
}