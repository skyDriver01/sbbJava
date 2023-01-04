package objektOrientedDesign;

public class Amphibia extends Animals{
    String skin;
    String foodPrefrence;
    private BloodTemperature bloodTemperature;
    public enum BloodTemperature {WARM, COLD}

    public Amphibia(boolean alive, String skin, String foodPrefrence, BloodTemperature bloodTemperature) {
        super(alive);
        this.skin = skin;
        this.foodPrefrence = foodPrefrence;
        this.bloodTemperature = bloodTemperature;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getFoodPrefrence() {
        return foodPrefrence;
    }

    public void setFoodPrefrence(String foodPrefrence) {
        this.foodPrefrence = foodPrefrence;
    }

    public BloodTemperature getBloodTemperature() {
        return bloodTemperature;
    }

    public void setBloodTemperature(BloodTemperature bloodTemperature) {
        this.bloodTemperature = bloodTemperature;
    }
}
