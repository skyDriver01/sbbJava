package objektOriented.CØØP;

public class BuildingMaterial {
    private String product;
    private String price;
    private boolean barcode;

    public BuildingMaterial(String product, String price, boolean barcode) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isBarcode() {
        return barcode;
    }

    public void setBarcode(boolean barcode) {
        this.barcode = barcode;
    }
}
