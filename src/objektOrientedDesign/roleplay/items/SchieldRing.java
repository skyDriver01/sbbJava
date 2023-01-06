package objektOrientedDesign.roleplay.items;

public class SchieldRing extends Ring{
    private double moreRes;

    public SchieldRing(String item, double weight, double moreRes) {
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
