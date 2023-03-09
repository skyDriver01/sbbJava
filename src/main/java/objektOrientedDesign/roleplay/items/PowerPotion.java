package main.java.objektOrientedDesign.roleplay.items;

public class PowerPotion extends Potion {
    private double giveMoreCC;

    public PowerPotion(String item, double weight, double giveMoreCC) {
        super(item, weight);
        this.giveMoreCC = giveMoreCC;
    }

    public double getGiveMoreCC() {
        return giveMoreCC;
    }

    public void setGiveMoreCC(double giveMoreCC) {
        this.giveMoreCC = giveMoreCC;
    }
}