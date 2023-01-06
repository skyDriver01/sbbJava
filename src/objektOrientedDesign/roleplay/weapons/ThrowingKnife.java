package objektOrientedDesign.roleplay.weapons;

public class ThrowingKnife extends LongRange {
    private int amountOfKnives;

    public ThrowingKnife(String weapon, double weight, double fV, double accuracy, int amountOfKnives) {
        super(weapon, weight, fV, accuracy);
        this.amountOfKnives = amountOfKnives;
    }

    public int getAmountOfKnives() {
        return amountOfKnives;
    }

    public void setAmountOfKnives(int amountOfKnives) {
        this.amountOfKnives = amountOfKnives;
    }
}