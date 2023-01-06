package objektOrientedDesign.roleplay.items;

public class DamagePotion extends Potion{
    private double takeLP;

    public DamagePotion(double weight, double takeLP) {
        super(weight);
        this.takeLP = takeLP;
    }

    public double getTakeLP() {
        return takeLP;
    }

    public void setTakeLP(double takeLP) {
        this.takeLP = takeLP;
    }
}
