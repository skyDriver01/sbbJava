package objektOrientedDesign.roleplay.items;

public class StrenghtRing extends Ring{
    private double moreCC;

    public StrenghtRing(String item, double weight, double moreCC) {
        super(item, weight);
        this.moreCC = moreCC;
    }

    public double getMoreCC() {
        return moreCC;
    }

    public void setMoreCC(double moreCC) {
        this.moreCC = moreCC;
    }
}
