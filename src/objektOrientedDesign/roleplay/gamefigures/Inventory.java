package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;
import objektOrientedDesign.roleplay.items.Armor;
import objektOrientedDesign.roleplay.items.Item;
import objektOrientedDesign.roleplay.weapons.Weapon;

import static objektOrientedDesign.roleplay.TextStuff.*;
import static objektOrientedDesign.roleplay.TextStuff.ANSI_MAGENTA;

public class Inventory {
    public static void addItemToInv(Item item,
                                     int player) {
        if(Gamefigurine.initGameFigurines().get(player).getcC() >= item.getWeight()) {
            Gamefigurine.initGameFigurines().get(player).getItemBackpack().add(item);
            Gamefigurine.initGameFigurines().get(player).setcC(Gamefigurine.initGameFigurines().get(player)
                                                                           .getcC() - item.getWeight());
            Log.addMessage(Gamefigurine.initGameFigurines().get(player)
                                       .getName() + " added this weapon to his inventory: " + item.getItem());
        } else {
            System.out.println(ANSI_RED + "That Item is to Heavy for you" + ANSI_RESET);
            Log.addMessage(Gamefigurine.initGameFigurines().get(player)
                                       .getName() + " had no more CC to get another Item");
        }
    }
    public static void equipOrAddArmor(Armor armor, int player) {
        if(Gamefigurine.initGameFigurines().get(player).getArmor() == null) {
            Gamefigurine.initGameFigurines().get(player).setArmor(armor);
            if(Gamefigurine.initGameFigurines().get(player).getArmor() != null) {
                Gamefigurine.initGameFigurines().get(player)
                                  .setRes(Gamefigurine.initGameFigurines().get(player).getArmor().getRes() + armor.getRes());
                Gamefigurine.initGameFigurines().get(player)
                                  .setSpeed(Gamefigurine.initGameFigurines().get(player).getSpeed() - armor.getSlowness());
                Gamefigurine.initGameFigurines().get(player).setcC(Gamefigurine.initGameFigurines().get(player).getcC() - armor.getWeight());
                Log.addMessage(Gamefigurine.initGameFigurines().get(player)
                                                 .getName() + " has equipped this Armor: " + armor.getItem());
            }
        } else {
            addArmorToInv(armor, player);
        }
    }
    private static void addArmorToInv(Armor armor, int player) {
        Gamefigurine.initGameFigurines().get(player).getItemBackpack().add(armor);
        Gamefigurine.initGameFigurines().get(player).setcC(Gamefigurine.initGameFigurines().get(player).getcC() - armor.getWeight());
        Log.addMessage(Gamefigurine.initGameFigurines().get(player)
                                         .getName() + " added this Armor to his inventory " + armor.getItem());
    }
    public static void equipWeapon(Weapon weapon, int player) {
        if(Gamefigurine.initGameFigurines().get(player).getcC() >= weapon.getWeight()) {
            if(Gamefigurine.initGameFigurines().get(player)
                                 .getWeapon() == null) {    //Checks if i don't already have a weapon if not then the first weapon auto equips
                Gamefigurine.initGameFigurines().get(player).setWeapon(weapon);
                Gamefigurine.initGameFigurines().get(player).setcC(Gamefigurine.initGameFigurines().get(player).getcC() - weapon.getWeight());
                Gamefigurine.initGameFigurines().get(player).setfV(Gamefigurine.initGameFigurines().get(player).getfV() + weapon.getfV());
                Log.addMessage(Gamefigurine.initGameFigurines().get(player)
                                                 .getName() + " equipped this weapon first: " + weapon.getWeapon());
            } else {
                Gamefigurine.initGameFigurines().get(player).getWeaponBackpack()
                                  .add(weapon);     //Weapon gets added to your inventory for later activation if you wish
                Gamefigurine.initGameFigurines().get(player).setcC(Gamefigurine.initGameFigurines().get(player).getcC() - weapon.getWeight());
                Log.addMessage(Gamefigurine.initGameFigurines().get(player)
                                                 .getName() + " added this weapon to his inventory: " + weapon.getWeapon());
            }
        } else {
            System.out.println(ANSI_RED + "That Item is to Heavy for you" + ANSI_RESET);
            Log.addMessage(Gamefigurine.initGameFigurines().get(player).getName() + " had no more CC to get another Weapon");
        }
        System.out.println(ANSI_GOLD + Gamefigurine.initGameFigurines().get(player)
                                                         .getcC() + ANSI_MAGENTA + ": Is your Remaining Carrying Capacity" + ANSI_RESET);
    }
}
