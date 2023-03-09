package main.java.objektOrientedDesign.roleplay.items;

public class ShieldRing extends Ring{
    private double moreRes;

    public ShieldRing(String item, double weight, double moreRes) {
        super(item, weight);
        this.moreRes = moreRes;
    }

    public double getMoreRes() {
        return moreRes;
    }

    public void setMoreRes(double moreRes) {
        this.moreRes = moreRes;
    }
}
