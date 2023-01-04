package objektOrientedDesign;

public class WaterAnimals extends Animals {
    String type;
    String food;
    private WaterType waterType;

    public enum WaterType {SALT, SWEET}

    private BreathType breathType;

    public enum BreathType {GILLS, LUNGS}

    public WaterAnimals(boolean alive, String type, String food, WaterType waterType, BreathType breathType) {
        super(alive);
        this.type = type;
        this.food = food;
        this.waterType = waterType;
        this.breathType = breathType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

    public BreathType getBreathType() {
        return breathType;
    }

    public void setBreathType(BreathType breathType) {
        this.breathType = breathType;
    }
}