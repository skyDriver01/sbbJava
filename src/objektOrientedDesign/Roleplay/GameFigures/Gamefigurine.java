package objektOrientedDesign.Roleplay.GameFigures;

import objektOrientedDesign.Roleplay.Items.Armor;
import objektOrientedDesign.Roleplay.Weapons.Weapon;

public class Gamefigurine {
    private String name;
    private double lP;  // LP like in most games stands for Life Points
    private double cC;  //CC is Carrying Capacity
    private double fV;  //FV is Fighting Value
    private double res;  // res is resistance
    private Weapon weapon;
    private Armor armor;
    private double mV;
    private double speed;  //Speed is the initiative value
    private double accuracy;
    private double evasion;

    public Gamefigurine(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                        double evasion) {
        this.name = name;
        this.lP = lP;
        this.cC = cC;
        this.fV = fV;
        this.res = res;
        this.speed = speed;
        this.accuracy = accuracy;
        this.evasion = evasion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getlP() {
        return lP;
    }

    public void setlP(double lP) {
        this.lP = lP;
    }

    public double getcC() {
        return cC;
    }

    public void setcC(double cC) {
        this.cC = cC;
    }

    public double getfV() {
        return fV;
    }

    public void setfV(double fV) {
        this.fV = fV;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getEvasion() {
        return evasion;
    }

    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }

    public double getmV() {
        return (Math.random() * (2 - 1)) + 1;
    }
}