package objektOriented.CØØP;

import java.util.List;

public class Customer {
    private double money;
    private String kreditkard;
    private String schüperCard;
    private String name;
    private String groceryCart;

    public Customer(double money, String kreditkard, String schüperCard, String name, List <String> groceryCart) {
        this.money = money;
        this.kreditkard = kreditkard;
        this.schüperCard = schüperCard;
        this.name = name;
        this.groceryCart = groceryCart.toString();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getKreditkard() {
        return kreditkard;
    }

    public void setKreditkard(String kreditkard) {
        this.kreditkard = kreditkard;
    }

    public String getSchüperCard() {
        return schüperCard;
    }

    public void setSchüperCard(String schüperCard) {
        this.schüperCard = schüperCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroceryCart() {
        return groceryCart;
    }

    public void setGroceryCart(String groceryCart) {
        this.groceryCart = groceryCart;
    }
}
