package objektOriented.CØØP;

import objektOriented.CØØP.Groceries.*;
import objektOriented.aufg1.aufg2.InputIn;

public class CØØPTablets {

    public void access() {
        getAccessToLists();
        boolean getProduce = false;
        while (!getProduce) {
            System.out.println("");
            String getItemClass = InputIn.nextLineOut("Welcome to CØØP. What kind of Item are you searching for? These are the Item Options: (Vegetables, Fruits, Sweets, Drinks, Hygiene, Pastries, Domestic Appliances, Building Materials) If you got all your Items just Type Register");
            switch (getItemClass) {
                case "Vegetables" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getVeggies = InputIn.nextLineOut("Type a veggie or anything else and we will tell you if that is available and in what stores.");
                    Vegetables veggie = CØØPLists.vegetablesList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getVeggies))
                            .findFirst()
                            .orElse(null);

                    if(veggie != null) {
                        System.out.println(veggie.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }

                }
                case "Fruits" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getFruits = InputIn.nextLineOut("Type a Fruit or anything else and we will tell you if that is available and in what stores.");
                    Fruits fruit = CØØPLists.fruitsList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getFruits))
                            .findFirst()
                            .orElse(null);

                    if(fruit != null) {
                        System.out.println(fruit.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Sweets" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getSweets = InputIn.nextLineOut("Type a Sweet or anything else and we will tell you if that is available and in what stores.");
                    Sweets sweet = CØØPLists.sweetsList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getSweets))
                            .findFirst()
                            .orElse(null);

                    if(sweet != null) {
                        System.out.println(sweet.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Drinks" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getDrinks = InputIn.nextLineOut("Type a Drink or anything else and we will tell you if that is available and in what stores.");
                    Drink drinks = CØØPLists.drinksList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getDrinks))
                            .findFirst()
                            .orElse(null);

                    if(drinks != null) {
                        System.out.println(drinks.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Hygiene" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getHygiene = InputIn.nextLineOut("Type a Hygiene Product or anything else and we will tell you if that is available and in what stores.");
                    Hygiene hygiene = CØØPLists.hygieneList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getHygiene))
                            .findFirst()
                            .orElse(null);

                    if(hygiene != null) {
                        System.out.println(hygiene.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Pastries" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getPastries = InputIn.nextLineOut("Type a Pastry or anything else and we will tell you if that is available and in what stores.");
                    Pastry pastry = CØØPLists.pastryList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getPastries))
                            .findFirst()
                            .orElse(null);

                    if(pastry != null) {
                        System.out.println(pastry.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Domestic Appliances" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getDomestics = InputIn.nextLineOut("Type a Domestic Appliance or anything else and we will tell you if that is available and in what stores.");
                    DomesticAppliances domesticAppliances = CØØPLists.domesticAppliancesList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getDomestics))
                            .findFirst()
                            .orElse(null);

                    if(domesticAppliances != null) {
                        System.out.println(domesticAppliances.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Building Materials" -> {
                    CØØPLists.shelvesList
                            .stream()
                            .filter(a -> a
                                    .getProducts()
                                    .equals(getItemClass))
                            .forEach(a -> System.out.println(
                                    "These are the Shelf Numbers of the Product Type you are Looking for: " +
                                    a.getShelfNumber() + " and the Address of the Store from that Shelf is: " +
                                    a.getAddress()));
                    String getBuilding = InputIn.nextLineOut("Type a Building Material or anything else and we will tell you if that is available and in what stores.");
                    BuildingMaterial buildingMaterial = CØØPLists.buildingMaterialList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getBuilding))
                            .findFirst()
                            .orElse(null);

                    if(buildingMaterial != null) {
                        System.out.println(buildingMaterial.getPrice() + "FR.");
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Register" -> getProduce = false;
                default -> System.out.println("That Category does not exist");
            }
        }


    }

    public void getAccessToLists() {
        CØØPLists cøøpLists = new CØØPLists();
        cøøpLists.storeList();
        cøøpLists.pastryList();
        cøøpLists.shelvesList();
        cøøpLists.vegetableList();
        cøøpLists.drinkList();
        cøøpLists.domesticApplianceList();
        cøøpLists.buildingMaterialsList();
        cøøpLists.fruitList();
        cøøpLists.hygieneList();
        cøøpLists.schüpercardList();
        cøøpLists.sweetsList();
        cøøpLists.workerList();
        cøøpLists.customerList();
    }
}