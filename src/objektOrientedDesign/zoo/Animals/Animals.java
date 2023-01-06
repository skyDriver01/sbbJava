package objektOrientedDesign.zoo.Animals;

public class Animals {
    String speciesName;
    boolean alive;
    int enclosureNumber;

    public Animals(boolean alive, String speciesName,int enclosureNumber) {
        this.alive = alive;
        this.speciesName = speciesName;
        this.enclosureNumber = enclosureNumber;
    }
}
