package objektOrientedDesign.roleplay.items;

public class HealthPotion extends Potion{
    private double giveLP;

    public HealthPotion(double weight, double giveLP) {
        super(weight);
        this.giveLP = giveLP;
    }

    public double getGiveLP() {
        return giveLP;
    }

    public void setGiveLP(double giveLP) {
        this.giveLP = giveLP;
    }
}