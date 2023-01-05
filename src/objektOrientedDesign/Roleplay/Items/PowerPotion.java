package objektOrientedDesign.Roleplay.Items;

public class PowerPotion extends Potion {
    double giveMoreCC;

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
