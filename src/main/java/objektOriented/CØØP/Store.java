package objektOriented.CØØP;

public class Store {
    private String kanton;
    private String address;

    public Store(String kanton, String address) {
        this.kanton = kanton;
        this.address = address;
    }

    public String getKanton() {
        return kanton;
    }

    public void setKanton(String kanton) {
        this.kanton = kanton;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
