package objektOriented.CØØP;

import objektOriented.aufg1.aufg2.InputIn;

public class CØØPTablets {

    public void access() {
        getAccessToLists();
        String getItemClass = InputIn.nextLineOut("Welcome to CØØP. What kind of Item are you searching for? These are the Item Options: (Vegetables, Fruits, Sweets, Drinks, Hygiene, Pastries, Domestic Appliances, Building Materials)");
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
                CØØPLists.vegetablesList
                        .stream()
                        .filter(a -> a
                                .getProduct()
                                .equals(getVeggies))
                        .forEach(a -> System.out.println(a.getPrice()));
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
            }
            default -> System.out.println("That Category does not exist");
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
/*
CØØPLists.storesList
                .stream()
                .forEach(a -> System.out.println(
                        "The Stores Address: " + a.getAddress() + ", The Kanton its in: " + a.getKanton()));
        System.out.println("-----------------------------------------------------------------------------------");
String chooseAStore = InputIn.nextLineOut("What Store would you like to look over? Type in only to the Stores Address.");
switch (chooseAStore){
            case "Wangen an der Aare" -> {
                System.out.println("What would you like to buy in this Store?");

            }
            case "Bern Bahnhof" -> {}
            case "Zürich Bahnhof" -> {}
            case "Zürichsee" -> {}
            case "Grosse Schanze" -> {}
        }
 */