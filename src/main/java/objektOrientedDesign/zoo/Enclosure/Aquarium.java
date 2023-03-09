package main.java.objektOrientedDesign.zoo.Enclosure;

public class Aquarium extends Enclosure {
    private WaterType waterType;
    private double fenceHeight;

    public enum WaterType {SALT, SWEET}


    public Aquarium(int enclosureNumber, double surfaceArea, int fenceHeight, int capacity,
                    double temperature, boolean moat, WaterType waterType) {
        super(enclosureNumber, surfaceArea, capacity, temperature, moat);
        this.waterType = waterType;
        this.fenceHeight = fenceHeight;
    }
    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
}
