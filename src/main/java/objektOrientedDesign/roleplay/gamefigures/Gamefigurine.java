package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.items.Armor;
import objektOrientedDesign.roleplay.items.Item;
import objektOrientedDesign.roleplay.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class Gamefigurine {

    private String name;
    private double lP;
    private double cC;  //CC is Carrying Capacity
    private double fV;  //FV is Fighting Value
    private double res;  // res is resistance
    private Weapon weapon;
    private Armor armor;
    private Item item;
    private List <Item> itemBackpack = new ArrayList<>();

    private List<Weapon> weaponBackpack = new ArrayList <>();
    private double instantDeath;
    private double amount;
    private double mV;
    private double speed;  //Speed is the initiative value
    private double accuracy;
    private double evasion;
    private static List<Gamefigurine> gameFigurines;

    public Gamefigurine(String name, double lP, double cC, double fV, double res, double speed,
                        double accuracy,
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
    public static List <Gamefigurine> initGameFigurines() {
        final double MIN_FV = 0.9;
        final double MAX_FV = 1.1;
        final double MIN_RES = 1;
        final double MAX_RES = 1.3;
        final double MIN_SPEED = 1;
        final double MAX_SPEED = 2;
        List <Gamefigurine> characters = new ArrayList <>();
        characters.add(new Dwarf("Dwarf", 80, 14, ((Math.random() * (MAX_FV - MIN_FV)) + MIN_FV), ((Math.random() * (MAX_RES - MIN_RES)) + MIN_RES), ((Math.random() * (MAX_SPEED - MIN_SPEED)) + MIN_SPEED), 0.5, 0.3));
        characters.add(new Elven("Elven", 110, 12, ((Math.random() * (MAX_FV - MIN_FV)) + MIN_FV), ((Math.random() * (MAX_RES - MIN_RES)) + MIN_RES), ((Math.random() * (MAX_SPEED - MIN_SPEED)) + MIN_SPEED), 0.75, 0.09));
        characters.add(new Human("Human", 100, 15, ((Math.random() * (MAX_FV - MIN_FV)) + MIN_FV), ((Math.random() * (MAX_RES - MIN_RES)) + MIN_RES), ((Math.random() * (MAX_SPEED - MIN_SPEED)) + MIN_SPEED), 0.8, 0.07));
        characters.add(new Orc("Orc", 105, 17, ((Math.random() * (MAX_FV - MIN_FV)) + MIN_FV), ((Math.random() * (MAX_RES - MIN_RES)) + MIN_RES), ((Math.random() * (MAX_SPEED - MIN_SPEED)) + MIN_SPEED), 0.75, 0.05, false,105));
        characters.add(new SCP_049("SCP_049", 90, 18, ((Math.random() * (MAX_FV - MIN_FV)) + MIN_FV), ((Math.random() * (MAX_RES - MIN_RES)) + MIN_RES), ((Math.random() * (MAX_SPEED - MIN_SPEED)) + MIN_SPEED), 0.9, 0.02, 0.01));
        characters.add(new Troll("Troll", 115, 20, ((Math.random() * (MAX_FV - MIN_FV)) + MIN_FV), ((Math.random() * (MAX_RES - MIN_RES)) + MIN_RES), ((Math.random() * (MAX_SPEED - MIN_SPEED)) + MIN_SPEED), 0.5, 0));
        characters.add(new Goblin("Goblin", 85, 13, ((Math.random() * (MAX_FV - MIN_FV)) + MIN_FV), ((Math.random() * (MAX_RES - MIN_RES)) + MIN_RES), ((Math.random() * (MAX_SPEED - MIN_SPEED)) + MIN_SPEED), 0.5, 0.08));
        gameFigurines = characters;
        return characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /** @return LP like in most games stands for Life Points  */
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

    public double setfV(double fV) {
        this.fV = fV;
        return fV;
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

    public List <Weapon> getWeaponBackpack() {
        return weaponBackpack;
    }

    public void setWeaponBackpack(List <Weapon> weaponBackpack) {
        this.weaponBackpack = weaponBackpack;
    }


    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public List <Item> getItemBackpack() {
        return itemBackpack;
    }

    public void setItemBackpack(List <Item> itemBackpack) {
        this.itemBackpack = itemBackpack;
    }

    public double getmV() {
        return ((Math.random() * (2.5 - 1)) + 1);
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getInstantDeath() {
        return instantDeath;
    }

    public double setInstantDeath(double instantDeath) {
        this.instantDeath = instantDeath;
        return instantDeath;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}