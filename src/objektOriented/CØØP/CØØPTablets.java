package objektOriented.CØØP;

import objektOriented.aufg1.aufg2.InputIn;

public class CØØPTablets {

    public void access() {
        getAccessToLists();
        System.out.println("Welcome to CØØP. Here is a list of all our Firms Locations so you shall find what you desire.");
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
    }
}