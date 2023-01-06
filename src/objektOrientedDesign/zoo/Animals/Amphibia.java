package objektOrientedDesign.zoo.Animals;

public class Amphibia extends Animals {
    String skin;
    String foodPrefrence;

    public Amphibia(int enclosureNumber,boolean alive, String speciesName, String skin, String foodPrefrence) {
        super(alive, speciesName,enclosureNumber);
        this.skin = skin;
        this.foodPrefrence = foodPrefrence;
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
}
