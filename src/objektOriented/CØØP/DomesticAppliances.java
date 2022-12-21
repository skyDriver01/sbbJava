package objektOriented.CØØP;

public class DomesticAppliances {
    private String product;
    private int price;
    private boolean barcode;

    public DomesticAppliances(String product, int price, boolean barcode) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBarcode() {
        return barcode;
    }

    public void setBarcode(boolean barcode) {
        this.barcode = barcode;
    }
}
