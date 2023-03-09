package main.java.objektOriented.aufg1.aufg4;

public class Apartment {
    public String address;
    private int floor;
    private int houseNumber;
    public String monthlyPrice;
    private String description;
    private Contract contract;

    public Apartment(String address, int floor, int houseNumber, String monthlyPrice, String description, Contract contract) {
        this.address = address;
        this.floor = floor;
        this.houseNumber = houseNumber;
        this.monthlyPrice = monthlyPrice;
        this.description = description;
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
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