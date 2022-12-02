package objektOriented.aufg1.aufg4;

public class Property {
    private String administrator;
    private String janitor;
    private String employee;
    private String address;

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getJanitor() {
        return janitor;
    }

    public void setJanitor(String janitor) {
        this.janitor = janitor;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getAddress() {
        return address;
    }

    public Property(String administrator, String janitor, String employee, String address) {
        this.administrator = administrator;
        this.janitor = janitor;
        this.employee = employee;
        this.address = address;
    }
}