package objektOrientedDesign.roleplay.items;

public abstract class Potion extends Item{
    private double takeLp;
    private double addFV;
    public Potion(String item, double weight) {
        super(item, weight);
    }

    public double getTakeLp() {
        return takeLp;
    }

    public void setTakeLp(double takeLp) {
        this.takeLp = takeLp;
    }

    public double getAddFV() {
        return addFV;
    }

    public void setAddFV(double addFV) {
        this.addFV = addFV;
    }
}
