package main.java.objektOrientedDesign.roleplay.items;

public class StrengthRing extends Ring{
    private double moreCC;

    public StrengthRing(String item, double weight, double moreCC) {
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
