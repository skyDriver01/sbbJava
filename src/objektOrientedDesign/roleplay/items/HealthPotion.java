package objektOrientedDesign.roleplay.items;

public class HealthPotion extends Potion{
    private double giveLP;

    public HealthPotion(String item, double weight, double giveLP) {
        super(item, weight);
        this.giveLP = giveLP;
    }

    public double getGiveLP() {
        return giveLP;
    }

    public void setGiveLP(double giveLP) {
        this.giveLP = giveLP;
    }
}
