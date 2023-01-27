package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;
import objektOrientedDesign.roleplay.items.Armor;
import objektOrientedDesign.roleplay.items.Item;

import static objektOrientedDesign.roleplay.TextStuff.ANSI_RED;
import static objektOrientedDesign.roleplay.TextStuff.ANSI_RESET;

public class Inventory {
    public static void addItemToInv(Item item,
                                     int player) {       // Todo: zu eigener Klasse hinzufügen wo zbs. Inventory heisst. Items, waffen und armor
        if(Gamefigurine.initGameFigurines().get(player).getcC() >= item.getWeight()) {
            Gamefigurine.initGameFigurines().get(player).getItemBackpack().add(item);
            Gamefigurine.initGameFigurines().get(player).setcC(Gamefigurine.initGameFigurines().get(player)
                                                                           .getcC() - item.getWeight());        // Todo: Methode machen wo restliche Tragkraft(cC) und diese nicht ändert sonder schaut wie viel noch übrig bleibt mit all den items wo man schon hat
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
}
