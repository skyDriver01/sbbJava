package main.java.objektOrientedDesign.zoo.Enclosure;

public class Terrarium extends Enclosure{
    private double humidity;
    private double fenceHeight;
    public Terrarium(int enclosureNumber, double surfaceArea, int fenceHeight, int capacity, double humidity,
                     double temperature, boolean moat) {
        super(enclosureNumber, surfaceArea, capacity, temperature, moat);
        this.humidity = humidity;
        this.fenceHeight = fenceHeight;
    }
}