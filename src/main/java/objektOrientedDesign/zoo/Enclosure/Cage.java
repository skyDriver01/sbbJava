package objektOrientedDesign.zoo.Enclosure;

public class Cage extends Enclosure{
    private double humidity;
    private double fenceHeight;
    public Cage(int enclosureNumber, double surfaceArea, int fenceHeight, int capacity, double humidity,
                double temperature,
                boolean moat) {
        super(enclosureNumber, surfaceArea, capacity, temperature, moat);
        this.fenceHeight = fenceHeight;
        this.humidity = humidity;
    }
}
