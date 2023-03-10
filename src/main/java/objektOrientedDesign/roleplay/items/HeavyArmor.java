package objektOrientedDesign.roleplay.items;

public class HeavyArmor extends Armor{
    private double slowness;

    public HeavyArmor(String item, double weight, double noDamage, double res, double slowness) {
        super(item, weight, noDamage, res);
        this.slowness = slowness;
    }

    public double getSlowness() {
        return slowness;
    }

    public void setSlowness(double slowness) {
        this.slowness = slowness;
    }
}