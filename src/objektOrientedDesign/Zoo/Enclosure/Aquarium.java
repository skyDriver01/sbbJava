package objektOrientedDesign.Zoo.Enclosure;

public class Aquarium extends Enclosure {
    private WaterType waterType;

    public enum WaterType {SALT, SWEET}


    public Aquarium(int enclosureNumber, double surfaceArea, int fenceHeight, int capacity, double humidity,
                    double temperature, boolean moat, WaterType waterType) {
        super(enclosureNumber, surfaceArea, fenceHeight, capacity, humidity, temperature, moat);
        this.waterType = waterType;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
}
