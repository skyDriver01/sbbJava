package objektOriented.CØØP.Groceries;

public class BuildingMaterial {
    private String product;
    private double price;
    private boolean barcode;

    public BuildingMaterial(String product, double price, boolean barcode) {
        this.product = product;
        this.price = price;
        this.barcode = barcode;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBarcode() {
        return barcode;
    }

    public void setBarcode(boolean barcode) {
        this.barcode = barcode;
    }
}
