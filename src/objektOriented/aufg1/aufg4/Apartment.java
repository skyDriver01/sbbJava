package objektOriented.aufg1.aufg4;

public class Apartment {
    private String Adress;
    private int Floor;
    private int HouseNumber;
    String Price;
    private String Description;
    private String Tenant;

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
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

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
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

    public Apartment(String adress, int floor, int houseNumber, String price, String description, String tenant) {
        Adress = adress;
        Floor = floor;
        HouseNumber = houseNumber;
        Price = price;
        Description = description;
        Tenant = tenant;
    }
}
