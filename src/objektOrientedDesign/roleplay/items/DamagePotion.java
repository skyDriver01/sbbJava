package objektOrientedDesign.roleplay.items;

public class DamagePotion extends Potion{
    private double takeLP;

    public DamagePotion(String item, double weight, double takeLP) {
        super(item, weight);
        this.takeLP = takeLP;
    }
    public double getTakeLP() {
        return ((Math.random() * (15 - 5)) + 5);
    }

    public void setTakeLP(double takeLP) {
        this.takeLP = takeLP;
    }
}
