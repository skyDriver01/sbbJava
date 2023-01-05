package objektOrientedDesign.Zoo;

import objektOrientedDesign.Zoo.Animals.*;
import objektOrientedDesign.Zoo.Enclosure.*;
import objektOrientedDesign.Zoo.Person.Member;
import objektOrientedDesign.Zoo.Person.People;
import objektOrientedDesign.Zoo.Person.Worker;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static List<Animals> animals(){
        List<Animals> animals = new ArrayList<>();
        animals.add(new WaterAnimals(1, true, "Halfmoon Fish" , "Fish", "Kelp", WaterAnimals.WaterType.SWEET, WaterAnimals.BreathType.GILLS));
        animals.add(new Amphibia(4, true, "African bullfrog" , "Smooth", "Meat"));
        animals.add(new LandAnimals(3, true, "Pangolin", "Scales", "Meat", true));  // Bipedal is if it walks on 2 legs like humans or other animals
        animals.add(new FlyingAnimals(2, true, "Redwing", true, "Berries"));
        return animals;
    }
    public static List<People> people(){
        List<People> people = new ArrayList<>();
        people.add(new Worker("+41 77 777 70 70", 1000, "Cleans most Enclosures"));
        people.add(new Member("+41 78 888 80 80", "12.12.2013", 12034));
        return people;
    }
    public static List<Enclosure> enclosures(){
        List<Enclosure> enclosures = new ArrayList <>();
        enclosures.add(new Aquarium(1, 50, 4, 10, 1, 26, false, Aquarium.WaterType.SWEET));
        enclosures.add(new Cage(2, 150, 15, 35, 60, 2, true));
        enclosures.add(new Terrain(3, 60, 3, 15, 0.64, 7, true));
        enclosures.add(new Terrarium(4, 20, 3, 12, 85, 25, true));
        return enclosures;
    }
}