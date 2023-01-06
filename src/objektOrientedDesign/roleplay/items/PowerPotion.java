package objektOrientedDesign.roleplay.items;

public class PowerPotion extends Potion {
    private double giveMoreCC;

    public PowerPotion(double weight, double giveMoreCC) {
        super(weight);
        this.giveMoreCC = giveMoreCC;
    }

    public double getGiveMoreCC() {
        return giveMoreCC;
    }

    public void setGiveMoreCC(double giveMoreCC) {
        this.giveMoreCC = giveMoreCC;
    }
}