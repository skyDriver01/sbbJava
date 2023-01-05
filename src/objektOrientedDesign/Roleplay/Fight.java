package objektOrientedDesign.Roleplay;

import objektOriented.aufg1.aufg2.InputIn;
import objektOrientedDesign.Roleplay.GameFigures.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fight {
    static List <Gamefigurine> gameFigurines;

    public static void main(String[] args) {
        chooseYourCharacter();
    }

    public static void initGameFigurines() {
        double minFV = 0.9;
        double maxFV = 1.1;
        double minRes = 1;
        double maxRes = 3;
        double minSpeed = 0.5;
        double maxSpeed = 1.5;
        List <Gamefigurine> characters = new ArrayList <>();
        characters.add(new Dwarf("Dwarf", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 50, 30));
        characters.add(new Elven("Elven", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 50, 9, 0.5));
        characters.add(new Human("Human", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 50, 7));
        characters.add(new Orc("Orc", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 50, 5, false));
        characters.add(new SCP_049("SCP_049", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 50, 2, 0.01, 0.05));
        characters.add(new Troll("Troll", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 50, 0, false));
        characters.add(new ToTest("OP", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 1, 1, 1));
        characters.add(new Goblin("Goblin", 100, 15, ((Math.random() * (maxFV - minFV)) + minFV), ((Math.random() * (maxRes - minRes)) + minRes), ((Math.random() * (maxSpeed - minSpeed)) + minSpeed), 50, 8));
        gameFigurines = characters;
    }

    public static void chooseYourCharacter() {   // Give out like print what Number is for what Figurine.
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
                gameFigurines.stream().filter(a -> a.getName().equals("Dwarf")).forEach(a -> System.out.println(a.getfV()));
            }
            case 2 -> {
                gameFigurines.stream().filter(a -> a.getName().equals("Elven")).forEach(a -> System.out.println(a.getfV()));
            }
            case 3 -> {
                gameFigurines.stream().filter(a -> a.getName().equals("Human")).forEach(a -> System.out.println(a.getfV()));
            }
            case 4 -> {
                gameFigurines.stream().filter(a -> a.getName().equals("Orc")).forEach(a -> System.out.println(a.getfV()));
            }
            case 5 -> {
                gameFigurines.stream().filter(a -> a.getName().equals("SCP_049")).forEach(a -> System.out.println(a.getfV()));
            }
            case 6 -> {
                gameFigurines.stream().filter(a -> a.getName().equals("Troll")).forEach(a -> System.out.println(a.getfV()));
            }
            case 7 -> {
                gameFigurines.stream().filter(a -> a.getName().equals("OP")).forEach(a -> System.out.println(a.getfV()));
            }
            case 8 -> {
                gameFigurines.stream().filter(a -> a.getName().equals("Goblin")).forEach(a -> System.out.println(a.getfV()));
            }
            default -> System.out.println("You did not chooe a Character");
        }
    }
}