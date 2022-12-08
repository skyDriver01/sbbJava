package objektOriented.aufg1.aufg4;

public class Property {
    final String administrator;
    final String janitor;
    final String employee;
    final String address;


    public Property(String administrator, String janitor, String employee, String address) {
        this.administrator = administrator;
        this.janitor = janitor;
        this.employee = employee;
        this.address = address;
    }

    public String getJanitor() {
        return janitor;
    }

    public String getAddress() {
        return address;
    }
}