package main.java.objektOrientedDesign.zoo.Enclosure;

public class Terrain extends Enclosure{
    private double humidity;
    private double fenceHeight;
    public Terrain(int enclosureNumber, double surfaceArea, int fenceHeight, int capacity, double humidity,
                   double temperature, boolean moat) {
        super(enclosureNumber, surfaceArea, capacity, temperature, moat);
        this.fenceHeight = fenceHeight;
        this.humidity = humidity;
    }
}
