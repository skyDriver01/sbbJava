package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.Gamefigurine;

import java.util.HashMap;

public class Fight {

    public static void startTheFight(Gamefigurine playerOne, Gamefigurine playerTwo) {
        System.out.println("It seems all preparations are done from both ends time to start the fight lets see who gets to start");
        if(playerOne.getSpeed() > playerTwo.getSpeed()) {
            fightOptions(playerOne, playerTwo);            // Todo: Find a better way for this. Not for the random speed thats good but for the 2 player to then get chosen who plays after who with the 20 round max rule.
        } else if(playerTwo.getSpeed() > playerOne.getSpeed()) {
            fightOptions(playerTwo, playerOne);
        }
        for (int i = 0; i <= 20 ; i++) {
            fightOptions(playerOne, playerTwo);
            fightOptions(playerTwo, playerOne);
            if(playerOne.getlP() < 0 || playerTwo.getlP() < 0){
                if(playerOne.getlP() < 0){
                    System.out.println("Player Two won. So the player who chose : " + playerTwo.getName());
                    System.out.println(playerTwo.getlP() + " Is the Remaining amount of health on " + playerTwo.getName());
                    System.out.println(playerOne.getlP() + " has died with that amount " + playerOne.getName());

                } else if(playerTwo.getlP() < 0){
                    System.out.println("Player One won. So the player who chose : " + playerOne.getName());
                    System.out.println(playerOne.getlP() + " Is the Remaining amount of health on " + playerOne.getName());
                    System.out.println(playerTwo.getlP() + " has died with that amount " + playerTwo.getName());
                }
            }
        }
    }

    public static void fightOptions(Gamefigurine player, Gamefigurine opponent) {
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
            case 1 -> attackOpponent(player, opponent);

            case 2 -> {
                //TODO: When making this lookout for the bug where i activate other weapon but the last weapons effects still stay bc that will be broken
            }
            case 3 -> {
                //TODO : is supposed to take up the turn
            }
            case 4 ->
                    System.out.println("Ok seems understandable?");       //Maybe make small Easter egg that if done 3 times you will get 4xFV
            case 5 ->
                    System.exit(0);   //When there is the possibility with the winner and the upper to-do is changed this to also say who won due to the enemy giving up
            default -> System.out.println("So just do the same as 4? Got it.");
        }
    }

    private static void attackOpponent(Gamefigurine player, Gamefigurine opponent) {
        if(Math.random() * 1 < 0 + player.getAccuracy()) {
            if(opponent.getArmor() != null) {      //some sort of bug is here that says armor is null find option to get this fixed so yk no damage?
                //Also look about how to make the instant death thing in here, so it can occur if the player has it
                //Seems like the problem is when you have no armor that it says it won't work so mhm.
                if(!(Math.random() * 1 < 0 + opponent.getArmor().getNoDamage())) {
                    opponent.setlP(opponent.getlP() - (player.getfV() / opponent.getRes()));
                    System.out.println(player.getlP() + " Is the Remaining amount of health on " + player.getName());
                    System.out.println(opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName());
                } else {
                    System.out.println("It seems you hit your opponent bur their armor saved them from taking Damage");
                    System.out.println(player.getlP() + " Is the Remaining amount of health on " + player.getName());
                    System.out.println(opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName());
                }
            } else {
                opponent.setlP(opponent.getlP() - (player.getfV() / opponent.getRes()));
                System.out.println(player.getlP() + " Is the Remaining amount of health on " + player.getName());
                System.out.println(opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName());
            }
        } else if(Math.random() * 1 < 0 + opponent.getEvasion()) {
            System.out.println("The Opponent Evaded the attack");
            System.out.println(player.getlP() + " Is the Remaining amount of health on " + player.getName());
            System.out.println(opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName());
        } else {
            System.out.println("You missed");
            System.out.println(player.getlP() + " Is the Remaining amount of health on " + player.getName());
            System.out.println(opponent.getlP() + " Is the Remaining amount of health on " + opponent.getName());
        }
    }
}