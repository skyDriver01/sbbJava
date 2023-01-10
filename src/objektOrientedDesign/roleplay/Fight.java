package objektOrientedDesign.roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.roleplay.gamefigures.*;
import objektOrientedDesign.roleplay.items.*;
import objektOrientedDesign.roleplay.weapons.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fight {
    static List <Gamefigurine> gameFigurines;
    static List <Weapon> weapons;
    static List <Item> items;
    static List <Gamefigurine> fightingCharacters;

    public static void main(String[] args) {
        System.out.println("Welcome to the Roleplaying game.");
        chooseYourCharacter();
    }

    public static void initGameFigurines() {
        double minFV = 0.9;
        double maxFV = 1.1;
        double minRes = 1;
        double maxRes = 1.3;
        double minSpeed = 1;
        double maxSpeed = 2;
        List <Gamefigurine> characters = new ArrayList <>();
        characters.add(new Dwarf("Dwarf", 80, 14, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0.3));
        characters.add(new Elven("Elven", 110, 12, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.75, 0.09));
        characters.add(new Human("Human", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.8, 0.07));
        characters.add(new Orc("Orc", 115, 17, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.75, 0.05, false));
        characters.add(new SCP_049("SCP_049", 90, 18, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.9, 0.02, 0.01, 0.05));
        characters.add(new Troll("Troll", 125, 20, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0, false));
        characters.add(new ToTest("OP", 10000, 15000, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 1, 1, 1));
        characters.add(new Goblin("Goblin", 85, 13, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0.08));
        gameFigurines = characters;
        fightingCharacters = characters;
    }

    public static void initWeapons() {
        List <Weapon> weaponList = new ArrayList <>();
        weaponList.add(new Club("Club", 4, 5, 0.8, 5));
        weaponList.add(new Sword("Sword", 2, 6, 0.95, 3, 0.05));
        weaponList.add(new Scythe("Scythe", 3, 7, 1, 1, 0.05));
        weaponList.add(new Bow("Bow", 1, 5.5, 0.75));
        weaponList.add(new Musket("Musket", 2.5, 8, 1, false));
        weaponList.add(new ThrowingKnife("Throwing Knives", 0.5, 10, 0.9, 3));
        weapons = weaponList;
    }

    public static void initItems() {
        List <Item> itemsList = new ArrayList <>();
        itemsList.add(new DamagePotion("Damage Potion", 2, ((Math.random() * (15 - 5)) +
                                                            5)));        //Random Amount of Enemy Health Taken
        itemsList.add(new PowerPotion("Power Potion", 2, 5));
        itemsList.add(new HealthPotion("Health Potion", 2, ((Math.random() * (20 - 5)) +
                                                            5)));       //Random Amount of Health gain
        itemsList.add(new SchieldRing("Shield Ring", 1.5, ((Math.random() * (2 - 0.75)) +
                                                           0.75)));  //Random Amount of resistance gain
        itemsList.add(new StrenghtRing("Strength Ring", 1.5, 5));
        itemsList.add(new CharmRing("Charm Ring", 1.5, ((Math.random() * (2 - 0.45)) +
                                                        0.45), 0.5));   //Almost like Resistance only difference is the enemies FV gets lower  // Charm = the Chances that it Works
        itemsList.add(new LightArmor("Light Armor", 3, 0.3, 0.1, 0.5));
        itemsList.add(new HeavyArmor("Heavy Armor", 6.5, 0.75, 0.25, 1));
        items = itemsList;
    }

    public static void chooseYourCharacter() {
        System.out.println("Player One Choose the Character that you wish to play. (Every Character is a bit different and Combinations are also important to make your character the Strongest possible.)");
        System.out.println("Btw CC is Carrying Capacity so how much The Character can carry");
        boolean noCharacterChosen = true;
        HashMap <Integer, String> chooseFigurine = new HashMap <Integer, String>();
        initGameFigurines();
        while (noCharacterChosen) {

            chooseFigurine.put(1, "0: Dwarf, CC = 14");
            chooseFigurine.put(2, "1: Elven, CC = 12");
            chooseFigurine.put(3, "2: Human, CC = 15");
            chooseFigurine.put(4, "3: Orc, CC = 17");
            chooseFigurine.put(5, "4: SCP_049, CC = 18");
            chooseFigurine.put(6, "5: Troll, CC = 20");
            chooseFigurine.put(7, "6: OP, CC = 1500");
            chooseFigurine.put(8, "7: Goblin, CC = 13");
            for (int i = 1; i <= chooseFigurine.size(); i++) {
                System.out.println(chooseFigurine.get(i));
            }
            int chooseFigure = InputIn.nexIntOut("Type the Number of the Character that you want to Play");
            switch (chooseFigure) {
                case 0 -> {
                    saveCharacter(gameFigurines.get(0), 0);
                    noCharacterChosen = false;
                    chooseAWeapon();
                }
                case 1 -> {
                    saveCharacter(gameFigurines.get(1), 0);
                    noCharacterChosen = false;
                    chooseAWeapon();
                }
                case 2 -> {
                    saveCharacter(gameFigurines.get(2), 0);
                    noCharacterChosen = false;
                    chooseAWeapon();
                }
                case 3 -> {
                    saveCharacter(gameFigurines.get(3), 0);
                    noCharacterChosen = false;
                    chooseAWeapon();
                }
                case 4 -> {
                    saveCharacter(gameFigurines.get(4), 0);
                    noCharacterChosen = false;
                    chooseAWeapon();
                }
                case 5 -> {
                    saveCharacter(gameFigurines.get(5), 0);
                    noCharacterChosen = false;
                    chooseAWeapon();
                }
                case 6 -> {
                    saveCharacter(gameFigurines.get(6), 0);
                    noCharacterChosen = false;
                    chooseAWeapon();
                }
                case 7 -> {
                    saveCharacter(gameFigurines.get(7), 0);
                    noCharacterChosen =false;
                    chooseAWeapon();
                }
                default -> System.out.println("You did not choose a Character");
            }
        }
    }

    public static void chooseAWeapon() {
        initWeapons();
        HashMap <Integer, String> weaponChoice = new HashMap <Integer, String>();
        boolean loopForWeapons = true;
        while (loopForWeapons) {
            System.out.println("Choose the weapon you would like. (BTW when choosing the Throwing Knives you only get 3 uses per one you pick but they do a good amount of Damage for this reason)");
            System.out.println("You also have a limited amount of CC (Carrying Capacity) so keep in mind not to use it all up already");
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
            int chooseYourWeapons = InputIn.nexIntOut("Type the Number of the Desired Action");
            switch (chooseYourWeapons) {
                case 1 -> {
                    equipWeapon(weapons.get(0), 0);
                }
                case 2 -> {
                    equipWeapon(weapons.get(1), 0);
                }
                case 3 -> {
                    equipWeapon(weapons.get(2), 0);
                }
                case 4 -> {
                    equipWeapon(weapons.get(3), 0);
                }
                case 5 -> {
                    equipWeapon(weapons.get(4), 0);
                }

                case 6 -> {
                    equipWeapon(weapons.get(5), 0);
                }
                case 7 -> {
                    loopForWeapons = false;
                    chooseAItem();
                }
                default ->
                        System.out.println("Really now? You have 7 Options and you did not manage to pick any of them. Try Again");

            }
        }
    }

    public static void equipWeapon(Weapon weapon, int player) {     // TODO: Fix Bug bc atm the weight is not getting taken away right
        // or it is not even gotten correctly a elve with 12 cc was able to old 14cc worth of items shouldne be possible look into it
        if(fightingCharacters
                   .get(player)
                   .getcC() >= weapon.getWeight()) {
            fightingCharacters
                    .get(player)            // TODO: BUG FOUND. The "Bug" is the fact that its getting the player and not the
                    // fightingcharacter Gamefigur that you chose so its always the same weight for all players that seems to be 14cc so change it to the gamefigurine
                    .getWeaponBackpack()
                    .add(weapon);
            fightingCharacters
                    .get(player)
                    .setcC(fightingCharacters
                                   .get(player)
                                   .getcC() - weapon.getWeight());
        } else {
            System.out.println("That weapon is to heavy for you to carry");
        }
        fightingCharacters
                .get(0)
                .getWeaponBackpack()
                .stream()
                .forEach(a -> System.out.println(a.getWeapon()));
    }

    public static void saveCharacter(Gamefigurine gamefigurine, int player) {
        fightingCharacters
                .get(player)
                .setName((gamefigurine.getName()));
    }

    public static void equipItem(Item item, int player) {
        if(fightingCharacters
                   .get(player)
                   .getcC() >= item.getWeight()) {
            fightingCharacters
                    .get(player)
                    .getItemBackpack()
                    .add(item);
            fightingCharacters
                    .get(player)
                    .setcC(fightingCharacters
                                   .get(player)
                                   .getcC() - item.getWeight());
        } else {
            System.out.println("That Item is to Heavy for you");
        }
        fightingCharacters
                .get(0)
                .getItemBackpack()
                .stream()
                .forEach(a -> System.out.println(a.getItem()));
    }

    public static void chooseAItem() {
        initItems();
        HashMap <Integer, String> itemChoice = new HashMap <Integer, String>();

        boolean loopForItems = true;
        while (loopForItems) {
            System.out.println("Now you can Choose Items if you have enough CC that is");
            itemChoice.put(1, "1: Health Potion, Weight = 2");
            itemChoice.put(2, "2: Power Potion, Weight = 2");
            itemChoice.put(3, "3: Damage Potion, Weight = 2");
            itemChoice.put(4, "4: Shield Ring, Weight = 1.5");
            itemChoice.put(5, "5: Strenght Ring, Weight = 1.5");
            itemChoice.put(6, "6: Charm Ring, Weight = 1.5");
            itemChoice.put(7, "7: Light Armor, Weight = 3");
            itemChoice.put(8, "8: Heavy Armor, Weight = 6.5");
            itemChoice.put(9, "9: No more Items");
            for (int i = 1; i <= itemChoice.size(); i++) {
                System.out.println(itemChoice.get(i));
            }
            int chooseItem = InputIn.nexIntOut("Type the Number of the Desired Action");
            switch (chooseItem) {
                case 1 -> {
                    equipItem(items.get(0), 0);
                }
                case 2 -> {
                    equipItem(items.get(1), 0);
                }
                case 3 -> {
                    equipItem(items.get(2), 0);
                }
                case 4 -> {
                    equipItem(items.get(3), 0);
                }
                case 5 -> {
                    equipItem(items.get(4), 0);
                }
                case 6 -> {
                    equipItem(items.get(5), 0);
                }
                case 7 -> {
                    equipItem(items.get(6), 0);
                }
                case 8 -> {
                    equipItem(items.get(7), 0);
                }
                case 9 -> loopForItems = false;
                default -> System.out.println("Come on man again?? THERE ARE 9 OPTIONS");
            }
        }
    }
}