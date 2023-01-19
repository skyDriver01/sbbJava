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
    static List <Gamefigurine> gameFigurines;
    static List <Weapon> weapons;
    static List <Item> items;
    static List <Gamefigurine> fightingCharacters = new ArrayList <>();

    public void executeGame() {
        System.out.println(color("cyan") + "Welcome to the Role playing game." + color(""));
        chooseYourCharacter(0);
        System.out.println(color("cyan") + "Now the next player can choose their character" + color(""));
        chooseYourCharacter(1);
        Fight.startTheFight(fightingCharacters.get(0), fightingCharacters.get(1));
    }

    public static void initGameFigurines() {
        double minFV = 0.9;
        double maxFV = 1.1;
        double minRes = 1;
        double maxRes = 1.3;
        double minSpeed = 1;
        double maxSpeed = 2;
        List <Gamefigurine> characters = new ArrayList <>();
        characters.add(new Dwarf("Dwarf", 80, 14, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 0.5, 0.3));
        characters.add(new Elven("Elven", 110, 12, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 0.75, 0.09));
        characters.add(new Human("Human", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 0.8, 0.07));
        characters.add(new Orc("Orc", 115, 17, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 0.75, 0.05, false));
        characters.add(new SCP_049("SCP_049", 90, 18, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 0.9, 0.02, 0.01, 0.05));
        characters.add(new Troll("Troll", 125, 20, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 0.5, 0));
        characters.add(new ToTest("OP", 10000, 15000, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 1, 1, 1));
        characters.add(new Goblin("Goblin", 85, 13, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 0.5, 0.08));
        gameFigurines = characters;
    }

    public static void initWeapons() {
        List <Weapon> weaponList = new ArrayList <>();
        weaponList.add(new Club("Club", 4, 5, 0.8, 5));
        weaponList.add(new Sword("Sword", 2, 6, 0.95, 3, 0.05));
        weaponList.add(new Scythe("Scythe", 3, 7, 1, 1, 0.05));
        weaponList.add(new Bow("Bow", 1, 5.5, 0.75));
        weaponList.add(new Musket("Musket", 2.5, 8, 1));
        weaponList.add(new ThrowingKnife("Throwing Knives", 0.5, 10, 0.9, 3));
        weapons = weaponList;
    }

    public static void initItems() {
        List <Item> itemsList = new ArrayList <>();
        itemsList.add(new HealthPotion("Health Potion", 2, ((Math.random() * (20 - 5)) + 5)));        //Random Amount of Enemy Health Taken
        itemsList.add(new PowerPotion("Power Potion", 2, 5));
        itemsList.add(new DamagePotion("Damage Potion", 2, ((Math.random() * (10 - 5)) + 5)));       //Random Amount of Health gain
        itemsList.add(new ShieldRing("Shield Ring", 1.5, ((Math.random() * (2 - 0.75)) + 0.75)));  //Random Amount of resistance gain
        itemsList.add(new StrengthRing("Strength Ring", 1.5, 5));
        itemsList.add(new CharmRing("Charm Ring", 1.5, ((Math.random() * (2 - 0.45)) + 0.45), 0.5));   //Almost like Resistance only difference is the enemies FV gets lower  // Charm = the Chances that it Works
        itemsList.add(new LightArmor("Light Armor", 3, 0.3, 0.1, 0.5));
        itemsList.add(new HeavyArmor("Heavy Armor", 6.5, 0.75, 0.25, 1));
        items = itemsList;
    }

    public static void chooseYourCharacter(int player) {
        System.out.println(color("cyan") + "Player Choose the Character that you wish to play. (Every Character is a bit different and Combinations are also important to make your character the Strongest possible.)");
        System.out.println("Btw CC is Carrying Capacity so how much The Character can carry" + color(""));
        boolean noCharacterChosen = true;
        HashMap <Integer, String> chooseFigurine = new HashMap <>();
        initGameFigurines();
        while (noCharacterChosen) {
            System.out.println(yellowLine());
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
            System.out.println(yellowLine());
            int chooseFigure = InputIn.nexIntOut("Type the Number of the Character that you want to Play");
            switch (chooseFigure) {
                case 0 -> {
                    fightingCharacters.add(gameFigurines.get(0));
                    saveCharacter(gameFigurines.get(0), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                case 1 -> {
                    fightingCharacters.add(gameFigurines.get(1));
                    fightingCharacters.get(player)
                            .setfV(fightingCharacters.get(player).getfV() + (fightingCharacters.get(player)
                                                                                     .getmV() / 2));
                    saveCharacter(gameFigurines.get(1), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                case 2 -> {
                    fightingCharacters.add(gameFigurines.get(2));
                    saveCharacter(gameFigurines.get(2), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                case 3 -> {
                    fightingCharacters.add(gameFigurines.get(3));
                    saveCharacter(gameFigurines.get(3), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                case 4 -> {
                    fightingCharacters.add(gameFigurines.get(4));
                    saveCharacter(gameFigurines.get(4), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                case 5 -> {
                    fightingCharacters.add(gameFigurines.get(5));
                    saveCharacter(gameFigurines.get(5), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                case 6 -> {
                    fightingCharacters.add(gameFigurines.get(6));
                    saveCharacter(gameFigurines.get(6), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                case 7 -> {
                    fightingCharacters.add(gameFigurines.get(7));
                    saveCharacter(gameFigurines.get(7), player);
                    noCharacterChosen = false;
                    chooseAWeapon(player);
                }
                default -> System.out.println(color("lime") + "You did not choose a Character" + color(""));
            }
        }
    }

    public static void chooseAWeapon(int player) {
        initWeapons();
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
            System.out.println(purpleLine());
            int chooseYourWeapons = InputIn.nexIntOut("Type the Number of the Desired Action");
            switch (chooseYourWeapons) {
                case 1 -> {
                    if(weapons.getClass().equals(Club.class)){
                        weapons.get(0).setfV(weapons.get(0).getfV() + (weapons.get(0).getBv() / 2));
                    }
                    equipWeapon(weapons.get(0), player);
                    if(fightingCharacters.get(player).getClass().equals(Troll.class)) {
                        fightingCharacters.get(player).setfV(fightingCharacters.get(player).getfV() * 2);
                    }
                }
                case 2 -> {
                    if(weapons.getClass().equals(Sword.class)){
                        weapons.get(1).setfV(weapons.get(1).getfV() + (weapons.get(1).getBv() / 2));
                    }
                    equipWeapon(weapons.get(1), player);}
                case 3 -> {
                    if(weapons.getClass().equals(Scythe.class)){
                        weapons.get(2).setfV(weapons.get(2).getfV() + (weapons.get(2).getBv() / 2));
                    }                    equipWeapon(weapons.get(2), player);
                    if(fightingCharacters.get(player).getClass().equals(SCP_049.class)) {
                        fightingCharacters.get(player).setInstantDeath(0.02);
                    }
                }
                case 4 -> {
                    equipWeapon(weapons.get(3), player);
                    changeGoblinOrElvenValues(player);  //it changes the values if they choose bow bc of the specialty of these classes
                }
                case 5 -> equipWeapon(weapons.get(4), player);
                case 6 -> {
                    if(fightingCharacters.get(player).getClass().equals(Goblin.class)) {
                        fightingCharacters.get(player).setAmount(6);
                    }
                    equipWeapon(weapons.get(5), player);
                }
                case 7 -> {
                    loopForWeapons = false;
                    chooseAItem(player);
                }
                default ->
                        System.out.println(color("orange") + "Really now? You have 7 Options and you did not manage to pick any of them. Try Again" + color(""));
            }
        }
    }

    private static void infosForWeapons() {
        System.out.println(whiteLine());
        System.out.println(color("cyan") + "Choose the weapon you would like. (BTW when choosing the Throwing Knives you only get 3 uses per one you pick but they do a good amount of Damage for this reason)");
        System.out.println("The First Weapon you choose will be your Active Weapon and to change the active weapon you will use up a turn");
        System.out.println("You also have a limited amount of CC (Carrying Capacity) so keep in mind not to use it all up already" + color(""));
        System.out.println(whiteLine());
        System.out.println(purpleLine());
    }

    private static void changeGoblinOrElvenValues(int player) {
        if(fightingCharacters.get(player).getClass().equals(Elven.class)) {
            fightingCharacters.get(player)
                    .setfV(fightingCharacters.get(player).getfV() + (fightingCharacters.get(player).getfV() * 0.5));
            fightingCharacters.get(player).setAccuracy(1);

        } else if(fightingCharacters.get(player).getClass().equals(Goblin.class)) {
            fightingCharacters.get(player)
                    .setfV(fightingCharacters.get(player).getfV() + (fightingCharacters.get(player).getfV() * 0.5));
        }
    }

    public static void equipWeapon(Weapon weapon, int player) {
        if(fightingCharacters.get(player).getcC() >= weapon.getWeight()) {
            if(fightingCharacters.get(player)
                       .getWeapon() == null) {    //Checks if i don't already have a weapon if not then the first weapon auto equips
                fightingCharacters.get(player).setWeapon(weapon);
                fightingCharacters.get(player).setcC(fightingCharacters.get(player).getcC() - weapon.getWeight());
                fightingCharacters.get(player).setfV(fightingCharacters.get(player).getfV() + weapon.getfV());
            } else {
                fightingCharacters.get(player).getWeaponBackpack()
                        .add(weapon);     //Weapon gets added to your inventory for later activation if you wish
                fightingCharacters.get(player).setcC(fightingCharacters.get(player).getcC() - weapon.getWeight());
            }
        } else {
            System.out.println(color("red") + "That Item is to Heavy for you" + color(""));
        }
        System.out.println(color("gold") + fightingCharacters.get(player)
                .getcC() + color("magenta") + ": Is your Remaining Carrying Capacity" + color(""));
    }

    public static void saveCharacter(Gamefigurine gamefigurine, int player) {
        fightingCharacters.get(player).setName((gamefigurine.getName()));
    }

    public static void equipItem(Item item, int player) {
        if(fightingCharacters.get(player).getcC() >= item.getWeight()) {
            fightingCharacters.get(player).getItemBackpack().add(item);
            fightingCharacters.get(player).setcC(fightingCharacters.get(player).getcC() - item.getWeight());
        } else {
            System.out.println(color("red") + "That Item is to Heavy for you" + color(""));
        }
        System.out.println(color("gold") + fightingCharacters.get(player)
                .getcC() + color("magenta") + ": Is your Remaining Carrying Capacity" + color(""));
    }

    public static void equipArmor(Armor armor, int player) {
        if(fightingCharacters.get(player).getcC() >= armor.getWeight()) {
            if(fightingCharacters.get(player).getArmor() == null) {
                fightingCharacters.get(player).setArmor(armor);
                fightingCharacters.get(player)
                        .setRes(fightingCharacters.get(player).getArmor().getRes() + armor.getRes());
                fightingCharacters.get(player)
                        .setSpeed(fightingCharacters.get(player).getSpeed() - armor.getSlowness());
                fightingCharacters.get(player).setcC(fightingCharacters.get(player).getcC() - armor.getWeight());
            } else {
                fightingCharacters.get(player).getItemBackpack().add(armor);
                fightingCharacters.get(player).setcC(fightingCharacters.get(player).getcC() - armor.getWeight());
            }
        } else {
            System.out.println(color("red") + "You have to much weight accumulated that you cannot hold this anymore." + color(""));
        }
        System.out.println(color("gold") + fightingCharacters.get(player)
                .getcC() + color("magenta") + ": Is your Remaining Carrying Capacity" + color(""));
    }

    public static void chooseAItem(int player) {
        initItems();
        HashMap <Integer, String> itemChoice = new HashMap <>();
        boolean loopForItems = true;
        while (loopForItems) {
            System.out.println(whiteLine());
            System.out.println(color("cyan") + "Now you can Choose Items if you have enough CC that is" + color(""));
            System.out.println(whiteLine());
            System.out.println(redLine());
            itemChoice.put(1, "1: Health Potion, Weight = 2");
            itemChoice.put(2, "2: Power Potion, Weight = 2");
            itemChoice.put(3, "3: Damage Potion, Weight = 2");
            itemChoice.put(4, "4: Shield Ring, Weight = 1.5");
            itemChoice.put(5, "5: Strength Ring, Weight = 1.5");
            itemChoice.put(6, "6: Charm Ring, Weight = 1.5");
            itemChoice.put(7, "7: Light Armor, Weight = 3");
            itemChoice.put(8, "8: Heavy Armor, Weight = 6.5");
            itemChoice.put(9, "9: No more Items");
            for (int i = 1; i <= itemChoice.size(); i++) {
                System.out.println(itemChoice.get(i));
            }
            System.out.println(redLine());
            int chooseItem = InputIn.nexIntOut("Type the Number of the Desired Action");
            switch (chooseItem) {
                case 1 -> equipItem(items.get(0), player);
                case 2 -> equipItem(items.get(1), player);
                case 3 -> equipItem(items.get(2), player);
                case 4 -> equipItem(items.get(3), player);
                case 5 -> equipItem(items.get(4), player);
                case 6 -> equipItem(items.get(5), player);
                case 7 -> {
                    if(!(fightingCharacters.get(player).getClass().equals(Troll.class) || fightingCharacters.get(player)
                            .getClass().equals(SCP_049.class))) {
                        equipArmor((Armor) items.get(6), player);
                    } else {
                        System.out.println(color("red") + "The Character you have Chosen is not fit to equip Light Armor" + color(""));
                    }
                }
                case 8 -> {
                    if(fightingCharacters.get(player).getClass().equals(Human.class) || fightingCharacters.get(player)
                            .getClass().equals(Orc.class) || fightingCharacters.get(player).getClass()
                               .equals(Dwarf.class)) {
                        equipArmor((Armor) items.get(7), player);
                    } else {
                        System.out.println(color("red") + "The Character you have Chosen is not fit to equip Heavy Armor" + color(""));
                    }
                }
                case 9 -> loopForItems = false;
                default -> System.out.println(color("orange") + "Come on, again?? THERE ARE 9 OPTIONS" + color(""));
            }
        }
    }
}