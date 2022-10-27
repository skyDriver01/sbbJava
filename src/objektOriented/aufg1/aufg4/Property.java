package objektOriented.aufg1.aufg4;

public class Property {
    private String Administrator;
    private String Janitor;
    private String Employee;
    private String Address;
    private String Apartment;
    private int Floor;
    private int HouseNumber;
    private String Description;
    private String Tenant;

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

    public String getApartment() {
        return Apartment;
    }

    public void setApartment(String apartment) {
        Apartment = apartment;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        HouseNumber = houseNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTenant() {
        return Tenant;
    }

    public void setTenant(String tenant) {
        Tenant = tenant;
    }

    public Property(String administrator, String janitor, String employee, String address, String apartment, int floor, int houseNumber, String description, String tenant) {
        Administrator = administrator;
        Janitor = janitor;
        Employee = employee;
        Address = address;
        Apartment = apartment;
        Floor = floor;
        HouseNumber = houseNumber;
        Description = description;
        Tenant = tenant;
    }
}
