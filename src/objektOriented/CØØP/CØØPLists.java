package objektOriented.CØØP;

import objektOriented.CØØP.Groceries.*;

import java.util.ArrayList;
import java.util.List;

public class CØØPLists {
    public static List <Vegetables> vegetablesList;
    public static List <Fruits> fruitsList;
    public static List <Drinks> drinksList;
    public static List <Schüpercard> schüpercardsList;
    public static List <Sweets> sweetsList;
    public static List <DomesticAppliances> domesticAppliancesList;
    public static List <BuildingMaterial> buildingMaterialList;
    public static List <Shelves> shelvesList;
    public static List <Stores> storesList;
    public static List <Pastry> pastryList;
    public static List <Hygiene> hygieneList;
    public static List <Worker> workerList;
    public static List <Customer> customersList;

    public List vegetableList() {
        List <Vegetables> vegetables = new ArrayList <>();
        vegetables.add(new Vegetables("Potato", 0.40, true));
        vegetables.add(new Vegetables("Onion", 0.65, true));
        vegetables.add(new Vegetables("Carrot", 0.75, true));
        vegetables.add(new Vegetables("Tomato", 0.80, true));
        vegetables.add(new Vegetables("Cucumber", 0.85, true));
        vegetables.add(new Vegetables("Radish", 1, true));
        vegetables.add(new Vegetables("Beet", 1.10, true));
        vegetables.add(new Vegetables("Broccoli", 1.15, true));
        vegetables.add(new Vegetables("Salad", 2.10, true));
        vegetablesList = vegetables;
        return vegetables;
    }

    public List fruitList() {
        List <Fruits> fruits = new ArrayList <>();
        fruits.add(new Fruits("Pear", 0.95, true));
        fruits.add(new Fruits("Apple", 1.20, true));
        fruits.add(new Fruits("Papaya", 1.20, true));
        fruits.add(new Fruits("Kiwi", 1.20, true));
        fruits.add(new Fruits("Mango", 1.30, true));
        fruits.add(new Fruits("Strawberry", 1.50, true));
        fruits.add(new Fruits("Pomegranate", 2.50, true));
        fruits.add(new Fruits("Pineapple", 3, true));
        fruitsList = fruits;
        return fruits;
    }

    public List sweetsList() {
        List <Sweets> sweets = new ArrayList <>();
        sweets.add(new Sweets("Caramels", 0.50, true));
        sweets.add(new Sweets("Pop Rocks", 1.40, true));
        sweets.add(new Sweets("Chocolate", 1.50, true));
        sweets.add(new Sweets("Salted Chips", 1.75, true));
        sweets.add(new Sweets("Gummy Worms", 1.80, true));
        sweets.add(new Sweets("Kinder Bueno", 2.10, true));
        sweets.add(new Sweets("Kinder Choco Bons", 2.50, true));
        sweets.add(new Sweets("Maltesers", 4.10, true));
        sweetsList = sweets;
        return sweets;
    }

    public List domesticApplianceList() {
        List <DomesticAppliances> domesticAppliances = new ArrayList <>();
        domesticAppliances.add(new DomesticAppliances("Lighter", 4, true));
        domesticAppliances.add(new DomesticAppliances("Pot", 5.65, true));
        domesticAppliances.add(new DomesticAppliances("Knife", 7.50, true));
        domesticAppliances.add(new DomesticAppliances("Spatula", 8, true));
        domesticAppliances.add(new DomesticAppliances("Dishes", 12.50, true));
        domesticAppliances.add(new DomesticAppliances("Frying Pan", 15, true));
        domesticAppliances.add(new DomesticAppliances("Boiler", 20.50, true));
        domesticAppliancesList = domesticAppliances;
        return domesticAppliances;
    }

    public List buildingMaterialsList() {
        List <BuildingMaterial> buildingMaterials = new ArrayList <>();
        buildingMaterials.add(new BuildingMaterial("Leather", 5.75, true));
        buildingMaterials.add(new BuildingMaterial("Wood", 10, true));
        buildingMaterials.add(new BuildingMaterial("Brick", 20, true));
        buildingMaterials.add(new BuildingMaterial("Iron", 30.60, true));
        buildingMaterials.add(new BuildingMaterial("Diamond", 50000, true));
        buildingMaterials.add(new BuildingMaterial("Gold", 10000, true));
        buildingMaterials.add(new BuildingMaterial("Netherite", 100000, true));
        buildingMaterialList = buildingMaterials;
        return buildingMaterials;
    }

