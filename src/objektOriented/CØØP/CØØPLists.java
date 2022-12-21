package objektOriented.CØØP;

import objektOriented.CØØP.Groceries.*;

import java.util.ArrayList;
import java.util.List;

public class CØØPLists {

    private void vegetableList() {
        List <Vegetables> vegetables = new ArrayList <>();
        vegetables.add(new Vegetables("Cucumber", 0.85, true));
        vegetables.add(new Vegetables("Tomato", 0.80, true));
        vegetables.add(new Vegetables("Carrot", 0.75, true));
        vegetables.add(new Vegetables("Salad", 2.10, true));
        vegetables.add(new Vegetables("Potato", 0.4, true));
        vegetables.add(new Vegetables("Radish", 1, true));
        vegetables.add(new Vegetables("Beet", 1.10, true));
        vegetables.add(new Vegetables("Onion", 0.65, true));
        vegetables.add(new Vegetables("Broccoli", 1.15, true));

    }

    private void fruitList() {
        List <Fruits> fruits = new ArrayList <>();
        fruits.add(new Fruits("Apple", 1.20, true));
        fruits.add(new Fruits("Pear", 0.95, true));
        fruits.add(new Fruits("Pineapple", 3, true));
        fruits.add(new Fruits("Strawberry", 1.50, true));
        fruits.add(new Fruits("Mango", 1.30, true));
        fruits.add(new Fruits("Kiwi", 1.20, true));
        fruits.add(new Fruits("Papaya", 1.20, true));
        fruits.add(new Fruits("Pomegranate", 2.50, true));

    }

    private void sweetsList() {
        List <Sweets> sweets = new ArrayList <>();
        sweets.add(new Sweets("Kinder Bueno", 2.10, true));
        sweets.add(new Sweets("Chocolate", 1.50, true));
        sweets.add(new Sweets("Salted Chips", 1.75, true));
        sweets.add(new Sweets("Caramels", 0.50, true));
        sweets.add(new Sweets("Gummy Worms", 1.80, true));
        sweets.add(new Sweets("Pop Rocks", 1.40, true));
        sweets.add(new Sweets("Kinder Choco Bons", 2.50, true));
        sweets.add(new Sweets("Maltesers", 4.10, true));
    }

    private void domesticApplianceList() {
        List <DomesticAppliances> domesticAppliances = new ArrayList <>();
        domesticAppliances.add(new DomesticAppliances("Knife", 7.50, true));
        domesticAppliances.add(new DomesticAppliances("Frying Pan", 15, true));
        domesticAppliances.add(new DomesticAppliances("Lighter", 4, true));
        domesticAppliances.add(new DomesticAppliances("Pot", 5.65, true));
        domesticAppliances.add(new DomesticAppliances("Dishes", 12.50, true));
        domesticAppliances.add(new DomesticAppliances("Spatula", 8, true));
        domesticAppliances.add(new DomesticAppliances("Boiler", 20.50, true));
    }

    private void buildingMaterialsList() {
        List <BuildingMaterial> buildingMaterials = new ArrayList <>();
        buildingMaterials.add(new BuildingMaterial("Wood", 10, true));
        buildingMaterials.add(new BuildingMaterial("Brick", 20, true));
        buildingMaterials.add(new BuildingMaterial("Iron", 30.60, true));
        buildingMaterials.add(new BuildingMaterial("Leather", 5.75, true));
        buildingMaterials.add(new BuildingMaterial("Diamond", 50000, true));
        buildingMaterials.add(new BuildingMaterial("Gold", 10000, true));
        buildingMaterials.add(new BuildingMaterial("Netherite", 100000, true));
    }

