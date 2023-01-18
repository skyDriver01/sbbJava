package objektOrientedDesign.roleplay.items;

public class Potion extends Item{
    private double takeLp;
    public Potion(String item, double weight) {
        super(item, weight);
    }

    public double getTakeLp() {
        return takeLp;
    }

    public void setTakeLp(double takeLp) {
        this.takeLp = takeLp;
    }
}
