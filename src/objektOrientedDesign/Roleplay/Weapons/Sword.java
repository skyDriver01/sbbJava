package objektOrientedDesign.Roleplay.Weapons;

public class Sword extends CloseRange{
   private double bleeding;

    public Sword(double weight, double fV, double accuracy, double bV, double bleeding) {
        super(weight, fV, accuracy, bV);
        this.bleeding = bleeding;
    }

    public double getBleeding() {
        return bleeding;
    }

    public void setBleeding(double bleeding) {
        this.bleeding = bleeding;
    }
}
