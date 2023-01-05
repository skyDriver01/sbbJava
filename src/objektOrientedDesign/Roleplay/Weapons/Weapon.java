package objektOrientedDesign.Roleplay.Weapons;

public class Weapon {
    double weight;
    double fV;
    double accuracy;

    public Weapon(double weight, double fV, double accuracy) {
        this.weight = weight;
        this.fV = fV;
        this.accuracy = accuracy;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getfV() {
        return fV;
    }

    public void setfV(double fV) {
        this.fV = fV;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
}
