package objektOriented.CØØP;

public class Shelf {
    private int shelfNumber;
    private String products;
    private String address;

    public Shelf(int shelfNumber, String products, String address) {
        this.shelfNumber = shelfNumber;
        this.products = products;
        this.address = address;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
