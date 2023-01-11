package objektOrientedDesign.roleplay.weapons;

public class Weapon {
    private String weapon;
    private double weight;
    private double fV;
    private double accuracy;
    private double amount;

    public Weapon(String weapon, double weight, double fV, double accuracy) {
        this.weapon = weapon;
        this.weight = weight;
        this.fV = fV;
        this.accuracy = accuracy;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
