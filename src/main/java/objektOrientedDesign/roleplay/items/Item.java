package main.java.objektOrientedDesign.roleplay.items;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    private String item;
    private double weight;
    private static List<Item> items;

    public Item(String item, double weight) {
        this.item = item;
        this.weight = weight;
    }

    public static List <Item> initItems() {
        List <Item> itemsList = new ArrayList <>();
        itemsList.add(new HealthPotion("Health Potion", 2, ((Math.random() * (20 - 5)) + 5)));        //Random Amount of Enemy Health Taken
        itemsList.add(new PowerPotion("Power Potion", 2, 5));
        itemsList.add(new DamagePotion("Damage Potion", 6, ((Math.random() * (10 - 5)) + 5)));       //Random Amount of Health gain
        itemsList.add(new ShieldRing("Shield Ring", 1.5, ((Math.random() * (2 - 0.75)) + 0.75)));  //Random Amount of resistance gain
        itemsList.add(new StrengthRing("Strength Ring", 1.5, 5));
        itemsList.add(new CharmRing("Charm Ring", 3, ((Math.random() * (2 - 0.45)) + 0.45), 0.5));   //Almost like Resistance only difference is the enemies FV gets lower  // Charm = the Chances that it Works
        itemsList.add(new LightArmor("Light Armor", 3, 0.3, 0.1));
        itemsList.add(new HeavyArmor("Heavy Armor", 6.5, 0.75, 0.25, 1));
        items = itemsList;
        return itemsList;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}