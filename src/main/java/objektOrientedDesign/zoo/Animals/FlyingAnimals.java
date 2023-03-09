package main.java.objektOrientedDesign.zoo.Animals;

public class FlyingAnimals extends Animals {
    private boolean canFly;
    private String foodType;

    public FlyingAnimals(int enclosureNumber, boolean alive,String speciesName, boolean canFly, String foodType) {
        super(alive, speciesName, enclosureNumber);
        this.canFly = canFly;
        this.foodType = foodType;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
