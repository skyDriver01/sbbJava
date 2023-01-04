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

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setBarcode(boolean barcode) {
        this.barcode = barcode;
    }
}