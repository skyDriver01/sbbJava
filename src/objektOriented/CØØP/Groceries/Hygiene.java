package objektOriented.CØØP.Groceries;

public class Hygiene {
    private String product;
    private int price;
    private boolean barcode;

    public Hygiene(String product, int price, boolean barcode) {
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
