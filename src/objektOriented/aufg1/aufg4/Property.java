package objektOriented.aufg1.aufg4;

public class Property {
    private String Administrator;
    private String Janitor;
    private String Employee;
    private String Address;

    public String getAdministrator() {
        return Administrator;
    }

    public void setAdministrator(String administrator) {
        Administrator = administrator;
    }

    public String getJanitor() {
        return Janitor;
    }

    public void setJanitor(String janitor) {
        Janitor = janitor;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Property(String administrator, String janitor, String employee, String address) {
        Administrator = administrator;
        Janitor = janitor;
        Employee = employee;
        Address = address;
    }
}
