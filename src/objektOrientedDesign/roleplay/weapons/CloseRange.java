package objektOrientedDesign.roleplay.weapons;

public class CloseRange extends Weapon {
    private double bV;

    public CloseRange(double weight, double fV, double accuracy, double bV) {
        super(weight, fV, accuracy);
        this.bV = bV;
    }

    public double getbV() {
        return bV;
    }

    public void setbV(double bV) {
        this.bV = bV;
    }
}