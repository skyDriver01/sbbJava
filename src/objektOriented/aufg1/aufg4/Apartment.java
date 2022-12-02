package objektOriented.aufg1.aufg4;

public class Apartment {
    public static String address; //TODO maybe make it an enum not a String
    private int floor;
    private int houseNumber;
    public static String price;
    private String description;
    private String tenant;

    public Apartment(String adress, int floor, int houseNumber, String price, String description, String tenant) {
        this.address = adress;
        this.floor = floor;
        this.houseNumber = houseNumber;
        this.price = price;
        this.description = description;
        this.tenant = tenant;
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTenant() {
        return tenant;
    }
}