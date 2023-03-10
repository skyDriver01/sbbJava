package objektOrientedDesign.roleplay.weapons;


public class Club extends CloseRange{
    private static final double CONSTANT_FV = 5;
    private static final double CONSTANT_BV = 5;
    public Club(String weapon, double weight, double accuracy) {
        super(weapon, weight, CONSTANT_FV, accuracy, CONSTANT_BV);
    }
}