package objektOrientedDesign.roleplay.items;

public abstract class Armor extends Item{
    private double slowness;
    private double noDamage;
    private double res;

    public Armor(String item, double weight, double slowness, double noDamage, double res) {
        super(item, weight);
        this.slowness = slowness;
        this.noDamage = noDamage;
        this.res = res;
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