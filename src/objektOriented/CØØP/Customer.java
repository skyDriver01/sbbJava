package objektOriented.CØØP;

public class Customer {
    private int money;
    private String kreditkard;
    private String schüperCard;
    private String name;

    public Customer(int money, String kreditkard, String schüperCard, String name) {
        this.money = money;
        this.kreditkard = kreditkard;
        this.schüperCard = schüperCard;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
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
}
