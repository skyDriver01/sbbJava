package objektOrientedDesign.Roleplay.Items;

public class SchieldRing extends Ring{
    private double moreRes;

    public SchieldRing(double weight, double moreRes) {
        super(weight);
        this.moreRes = moreRes;
    }

    public double getMoreRes() {
        return moreRes;
    }

    public void setMoreRes(double moreRes) {
        this.moreRes = moreRes;
    }
}
