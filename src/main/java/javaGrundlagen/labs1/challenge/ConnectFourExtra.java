package javaGrundlagen.labs1.challenge;

public class ConnectFourExtra implements ConnectFourCheck {
    public static void main(String[] args) {
    }
    @Override
    public String checkWin(String[][] board) {
        int counter = 0;
        String[] checkForFour = new String[3];
        String[] checkForDiagonals = new String[0];
        board = new String[][]{
                {" "," "," "," "," "," "," "},
                {" "," "," "," "," "," "," "},
                {" "," "," ","x"," "," "," "},
                {" "," ","x","x","o","x"," "},
                {" ","o","o","o","x","o"," "},
                {" ","x","x","o","x","o","o"}
        };
        for (int i = 0; i < board.length; i++){
            for (int j = 1; j < board.length; j++){
                if (checkForFour[j].equals(checkForDiagonals[i])){
                    System.out.println("It kinda woRK I THinKE");
                }
            }
        }

        return " " + "X" + "O";
    }
}
