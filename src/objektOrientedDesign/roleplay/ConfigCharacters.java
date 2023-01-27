package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.*;
import objektOrientedDesign.roleplay.items.*;
import objektOrientedDesign.roleplay.weapons.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static objektOrientedDesign.roleplay.TextStuff.*;

public class ConfigCharacters {
    static List <Gamefigurine> gameFigurines = Gamefigurine.initGameFigurines();
    static List <Weapon> weapons = Weapon.initWeapons(); // Von anfang an nicht probieren static zu benutzen.
    static List <Item> items = Item.initItems();
    static List <Gamefigurine> fightingCharacters = new ArrayList <>();
    static Inventory inventory = new Inventory();

    public void executeGame() {
        System.out.println(ANSI_CYAN + "Welcome to the Role playing game." + ANSI_RESET);
        chooseYourCharacter(0);
        System.out.println(ANSI_CYAN + "Now the next player can choose their character" + ANSI_RESET);
        chooseYourCharacter(1);
        Fight.startTheFight(fightingCharacters.get(0), fightingCharacters.get(1));
    }

    public static void chooseYourCharacter(int player) {
        System.out.println(ANSI_CYAN + "Player Choose the Character that you wish to play. (Every Character is a bit different and Combinations are also important to make your character the Strongest possible.)");
        System.out.println("Btw CC is Carrying Capacity so how much The Character can carry" + ANSI_RESET);
        boolean noCharacterChosen = true;
        HashMap <Integer, String> chooseFigurine = new HashMap <>();
        Gamefigurine.initGameFigurines();
        while (noCharacterChosen) {
            System.out.println(anyLine("yellow"));
            chooseFigurine.put(1, "0: Dwarf, CC = 14");
            chooseFigurine.put(2, "1: Elven, CC = 12");
            chooseFigurine.put(3, "2: Human, CC = 15");
            chooseFigurine.put(4, "3: Orc, CC = 17");
            chooseFigurine.put(5, "4: SCP_049, CC = 18");
            chooseFigurine.put(6, "5: Troll, CC = 20");
            chooseFigurine.put(7, "6: Goblin, CC = 13");
            for (int i = 1; i <= chooseFigurine.size(); i++) {
                System.out.println(chooseFigurine.get(i));
            }
            System.out.println(anyLine("yellow"));
            noCharacterChosen = characterOptions(player, noCharacterChosen);
        }
    }

    private static boolean characterOptions(int player, boolean noCharacterChosen) {
        int chooseFigure = InputIn.nexIntOut("Type the Number of the Character that you want to Play");
        switch (chooseFigure) {
            case 0 -> noCharacterChosen = isCharacterChosen(player, 0);  //Dwarf

            case 1 -> noCharacterChosen = isCharacterChosen(player, 1);  //Elven

            case 2 -> noCharacterChosen = isCharacterChosen(player, 2);  //Human

            case 3 -> noCharacterChosen = isCharacterChosen(player, 3);  //Orc

            case 4 -> noCharacterChosen = isCharacterChosen(player, 4);  //SCP_049

            case 5 -> noCharacterChosen = isCharacterChosen(player, 5);  //Troll

            case 6 -> noCharacterChosen = isCharacterChosen(player, 6);  //Goblin
            default -> System.out.println(ANSI_LIME + "You did not choose a Character" + ANSI_RESET);
        }
        return noCharacterChosen;
    }

    private static boolean isCharacterChosen(int player, int figure) {
        boolean noCharacterChosen;
        fightingCharacters.add(gameFigurines.get(figure));
        fightingCharacters.get(player).getfV();
        saveCharacter(gameFigurines.get(figure), player);
        noCharacterChosen = false;
        chooseAWeapon(player);
        return noCharacterChosen;
    }

    public static void chooseAWeapon(int player) {
        Weapon.initWeapons();
        HashMap <Integer, String> weaponChoice = new HashMap <>();
        boolean loopForWeapons = true;
        while (loopForWeapons) {
            infosForWeapons();
            weaponChoice.put(1, "1: Club, Weight = 4");
            weaponChoice.put(2, "2: Sword, Weight = 2");
            weaponChoice.put(3, "3: Scythe, Weight = 3");
            weaponChoice.put(4, "4: Bow, Weight = 1");
            weaponChoice.put(5, "5: Musket, Weight = 2.5");
            weaponChoice.put(6, "6: Trowing Knives, Weight = 0.5");
            weaponChoice.put(7, "7: No more Weapons");
            for (int i = 1; i <= weaponChoice.size(); i++) {
                System.out.println(weaponChoice.get(i));
            }
            System.out.println(anyLine("purple"));
            int chooseYourWeapons = InputIn.nexIntOut("Type the Number of the Desired Action");
            switch (chooseYourWeapons) {
                case 1 -> equipWeapon(weapons.get(0), player);  //Club
                case 2 -> equipWeapon(weapons.get(1), player);  //Sword
                case 3 -> equipWeapon(weapons.get(2), player);  //Scythe
                case 4 -> equipWeapon(weapons.get(3), player);  //Bow
                case 5 -> equipWeapon(weapons.get(4), player);  //Musket
                case 6 -> equipWeapon(weapons.get(5), player);  //Throwing Knives
                case 7 -> {
                    loopForWeapons = false;
                    chooseAItem(player);
                }
                default -> {
                    System.out.println(ANSI_ORANGE + "Really now? You have 7 Options and you did not manage to pick any of them. Try Again" + ANSI_RESET);
                    Log.addMessage(fightingCharacters.get(player).getName() + "failed to press a number from 1-7");
                }
            }
        }
    }

