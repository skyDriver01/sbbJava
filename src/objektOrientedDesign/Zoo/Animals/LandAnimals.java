package objektOrientedDesign.Zoo.Animals;

public class LandAnimals extends Animals{
    String skin;
    String foodPrefrence;
    boolean bipedal;

    public LandAnimals(int enclosureNumber, boolean alive,String speciesName, String skin, String foodPrefrence, boolean bipedal) {
        super(alive, speciesName,enclosureNumber);
        this.skin = skin;
        this.foodPrefrence = foodPrefrence;
        this.bipedal = bipedal;
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

    public boolean isBipedal() {
        return bipedal;
    }

    public void setBipedal(boolean bipedal) {
        this.bipedal = bipedal;
    }
}