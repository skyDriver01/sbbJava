package objektOrientedDesign.zoo.Animals;

public class Animals {
    private String speciesName;
    private boolean alive;
    private int enclosureNumber;

    public Animals(boolean alive, String speciesName,int enclosureNumber) {
        this.alive = alive;
        this.speciesName = speciesName;
        this.enclosureNumber = enclosureNumber;
    }
}
