package objektOrientedDesign.roleplay.weapons;


public abstract class CloseRange extends Weapon {
    private double bV;

    public CloseRange(String weapon, double weight, double fV, double accuracy, double bV) {
        super(weapon, weight, fV, accuracy);
        this.bV = bV;
    }

    public double getbV() {
        return bV;
    }

    public void setbV(double bV) {
    }
    @Override
    public double getfV(){
        return super.getfV() + (getbV() / 2);
    }
}