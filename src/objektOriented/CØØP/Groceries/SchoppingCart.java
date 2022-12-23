package objektOriented.CØØP.Groceries;

public class SchoppingCart {
    private String product;
    private double cost;

    public SchoppingCart(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}