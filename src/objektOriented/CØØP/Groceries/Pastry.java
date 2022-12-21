package objektOriented.CØØP.Groceries;

public class Pastry {
    private String product;
    private int price;
    private String articleCode;

    public Pastry(String product, int price, String articleCode) {
        this.product = product;
        this.price = price;
        this.articleCode = articleCode;
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

    public String getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }
}
