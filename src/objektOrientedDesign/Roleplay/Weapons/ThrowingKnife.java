package objektOrientedDesign.Roleplay.Weapons;

public class ThrowingKnife extends LongRange {
    int amountOfKnives;

    public ThrowingKnife(double weight, double fV, double accuracy, int amountOfKnives) {
        super(weight, fV, accuracy);
        this.amountOfKnives = amountOfKnives;
    }

    public int getAmountOfKnives() {
        return amountOfKnives;
    }

    public void setAmountOfKnives(int amountOfKnives) {
        this.amountOfKnives = amountOfKnives;
    }
}