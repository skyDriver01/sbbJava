package main.java.objektOrientedDesign.roleplay.items;

public class DamagePotion extends Potion {
    private double addFV;

    public DamagePotion(String item, double weight, double takeLP) {
        super(item, weight);
        this.addFV = takeLP;
    }

    public double getAddFV() {
        return addFV;
    }

    public void setAddFV(double addFV) {
        this.addFV = addFV;
    }
}