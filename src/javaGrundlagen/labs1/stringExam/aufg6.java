package javaGrundlagen.labs1.stringExam;

public class aufg6 {
    public static void main(String[] args) {
        String endOfTheWorld =
                "That's great, it starts with an earthquake " +
                        "Birds and snakes, and aeroplanes " +
                        "And Lenny Bruce is not afraid " +
                        "Eye of a hurricane, listen to yourself churn " +
                        "World serves its own needs " +
                        "Don't mis-serve your own needs " +
                        "Speed it up a notch, speed, grunt, no, strength " +
                        "The ladder starts to clatter " +
                        "With a fear of height, down, height " +
                        "Wire in a fire, represent the seven games " +
                        "And a government for hire and a combat site " +
                        "Left her, wasn't coming in a hurry " +
                        "With the Furies breathing down your neck " +
                        "Team by team, reporters baffled, trumped, tethered, cropped " +
                        "Look at that low plane, fine, then " +
                        "Uh oh, overflow, population, common group " +
                        "But it'll do, save yourself, serve yourself " +
                        "World serves its own needs, listen to your heart bleed " +
                        "Tell me with the Rapture and the reverent in the right, right " +
                        "You vitriolic, patriotic, slam fight, bright light " +
                        "Feeling pretty psyched " +
                        "It's the end of the world as we know it " +
                        "It's the end of the world as we know it " +
                        "It's the end of the world as we know it and I feel fine " +
                        "Six o'clock, T.V. hour, don't get caught in foreign tower " +
                        "Slash and burn, return, listen to yourself churn " +
                        "Lock him in uniform, book burning, bloodletting " +
                        "Every motive escalate, automotive incinerate " +
                        "Light a candle, light a motive, step down, step down " +
                        "Watch your heel crush, crush, uh oh " +
                        "This means no fear, cavalier, renegade and steering clear " +
                        "A tournament, a tournament, a tournament of lies " +
                        "Offer me solutions, offer me alternatives and I decline " +
                        "It's the end of the world as we know it (I had some time alone) " +
                        "It's the end of the world as we know it (I had some time alone) " +
                        "It's the end of the world as we know it and I feel fine (time I had some time alone) " +
                        "I feel fine (I feel fine) " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it and I feel fine (time I had some time alone) " +
                        "The other night I drifted nice continental drift divide " +
                        "Mountains sit in a line, Leonard Bernstein " +
                        "Leonid Brezhnev, Lenny Bruce and Lester Bangs " +
                        "Birthday party, cheesecake, jellybean, boom " +
                        "You symbiotic, patriotic, slam but neck, right, right " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it and I feel fine (time I had some time alone) " +
                        "It's the end of the world as we know it " +
                        "It's the end of the world as we know it " +
                        "It's the end of the world as we know it and I feel fine (time I had some time alone) " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it and I feel fine (time I had some time alone) " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it (time I had some time alone) " +
                        "It's the end of the world as we know it and I feel fine (time I had some time alone)";
        tabPrint(countSameWord(endOfTheWorld));
    }
    public static String[][] countSameWord(String text) {
        char[] charArray = text.toUpperCase().toCharArray();
        String [][] getTwoDimArray = new String[59][1000];
        int counter = 0;
        int maxCounter = 0;
        for (int i = 32; i < 91; i++ ){
            char test = (char) i;
            getTwoDimArray[maxCounter][0] = String.valueOf(test) ;
            maxCounter++;
        }
        int[] arrays = new int[100];
        for (int i = 0; i < text.length(); i++)
            for (int j = 32; j < 91; j++){
                if (charArray[i] == j){
                    arrays[j] ++;
                    getTwoDimArray[j-32][arrays[j]]= String.valueOf(i);
                }
            }
        return getTwoDimArray;
    }
    public static void tabPrint(String[][] tabelle){
        for (int i = 0; i < tabelle.length; i++){
            System.out.println("");
            for (int j = 0; j < tabelle[i].length; j++){
                if (tabelle[i][j] != null) {
                    System.out.print(tabelle[i][j] + " ");
                }
            }

        }
    }
}