    private void shelvesList() {
        List <Shelves> shelves = new ArrayList <>();
        shelves.add(new Shelves(0, "Drinks", ""));
        shelves.add(new Shelves(1, "Fruits", ""));
        shelves.add(new Shelves(2, "Vegetables", ""));
        shelves.add(new Shelves(3, "Domestic Appliances", ""));
        shelves.add(new Shelves(4, "Sweets", ""));
        shelves.add(new Shelves(5, "Pastry", ""));
        shelves.add(new Shelves(6, "Hygiene", ""));

        shelves.add(new Shelves(7, "Drinks", ""));
        shelves.add(new Shelves(8, "Fruits", ""));
        shelves.add(new Shelves(9, "Vegetables", ""));
        shelves.add(new Shelves(10, "Domestic Appliances", ""));
        shelves.add(new Shelves(11, "Sweets", ""));
        shelves.add(new Shelves(12, "Pastry", ""));
        shelves.add(new Shelves(13, "Hygiene", ""));

        shelves.add(new Shelves(14, "Drinks", ""));
        shelves.add(new Shelves(15, "Fruits", ""));
        shelves.add(new Shelves(16, "Vegetables", ""));
        shelves.add(new Shelves(17, "Domestic Appliances", ""));
        shelves.add(new Shelves(18, "Sweets", ""));
        shelves.add(new Shelves(19, "Pastry", ""));
        shelves.add(new Shelves(20, "Hygiene", ""));

    }

    private void storeList() {
        List <Stores> stores = new ArrayList <>();
        stores.add(new Stores("Bern", ""));
        stores.add(new Stores("Bern", ""));
        stores.add(new Stores("Zürich", ""));
        stores.add(new Stores("Zürich", ""));
        stores.add(new Stores("Basel", ""));
        stores.add(new Stores("Bern", ""));
        stores.add(new Stores("Schwyz", ""));
    }

    private void pastryList() {
        List <Pastry> pastries = new ArrayList <>();
        pastries.add(new Pastry("Bread", 0, ""));
        pastries.add(new Pastry("Croissant", 0, ""));
        pastries.add(new Pastry("Weggli", 0, ""));
        pastries.add(new Pastry("Donut", 0, ""));
        pastries.add(new Pastry("Bretzel", 0, ""));
    }

    private void hygieneList() {        //Hygiene products like face wash or toothbrush usw.
        List <Hygiene> hygienes = new ArrayList <>();
        hygienes.add(new Hygiene("Toothbrush", 7.45, true));
        hygienes.add(new Hygiene("Face Cream", 5.35, true));
        hygienes.add(new Hygiene("Hand Cream", 3.20, true));
        hygienes.add(new Hygiene("Labello", 2.15, true));
        hygienes.add(new Hygiene("Axe Deodorant", 4.25, true));
        hygienes.add(new Hygiene("Floss", 3.50, true));
    }

    private void workerList() {
        List <Worker> workers = new ArrayList <>();
        workers.add(new Worker("Yanir", "", "Luka", "Cashier"));
        workers.add(new Worker("Jaemi", "", "Luka", "Restocker"));
        workers.add(new Worker("Manuel", "", "Nick", "Cashier"));
        workers.add(new Worker("Shervan", "", "Nick", "Restocker"));
        workers.add(new Worker("Neil", "", "Sven", "Restocker"));
        workers.add(new Worker("Andrin", "", "Sven", "Cashier"));
    }

    private void schüpercardList() {
        List <Schüpercard> schüpercards = new ArrayList <>();
        schüpercards.add(new Schüpercard(0, "A111"));
        schüpercards.add(new Schüpercard(0, "A112"));
        schüpercards.add(new Schüpercard(0, "A113"));
        schüpercards.add(new Schüpercard(0, "A114"));
        schüpercards.add(new Schüpercard(0, "A115"));
    }

    private void customerList() {
        List <Customer> customers = new ArrayList <>();
        customers.add(new Customer(0, "", "", ""));
        customers.add(new Customer(0, "", "", ""));
    }

    private void drinkList() {
        List <Drinks> drinks = new ArrayList <>();
        drinks.add(new Drinks("Redbull", 2.35, true));
        drinks.add(new Drinks("Fanta", 1.50, true));
        drinks.add(new Drinks("Cola", 1.75, true));
        drinks.add(new Drinks("Sprite", 1.60, true));
        drinks.add(new Drinks("Ice Tea", 0.80, true));
        drinks.add(new Drinks("Pepsi", 3, true));
        drinks.add(new Drinks("Schorle", 2.10, true));
    }
}
