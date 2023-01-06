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
    static List<Item> items;
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
        characters.add(new Dwarf("Dwarf", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0.3));
        characters.add(new Elven("Elven", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.75, 0.09));
        characters.add(new Human("Human", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.8, 0.07));
        characters.add(new Orc("Orc", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.75, 0.05, false));
        characters.add(new SCP_049("SCP_049", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.9, 0.02, 0.01, 0.05));
        characters.add(new Troll("Troll", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0, false));
        characters.add(new ToTest("OP", 10000, 1500, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 1, 1, 1));
        characters.add(new Goblin("Goblin", 100, 10, ((Math.random() * (maxFV - minFV)) + minFV), (
                (Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) +
                                                                minSpeed), 0.5, 0.08));
        gameFigurines = characters;
    }

    public static void initWeapons(){
        List<Weapon> weaponList = new ArrayList <>();
        weaponList.add(new Club(4,5,0.8,5));
        weaponList.add(new Sword(2, 6, 0.95, 3,0.05));
        weaponList.add(new Scythe(3, 7, 1, 1,0.05));
        weaponList.add(new Bow(1, 5.5, 0.75));
        weaponList.add(new Musket(2.5,8,1,false));
        weaponList.add(new ThrowingKnife(0.5,10,0.9,3));
        weapons = weaponList;
    }

    public static void initItems(){
        List<Item> itemsList = new ArrayList<>();
        itemsList.add(new DamagePotion(2,((Math.random() * (15 - 5)) + 5)));        //Random Amount of Enemy Health Taken
        itemsList.add(new PowerPotion(2, 5));
        itemsList.add(new HealthPotion(2, ((Math.random() * (20 - 5)) + 5)));       //Random Amount of Health gain
        itemsList.add(new SchieldRing(1.5, ((Math.random() * (2 - 0.75)) + 0.75)));  //Random Amount of resistance gain
        itemsList.add(new StrenghtRing(1.5,5));
        itemsList.add(new CharmRing(1.5,((Math.random() * (2 - 0.45)) + 0.45),0.5));   //Almost like Resistance only differencz is the enemies FV gets lower  // Charm = the Chances that it Works
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
                fightingCharacters.add(gameFigurines.get(0));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            case 2 -> {
                fightingCharacters.add(gameFigurines.get(1));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            case 3 -> {
                fightingCharacters.add(gameFigurines.get(2));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            case 4 -> {
                fightingCharacters.add(gameFigurines.get(3));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            case 5 -> {
                fightingCharacters.add(gameFigurines.get(4));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            case 6 -> {
                fightingCharacters.add(gameFigurines.get(5));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            case 7 -> {
                fightingCharacters.add(gameFigurines.get(6));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            case 8 -> {
                fightingCharacters.add(gameFigurines.get(7));
                fightingCharacters
                        .stream()
                        .forEach(a -> System.out.println(a.getName()));
            }
            default -> System.out.println("You did not choose a Character");
        }
    }

    public static void chooseAWeapon() {
        initWeapons();
        HashMap <Integer, String> weaponChoice = new HashMap <Integer, String>();
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
        while (chooseYourWeapons != 7) {
            switch (chooseYourWeapons) {
                case 1 -> {
               //     playerOne.add()
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
                case 7 -> {
                }
                default ->
                        System.out.println("Really now? You have 7 Options and you did not manage to pick any of them. Try Again");

            }
        }
    }
}