    public List <Shelves> shelvesList() {
        List <Shelves> shelves = new ArrayList <>();
        shelves.add(new Shelves(0, "Drinks", "Wangen an der Aare"));
        shelves.add(new Shelves(1, "Fruits", "Wangen an der Aare"));
        shelves.add(new Shelves(2, "Vegetables", "Wangen an der Aare"));
        shelves.add(new Shelves(4, "Sweets", "Wangen an der Aare"));
        shelves.add(new Shelves(5, "Pastry", "Wangen an der Aare"));
        shelves.add(new Shelves(21, "Building Materials", "Wangen an der Aare"));

        shelves.add(new Shelves(3, "Domestic Appliances", "Bern Bahnhof"));
        shelves.add(new Shelves(6, "Hygiene", "Bern Bahnhof"));
        shelves.add(new Shelves(7, "Drinks", "Bern Bahnhof"));
        shelves.add(new Shelves(9, "Vegetables", "Bern Bahnhof"));
        shelves.add(new Shelves(12, "Pastry", "Bern Bahnhof"));
        shelves.add(new Shelves(23, "Building Materials", "Bern Bahnhof"));

        shelves.add(new Shelves(8, "Fruits", "Zürichsee"));
        shelves.add(new Shelves(11, "Sweets", "Zürichsee"));
        shelves.add(new Shelves(13, "Hygiene", "Zürichsee"));
        shelves.add(new Shelves(14, "Drinks", "Zürichsee"));

        shelves.add(new Shelves(10, "Domestic Appliances", "Grosse Schanze"));
        shelves.add(new Shelves(15, "Fruits", "Grosse Schanze"));
        shelves.add(new Shelves(16, "Vegetables", "Grosse Schanze"));
        shelves.add(new Shelves(18, "Sweets", "Grosse Schanze"));

        shelves.add(new Shelves(17, "Domestic Appliances", "Zürich Bahnhof"));
        shelves.add(new Shelves(19, "Pastry", "Zürich Bahnhof"));
        shelves.add(new Shelves(20, "Hygiene", "Zürich Bahnhof"));
        shelves.add(new Shelves(22, "Building Materials", "Zürich Bahnhof"));

        shelvesList = shelves;
        return shelves;

    }

    public List <Stores> storeList() {
        List <Stores> stores = new ArrayList <>();
        stores.add(new Stores("Bern", "Wangen an der Aare"));
        stores.add(new Stores("Bern", "Bern Bahnhof"));
        stores.add(new Stores("Bern", "Grosse Schanze"));
        stores.add(new Stores("Zürich", "Zürich Bahnhof"));
        stores.add(new Stores("Zürich", "Zürichsee"));
        storesList = stores;
        return stores;
    }

    public List pastryList() {
        List <Pastry> pastries = new ArrayList <>();
        pastries.add(new Pastry("Bread", 0.80, "A123"));
        pastries.add(new Pastry("Croissant", 1.20, "A234"));
        pastries.add(new Pastry("Weggli", 1, "A345"));
        pastries.add(new Pastry("Donut", 2.10, "A456"));
        pastries.add(new Pastry("Bretzel", 2.40, "A567"));
        pastryList = pastries;
        return pastries;
    }

    public List hygieneList() {
        List <Hygiene> hygienes = new ArrayList <>();
        hygienes.add(new Hygiene("Labello", 2.15, true));
        hygienes.add(new Hygiene("Hand Cream", 3.20, true));
        hygienes.add(new Hygiene("Floss", 3.50, true));
        hygienes.add(new Hygiene("Axe Deodorant", 4.25, true));
        hygienes.add(new Hygiene("Face Cream", 5.35, true));
        hygienes.add(new Hygiene("Toothbrush", 7.45, true));
        hygieneList = hygienes;
        return hygienes;
    }

    public List workerList() {
        List <Worker> workers = new ArrayList <>();
        workers.add(new Worker("Yanir", "Bern Bahnhof", "Luka", "Cashier"));
        workers.add(new Worker("Jaemi", "Bern Bahnhof", "Luka", "Restocker"));
        workers.add(new Worker("Sven", "Wangen an der Aare", "Nick", "Cashier"));
        workers.add(new Worker("Shervan", "Wangen an der Aare", "Nick", "Restocker"));
        workers.add(new Worker("Neil", "Zürich Bahnhof", "Manuel", "Restocker"));
        workers.add(new Worker("Andrin", "Zürich Bahnhof", "Manuel", "Cashier"));
        workers.add(new Worker("Janik", "Zürichsee", "Steve", "Cashier"));
        workers.add(new Worker("Rahul", "Zürichsee", "Steve", "Restocker"));
        workers.add(new Worker("Tan", "Grosse Schanze", "Oliver", "Cashier"));
        workers.add(new Worker("Lennox", "Grosse Schanze", "Oliver", "Restocker"));
        workerList = workers;
        return workers;
    }

    public List schüpercardList() {
        List <Schüpercard> schüpercards = new ArrayList <>();
        schüpercards.add(new Schüpercard(0, "A111"));
        schüpercards.add(new Schüpercard(0, "A112"));
        schüpercards.add(new Schüpercard(0, "A113"));
        schüpercards.add(new Schüpercard(0, "A114"));
        schüpercards.add(new Schüpercard(0, "A115"));
        schüpercardsList = schüpercards;
        return schüpercards;
    }

    public List customerList() {
        List <Customer> customers = new ArrayList <>();
        customers.add(new Customer(0, "", "", ""));
        customersList = customers;
        return customers;
    }

    public List drinkList() {
        List <Drinks> drinks = new ArrayList <>();
        drinks.add(new Drinks("Ice Tea", 0.80, true));
        drinks.add(new Drinks("Fanta", 1.50, true));
        drinks.add(new Drinks("Redbull", 2.35, true));
        drinks.add(new Drinks("Sprite", 1.60, true));
        drinks.add(new Drinks("Cola", 1.75, true));
        drinks.add(new Drinks("Schorle", 2.10, true));
        drinks.add(new Drinks("Pepsi", 3, true));
        drinksList = drinks;
        return drinks;
    }
}