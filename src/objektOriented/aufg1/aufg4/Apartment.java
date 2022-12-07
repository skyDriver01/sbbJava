package objektOriented.aufg1.aufg4;

public class Apartment {
    public String address; //TODO maybe make it an enum not a String
    private int floor;
    private int houseNumber;
    public String monthlyPrice;
    private String description;

    public Apartment(String adress, int floor, int houseNumber, String price, String description) {
        this.address = adress;
        this.floor = floor;
        this.houseNumber = houseNumber;
        this.monthlyPrice = price;
        this.description = description;
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

    public String getMonthlyPrice() {
        return monthlyPrice;
    }

    public String getDescription() {
        return description;
    }
}