    private static void infosForWeapons() {
        System.out.println(anyLine("white"));
        System.out.println(ANSI_CYAN + "Choose the weapon you would like.");
        System.out.println("The First Weapon you choose will be your Active Weapon and to change the active weapon you will use up a turn");
        System.out.println("You also have a limited amount of CC (Carrying Capacity) so keep in mind not to use it all up already" + ANSI_RESET);
        System.out.println(anyLine("white"));
        System.out.println(anyLine("purple"));
    }

    public static void equipWeapon(Weapon weapon, int player) {
        if(fightingCharacters.get(player).getcC() >= weapon.getWeight()) {
            if(fightingCharacters.get(player)
                                 .getWeapon() == null) {    //Checks if i don't already have a weapon if not then the first weapon auto equips
                fightingCharacters.get(player).setWeapon(weapon);
                fightingCharacters.get(player).setcC(fightingCharacters.get(player).getcC() - weapon.getWeight());
                fightingCharacters.get(player).setfV(fightingCharacters.get(player).getfV() + weapon.getfV());
                Log.addMessage(fightingCharacters.get(player)
                                                 .getName() + " equipped this weapon first: " + weapon.getWeapon());
            } else {
                fightingCharacters.get(player).getWeaponBackpack()
                                  .add(weapon);     //Weapon gets added to your inventory for later activation if you wish
                fightingCharacters.get(player).setcC(fightingCharacters.get(player).getcC() - weapon.getWeight());
                Log.addMessage(fightingCharacters.get(player)
                                                 .getName() + " added this weapon to his inventory: " + weapon.getWeapon());
            }
        } else {
            System.out.println(ANSI_RED + "That Item is to Heavy for you" + ANSI_RESET);
            Log.addMessage(fightingCharacters.get(player).getName() + " had no more CC to get another Weapon");
        }
        System.out.println(ANSI_GOLD + fightingCharacters.get(player)
                                                         .getcC() + ANSI_MAGENTA + ": Is your Remaining Carrying Capacity" + ANSI_RESET);
    }

    public static void saveCharacter(Gamefigurine gamefigurine, int player) {
        fightingCharacters.get(player).setName((gamefigurine.getName()));
        Log.addMessage(fightingCharacters.get(player).getName() + " was chosen as one players Character");
    }

    public static void equipItem(Item item, int player) {
        inventory.addItemToInv(item, player);
        System.out.println(ANSI_GOLD + fightingCharacters.get(player)
                                                         .getcC() + ANSI_MAGENTA + ": Is your Remaining Carrying Capacity" + ANSI_RESET);
    }

    public static void equipArmor(Armor armor, int player) {
        if(fightingCharacters.get(player).getcC() >= armor.getWeight()) {
            inventory.equipOrAddArmor(armor, player);
        } else {
            System.out.println(ANSI_RED + "You have to much weight accumulated that you cannot hold this anymore." + ANSI_RESET);
            Log.addMessage(fightingCharacters.get(player).getName() + " had no more CC to get more Armor");
        }
        System.out.println(ANSI_GOLD + fightingCharacters.get(player)
                                                         .getcC() + ANSI_MAGENTA + ": Is your Remaining Carrying Capacity" + ANSI_RESET);
    }




    public static void chooseAItem(int player) {
        Item.initItems();
        HashMap <Integer, String> itemChoice = new HashMap <>();
        boolean loopForItems = true;
        while (loopForItems) {
            itemOptions(itemChoice);
            System.out.println(anyLine("red"));
            loopForItems = itemSwitch(player, loopForItems);
        }
    }

    private static boolean itemSwitch(int player, boolean loopForItems) {
        int chooseItem = InputIn.nexIntOut("Type the Number of the Desired Action");
        switch (chooseItem) {
            case 1 -> equipItem(items.get(0), player);      //Health Potion
            case 2 -> equipItem(items.get(1), player);      //Power Potion
            case 3 -> equipItem(items.get(2), player);      //Damage Potion
            case 4 -> equipItem(items.get(3), player);      //Shield Ring
            case 5 -> equipItem(items.get(4), player);      //Strength Ring
            case 6 -> equipItem(items.get(5), player);      //Charm Ring
            case 7 -> equipArmor((Armor) items.get(6), player);      //Light Armor
            case 8 -> equipArmor((Armor) items.get(7), player);      //Heavy Armor
            case 9 -> loopForItems = false;
            default -> {
                System.out.println(ANSI_ORANGE + "Come on, again?? THERE ARE 9 OPTIONS" + ANSI_RESET);
                Log.addMessage(fightingCharacters.get(player).getName() + "failed to press a number from 1-9");
            }
        }
        return loopForItems;
    }

    private static void itemOptions(HashMap <Integer, String> itemChoice) {
        System.out.println(anyLine("white"));
        System.out.println(ANSI_CYAN + "Now you can Choose Items if you have enough CC" + ANSI_RESET);
        System.out.println(anyLine("white"));
        System.out.println(anyLine("red"));
        itemChoice.put(1, "1: Health Potion, Weight = 2");
        itemChoice.put(2, "2: Power Potion, Weight = 2");
        itemChoice.put(3, "3: Damage Potion, Weight = 6");
        itemChoice.put(4, "4: Shield Ring, Weight = 1.5");
        itemChoice.put(5, "5: Strength Ring, Weight = 1.5");
        itemChoice.put(6, "6: Charm Ring, Weight = 3");
        itemChoice.put(7, "7: Light Armor, Weight = 3");
        itemChoice.put(8, "8: Heavy Armor, Weight = 6.5");
        itemChoice.put(9, "9: No more Items");
        for (int i = 1; i <= itemChoice.size(); i++) {
            System.out.println(itemChoice.get(i));
        }
    }
}