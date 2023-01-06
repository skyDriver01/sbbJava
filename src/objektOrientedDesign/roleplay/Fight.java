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
    static List<Weapon> weapons;
    static List <Item> items;
    static List<Gamefigurine> fightingCharacters;

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
        characters.add(new SCP_049("SCP_049", 90,18 , ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.9, 0.02, 0.01, 0.05));
        characters.add(new Troll("Troll", 125, 20, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0, false));
        characters.add(new ToTest("OP", 10000, 1500, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 1, 1, 1));
        characters.add(new Goblin("Goblin", 85, 13, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0.08));
        gameFigurines = characters;
        fightingCharacters = characters;
    }

    public static void initWeapons(){
        List<Weapon> weaponList = new ArrayList <>();
        weaponList.add(new Club("Club",4,5,0.8,5));
        weaponList.add(new Sword("Sword",2, 6, 0.95, 3,0.05));
        weaponList.add(new Scythe("Scythe",3, 7, 1, 1,0.05));
        weaponList.add(new Bow("Bow",1, 5.5, 0.75));
        weaponList.add(new Musket("Musket",2.5,8,1,false));
        weaponList.add(new ThrowingKnife("Throwing Knives",0.5,10,0.9,3));
        weapons = weaponList;
    }

    public static void initItems(){
        List<Item> itemsList = new ArrayList<>();
        itemsList.add(new DamagePotion(2,((Math.random() * (15 - 5)) + 5)));        //Random Amount of Enemy Health Taken
        itemsList.add(new PowerPotion(2, 5));
        itemsList.add(new HealthPotion(2, ((Math.random() * (20 - 5)) + 5)));       //Random Amount of Health gain
        itemsList.add(new SchieldRing(1.5, ((Math.random() * (2 - 0.75)) + 0.75)));  //Random Amount of resistance gain
        itemsList.add(new StrenghtRing(1.5,5));
        itemsList.add(new CharmRing(1.5,((Math.random() * (2 - 0.45)) + 0.45),0.5));   //Almost like Resistance only difference is the enemies FV gets lower  // Charm = the Chances that it Works
        itemsList.add(new LightArmor(3,0.3,0.1,0.5));
        itemsList.add(new HeavyArmor(6.5,0.75,0.25,1));
        items = itemsList;
    }

    public static void chooseYourCharacter() {
        System.out.println("Player One Choose the Character that you wish to play. (Every Character is a bit different and Combinations are also important to make your character the Strongest possible.)");
        initGameFigurines();
        HashMap <Integer, String> chooseFigurine = new HashMap <Integer, String>();
        chooseFigurine.put(1, "1: Dwarf");
        chooseFigurine.put(2, "2: Elven");
        chooseFigurine.put(3, "3: Human");
        chooseFigurine.put(4, "4: Orc");
        chooseFigurine.put(5, "5: SCP_049");
        chooseFigurine.put(6, "6: Troll");
        chooseFigurine.put(7, "7: OP");
        chooseFigurine.put(8, "8: Goblin");
        for (int i = 1; i <= chooseFigurine.size(); i++) {
            System.out.println(chooseFigurine.get(i));
        }
        int chooseFigure = InputIn.nexIntOut("Type the Number of the Character that you want to Play");
        switch (chooseFigure) {
            case 1 -> {
                chooseAWeapon();
            }

            case 2 -> {
                chooseAWeapon();
            }
            case 3 -> {
                chooseAWeapon();
            }
            case 4 -> {
                chooseAWeapon();
            }
            case 5 -> {
                chooseAWeapon();
            }
            case 6 -> {
                chooseAWeapon();
            }
            case 7 -> {
                chooseAWeapon();
            }
            case 8 -> {
                chooseAWeapon();
            }
            default -> System.out.println("You did not choose a Character");
        }
    }

    public static void chooseAWeapon() {
        initWeapons();
        HashMap <Integer, String> weaponChoice = new HashMap <Integer, String>();
        boolean loopForWeapons = true;
        while (loopForWeapons) {
            System.out.println("Choose the weapon you would like. (BTW when choosing the Throwing Knives you only get 3 uses per one you pick but they do a good amount of Damage for this reason)");
            System.out.println("You also have a limited amount of CC (Carrying Capacity) so keep in mind not to use it all up already");
            weaponChoice.put(1, "1: Club");
            weaponChoice.put(2, "2: Sword");
            weaponChoice.put(3, "3: Scythe");
            weaponChoice.put(4, "4: Bow");
            weaponChoice.put(5, "5: Musket");
            weaponChoice.put(6, "6: Trowing Knives");
            weaponChoice.put(7, "7: No more Weapons");
            for (int i = 1; i <= weaponChoice.size(); i++) {
                System.out.println(weaponChoice.get(i));
            }
            int chooseYourWeapons = InputIn.nexIntOut("Type the Number of the Desired Action");
            switch (chooseYourWeapons) {
                case 1 -> {

                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> loopForWeapons = false;
                default ->
                        System.out.println("Really now? You have 7 Options and you did not manage to pick any of them. Try Again");

            }
        }
    }

    public static void chooseAItem(){
        initItems();
        HashMap<Integer, String> itemChoice = new HashMap<Integer, String>();

        boolean loopForItems = true;
        while (loopForItems){
            System.out.println("Now you can Choose Items if you have enough CC that is");
            itemChoice.put(1,"1: Health Potion");
            itemChoice.put(2,"2: Power Potion");
            itemChoice.put(3,"3: Damage Potion");
            itemChoice.put(4,"4: Shield Ring");
            itemChoice.put(5,"5: Strenght Ring");
            itemChoice.put(6,"6: Charm Ring");
            itemChoice.put(7,"7: Light Armor");
            itemChoice.put(8,"8: Heavy Armor");
            itemChoice.put(9,"9: No more Items");
            for (int i = 1; i <= itemChoice.size(); i++) {
                System.out.println(itemChoice.get(i));
            }
        }
    }
}