package objektOrientedDesign.Roleplay.Items;

public class Armor extends Item{
    private double slowness;
    private double noDamage;
    private double res;

    public Armor(double weight, double slowness, double noDamage, double resistance) {
        super(weight);
        this.slowness = slowness;
        this.noDamage = noDamage;
        this.res = resistance;
    }

    public double getSlowness() {
        return slowness;
    }

    public void setSlowness(double slowness) {
        this.slowness = slowness;
    }

    public double getNoDamage() {
        return noDamage;
    }

    public void setNoDamage(double noDamage) {
        this.noDamage = noDamage;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}