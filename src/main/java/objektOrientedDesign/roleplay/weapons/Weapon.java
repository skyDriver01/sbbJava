package main.java.objektOrientedDesign.roleplay.weapons;


import java.util.ArrayList;
import java.util.List;

public abstract class Weapon {
    private String weapon;
    private double weight;
    private double fV;
    private double accuracy;
    private double bv;
    private static List<Weapon> weapons;

    public Weapon(String weapon, double weight, double fV, double accuracy) {
        this.weapon = weapon;
        this.weight = weight;
        this.fV = fV;
        this.accuracy = accuracy;
    }
    public static List <Weapon> initWeapons() {
        List <Weapon> weaponList = new ArrayList <>();
        weaponList.add(new Club("Club", 4, 0.8));
        weaponList.add(new Sword("Sword", 2, 6, 0.95, 3));
        weaponList.add(new Scythe("Scythe", 3, 7, 1, 2));
        weaponList.add(new Bow("Bow", 1, 5.5, 0.75));
        weaponList.add(new Musket("Musket", 2.5, 8, 1));
        weaponList.add(new ThrowingKnife("Throwing Knives", 0.5, 10, 0.9));
        weapons = weaponList;
        return weaponList;
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

    public double getBv() {
        return bv;
    }

    public void setBv(double bv) {
        this.bv = bv;
    }
}