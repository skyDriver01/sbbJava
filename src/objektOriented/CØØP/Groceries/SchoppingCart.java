package objektOriented.CØØP.Groceries;

public class SchoppingCart {
    private String product;
    private double cost;
    private boolean barcode;

    public SchoppingCart(String product, double cost, boolean barcode) {
        this.product = product;
        this.cost = cost;
        this.barcode = barcode;
    }

    public boolean isBarcode() {
        return barcode;
    }

    public void setBarcode(boolean barcode) {
        this.barcode = barcode;
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