package objektOriented.CØØP;

import objektOriented.CØØP.Groceries.*;

import java.util.ArrayList;
import java.util.List;

public class CØØPLists {
    public static List <Vegetable> vegetablesList;
    public static List <Fruit> fruitsList;
    public static List <Drink> drinksList;
    public static List <Schüpercard> schüpercardsList;
    public static List <Sweet> sweetsList;
    public static List <DomesticAppliance> domesticAppliancesList;
    public static List <BuildingMaterial> buildingMaterialList;
    public static List <Shelf> shelvesList;
    public static List <Store> storesList;
    public static List <Pastry> pastryList;
    public static List <Hygiene> hygieneList;
    public static List <Worker> workerList;
    public static List <SchoppingCart> schoppingCarts;

    public List vegetableList() {
        List <Vegetable> vegetables = new ArrayList <>();
        vegetables.add(new Vegetable("Potato", 0.40, true));
        vegetables.add(new Vegetable("Onion", 0.65, true));
        vegetables.add(new Vegetable("Carrot", 0.75, true));
        vegetables.add(new Vegetable("Tomato", 0.80, true));
        vegetables.add(new Vegetable("Cucumber", 0.85, true));
        vegetables.add(new Vegetable("Radish", 1, true));
        vegetables.add(new Vegetable("Beet", 1.10, true));
        vegetables.add(new Vegetable("Broccoli", 1.15, true));
        vegetables.add(new Vegetable("Salad", 2.10, true));
        vegetablesList = vegetables;
        return vegetables;
    }

    public List fruitList() {
        List <Fruit> fruits = new ArrayList <>();
        fruits.add(new Fruit("Pear", 0.95, true));
        fruits.add(new Fruit("Apple", 1.20, true));
        fruits.add(new Fruit("Papaya", 1.20, true));
        fruits.add(new Fruit("Kiwi", 1.20, true));
        fruits.add(new Fruit("Mango", 1.30, true));
        fruits.add(new Fruit("Strawberry", 1.50, true));
        fruits.add(new Fruit("Pomegranate", 2.50, true));
        fruits.add(new Fruit("Pineapple", 3, true));
        fruitsList = fruits;
        return fruits;
    }

    public List sweetsList() {
        List <Sweet> sweets = new ArrayList <>();
        sweets.add(new Sweet("Caramels", 0.50, true));
        sweets.add(new Sweet("Pop Rocks", 1.40, true));
        sweets.add(new Sweet("Chocolate", 1.50, true));
        sweets.add(new Sweet("Salted Chips", 1.75, true));
        sweets.add(new Sweet("Gummy Worms", 1.80, true));
        sweets.add(new Sweet("Kinder Bueno", 2.10, true));
        sweets.add(new Sweet("Kinder Choco Bons", 2.50, true));
        sweets.add(new Sweet("Maltesers", 4.10, true));
        sweetsList = sweets;
        return sweets;
    }

    public List domesticApplianceList() {
        List <DomesticAppliance> domesticAppliances = new ArrayList <>();
        domesticAppliances.add(new DomesticAppliance("Lighter", 4, true));
        domesticAppliances.add(new DomesticAppliance("Pot", 5.65, true));
        domesticAppliances.add(new DomesticAppliance("Knife", 7.50, true));
        domesticAppliances.add(new DomesticAppliance("Spatula", 8, true));
        domesticAppliances.add(new DomesticAppliance("Dishes", 12.50, true));
        domesticAppliances.add(new DomesticAppliance("Frying Pan", 15, true));
        domesticAppliances.add(new DomesticAppliance("Kettle", 20.50, true));
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

    public List <Shelf> shelvesList() {
        List <Shelf> shelves = new ArrayList <>();
        shelves.add(new Shelf(0, "Drinks", "Wangen an der Aare"));
        shelves.add(new Shelf(1, "Fruits", "Wangen an der Aare"));
        shelves.add(new Shelf(2, "Vegetables", "Wangen an der Aare"));
        shelves.add(new Shelf(4, "Sweets", "Wangen an der Aare"));
        shelves.add(new Shelf(5, "Pastry", "Wangen an der Aare"));
        shelves.add(new Shelf(21, "Building Materials", "Wangen an der Aare"));

        shelves.add(new Shelf(3, "Domestic Appliances", "Bern Bahnhof"));
        shelves.add(new Shelf(6, "Hygiene", "Bern Bahnhof"));
        shelves.add(new Shelf(7, "Drinks", "Bern Bahnhof"));
        shelves.add(new Shelf(9, "Vegetables", "Bern Bahnhof"));
        shelves.add(new Shelf(12, "Pastry", "Bern Bahnhof"));
        shelves.add(new Shelf(23, "Building Materials", "Bern Bahnhof"));

        shelves.add(new Shelf(8, "Fruits", "Zürichsee"));
        shelves.add(new Shelf(11, "Sweets", "Zürichsee"));
        shelves.add(new Shelf(13, "Hygiene", "Zürichsee"));
        shelves.add(new Shelf(14, "Drinks", "Zürichsee"));

        shelves.add(new Shelf(10, "Domestic Appliances", "Grosse Schanze"));
        shelves.add(new Shelf(15, "Fruits", "Grosse Schanze"));
        shelves.add(new Shelf(16, "Vegetables", "Grosse Schanze"));
        shelves.add(new Shelf(18, "Sweets", "Grosse Schanze"));

        shelves.add(new Shelf(17, "Domestic Appliances", "Zürich Bahnhof"));
        shelves.add(new Shelf(19, "Pastry", "Zürich Bahnhof"));
        shelves.add(new Shelf(20, "Hygiene", "Zürich Bahnhof"));
        shelves.add(new Shelf(22, "Building Materials", "Zürich Bahnhof"));

        shelvesList = shelves;
        return shelves;

    }

    public List <Store> storeList() {
        List <Store> stores = new ArrayList <>();
        stores.add(new Store("Bern", "Wangen an der Aare"));
        stores.add(new Store("Bern", "Bern Bahnhof"));
        stores.add(new Store("Bern", "Grosse Schanze"));
        stores.add(new Store("Zürich", "Zürich Bahnhof"));
        stores.add(new Store("Zürich", "Zürichsee"));
        storesList = stores;
        return stores;
    }

    public List pastryList() {
        List <Pastry> pastries = new ArrayList <>();
        pastries.add(new Pastry("Bread", 0.80,false));
        pastries.add(new Pastry("Croissant", 1.20,false));
        pastries.add(new Pastry("Weggli", 1,false));
        pastries.add(new Pastry("Donut", 2.10,false));
        pastries.add(new Pastry("Bretzel", 2.40,false));
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
        schüpercardsList = schüpercards;
        return schüpercards;
    }

    public List schopppingCartList() {
        List <SchoppingCart> cart = new ArrayList <>();
        cart.add(new SchoppingCart("", 0, true));
        schoppingCarts = cart;
        return cart;
    }

    public List drinkList() {
        List <Drink> drinks = new ArrayList <>();
        drinks.add(new Drink("Ice Tea", 0.80, true));
        drinks.add(new Drink("Fanta", 1.50, true));
        drinks.add(new Drink("Redbull", 2.35, true));
        drinks.add(new Drink("Sprite", 1.60, true));
        drinks.add(new Drink("Cola", 1.75, true));
        drinks.add(new Drink("Schorle", 2.10, true));
        drinks.add(new Drink("Pepsi", 3, true));
        drinksList = drinks;
        return drinks;
    }
}