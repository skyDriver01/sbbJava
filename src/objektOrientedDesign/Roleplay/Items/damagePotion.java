package objektOrientedDesign.Roleplay.Items;

public class damagePotion extends Potion{
    private double takeLP;

    public damagePotion(double weight, double takeLP) {
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
