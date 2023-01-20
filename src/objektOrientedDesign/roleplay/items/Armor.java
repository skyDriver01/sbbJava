package objektOrientedDesign.roleplay.items;

public abstract class Armor extends Item{
    private double noDamage;
    private double res;
    private double slowness;

    public Armor(String item, double weight, double noDamage, double res) {
        super(item, weight);
        this.noDamage = noDamage;
        this.res = res;
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

    public double getSlowness() {
        return slowness;
    }

    public void setSlowness(double slowness) {
        this.slowness = slowness;
    }
}