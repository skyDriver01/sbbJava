package objektOrientedDesign.Zoo.Enclosure;

public class Terrarium extends Enclosure{
    public Terrarium(int enclosureNumber, double surfaceArea, int fenceHeight, int capacity, double humidity,
                     double temperature, boolean moat) {
        super(enclosureNumber, surfaceArea, fenceHeight, capacity, humidity, temperature, moat);
    }
}
