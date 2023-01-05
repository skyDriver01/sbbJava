package objektOrientedDesign.Roleplay.Items;

public class Armor {
    double weight;
    double slowness;
    double noDamage;
    double res;

    public Armor(double weight, double slowness, double noDamage, double resistance) {
        this.weight = weight;
        this.slowness = slowness;
        this.noDamage = noDamage;
        this.res = resistance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSlowness() {
        return slowness;
    }

    public void setSlowness(double slowness) {
        this.slowness = slowness;
    }

    public double getNoDamage() {
        return noDamage;
    }

    public void setNoDamage(double noDamage) {
        this.noDamage = noDamage;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}