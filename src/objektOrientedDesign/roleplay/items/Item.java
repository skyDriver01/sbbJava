package objektOrientedDesign.roleplay.items;

public class Item {
    String item;
    double weight;

    public Item(String item,double weight) {
        this.item = item;
        this.weight = weight;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}