package objektOriented.CØØP;

import objektOriented.CØØP.Groceries.*;
import objektOriented.aufg1.aufg2.InputIn;

import static objektOriented.CØØP.CØØPLists.schoppingCarts;

public class CØØPTablets {

    public void access() {
        getAccessToLists();
        boolean getProduce = false;
        getAllCases(getProduce);
    }

    private static void getAllCases(boolean getProduce) {
        while (!getProduce) {
            System.out.println("");
            String getItemClass = InputIn.nextLineOut(
                    "Welcome to CØØP. What kind of Item are you searching for? These are the Item Options:" +
                    " (Vegetables, Fruits, Sweets, Drinks, Hygiene, Pastries, Domestic Appliances, Building Materials)" +
                    " If you got all your Items just Type Register and if you want to check your Cart just type Cart");
            getProduce = options(getProduce, getItemClass);
        }
    }

    private static boolean options(boolean getProduce, String getItemClass) {
        switch (getItemClass) {

            case "Vegetables" -> {
                Vegetable veggie = getVegetable(getItemClass);
                addVegetableToCart(veggie);
            }

            case "Fruits" -> {
                Fruit fruit = getFruit(getItemClass);
                addFruitToCart(fruit);
            }

            case "Sweets" -> {
                Sweet sweet = getSweet(getItemClass);
                addSweetToCart(sweet);
            }

            case "Drinks" -> {
                Drink drinks = getDrink(getItemClass);
                addDrinkToCart(drinks);
            }

            case "Hygiene" -> {
                Hygiene hygiene = getHygiene(getItemClass);
                addHygieneToCart(hygiene);
            }

            case "Pastries" -> {
                Pastry pastry = getPastry(getItemClass);
                addPastryToCart(pastry);
            }

            case "Domestic Appliances" -> {
                DomesticAppliance domesticAppliances = getDomesticAppliance(getItemClass);
                addDomesticApplianceToCart(domesticAppliances);
            }

            case "Building Materials" -> {
                BuildingMaterial buildingMaterial = getBuildingMaterial(getItemClass);
                addBuildingMaterialsToCart(buildingMaterial);
            }

            case "Cart" -> {
                cart();
            }

            case "Register" -> {
                getProduce = true;
                String register =
                        InputIn.nextLineOut("Would you like to use a Self Scan Register or go to a normal one? Type Self Scan or Normal");
                switch (register) {
                    case "Self Scan" -> selfScan();
                    case "Normal" -> normalRegister();
                }
            }
            default -> System.out.println("That Category does not exist");
        }
        return getProduce;
    }

    private static void addVegetableToCart(Vegetable veggie) {
        if(veggie != null) {
            System.out.println(veggie.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + veggie.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(veggie.getProduct(), veggie.getPrice(), veggie.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static Vegetable getVegetable(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getVeggies =
                InputIn.nextLineOut("Type a veggie or anything else and we will tell you if that is available and in what stores.");
        Vegetable veggie = CØØPLists.vegetablesList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getVeggies))
                .findFirst()
                .orElse(null);
        return veggie;
    }

    private static void addFruitToCart(Fruit fruit) {
        if(fruit != null) {
            System.out.println(fruit.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + fruit.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(fruit.getProduct(), fruit.getPrice(), fruit.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static Fruit getFruit(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getFruits =
                InputIn.nextLineOut("Type a Fruit or anything else and we will tell you if that is available and in what stores.");
        Fruit fruit = CØØPLists.fruitsList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getFruits))
                .findFirst()
                .orElse(null);
        return fruit;
    }

    private static void addSweetToCart(Sweet sweet) {
        if(sweet != null) {
            System.out.println(sweet.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + sweet.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(sweet.getProduct(), sweet.getPrice(), sweet.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static Sweet getSweet(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getSweets =
                InputIn.nextLineOut("Type a Sweet or anything else and we will tell you if that is available and in what stores.");
        Sweet sweet = CØØPLists.sweetsList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getSweets))
                .findFirst()
                .orElse(null);
        return sweet;
    }

    private static void addDrinkToCart(Drink drink) {
        if(drink != null) {
            System.out.println(drink.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + drink.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(drink.getProduct(), drink.getPrice(), drink.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static Drink getDrink(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getDrinks =
                InputIn.nextLineOut("Type a Drink or anything else and we will tell you if that is available and in what stores.");
        Drink drinks = CØØPLists.drinksList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getDrinks))
                .findFirst()
                .orElse(null);
        return drinks;
    }

    private static void addHygieneToCart(Hygiene hygiene) {
        if(hygiene != null) {
            System.out.println(hygiene.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + hygiene.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(hygiene.getProduct(), hygiene.getPrice(), hygiene.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static Hygiene getHygiene(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getHygiene =
                InputIn.nextLineOut("Type a Hygiene Product or anything else and we will tell you if that is available and in what stores.");
        Hygiene hygiene = CØØPLists.hygieneList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getHygiene))
                .findFirst()
                .orElse(null);
        return hygiene;
    }

    private static void addPastryToCart(Pastry pastry) {
        if(pastry != null) {
            System.out.println(pastry.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + pastry.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(pastry.getProduct(), pastry.getPrice(), pastry.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static Pastry getPastry(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getPastries =
                InputIn.nextLineOut("Type a Pastry or anything else and we will tell you if that is available and in what stores.");
        Pastry pastry = CØØPLists.pastryList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getPastries))
                .findFirst()
                .orElse(null);
        return pastry;
    }

    private static void addDomesticApplianceToCart(DomesticAppliance domesticAppliances) {
        if(domesticAppliances != null) {
            System.out.println(domesticAppliances.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + domesticAppliances.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(domesticAppliances.getProduct(), domesticAppliances.getPrice(), domesticAppliances.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static DomesticAppliance getDomesticAppliance(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getDomestics =
                InputIn.nextLineOut("Type a Domestic Appliance or anything else and we will tell you if that is available and in what stores.");
        DomesticAppliance domesticAppliances = CØØPLists.domesticAppliancesList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getDomestics))
                .findFirst()
                .orElse(null);
        return domesticAppliances;
    }

    private static void addBuildingMaterialsToCart(BuildingMaterial buildingMaterial) {
        if(buildingMaterial != null) {
            System.out.println(buildingMaterial.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + buildingMaterial.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        schoppingCarts.add(new SchoppingCart(buildingMaterial.getProduct(), buildingMaterial.getPrice(), buildingMaterial.isBarcode()));

                    }
                    System.out.println("The Items were successfully added to your Cart");
                }
                default -> System.out.println("Ok");
            }
        } else {
            System.out.println("Sorry we do not have that product.");
        }
    }

    private static BuildingMaterial getBuildingMaterial(String getItemClass) {
        CØØPLists.shelvesList
                .stream()
                .filter(a -> a
                        .getProducts()
                        .equals(getItemClass))
                .forEach(a -> System.out.println(
                        "These are the Shelf Numbers of the Product Type you are Looking for: " + a.getShelfNumber() +
                        " and the Address of the Store from that Shelf is: " + a.getAddress()));
        String getBuilding =
                InputIn.nextLineOut("Type a Building Material or anything else and we will tell you if that is available and in what stores.");
        BuildingMaterial buildingMaterial = CØØPLists.buildingMaterialList
                .stream()
                .filter(a -> a
                        .getProduct()
                        .equals(getBuilding))
                .findFirst()
                .orElse(null);
        return buildingMaterial;
    }

    private static double listAllProducts() {
        double totalCost = schoppingCarts
                .stream()
                .mapToDouble(b -> b.getCost())
                .sum();
        schoppingCarts
                .stream()
                .forEach(a -> System.out.println(a.getProduct()));
        schoppingCarts
                .stream()
                .filter(a -> !a.isBarcode())
                .forEach(a -> System.out.println(a.getProduct()));
        return totalCost;
    }

    private static void cart() {
        getAllItemsInCart();
        String removeItem = InputIn.nextLineOut("Do you want to remove an Item? Yes or No");
        switch (removeItem) {
            case "Yes" -> {

                String chooseItem = InputIn.nextLineOut("What Item do you want to remove");
                try {
                    CØØPLists.schoppingCarts.remove(CØØPLists.schoppingCarts
                                                            .stream()
                                                            .filter(a -> {
                                                                if(a != null) {
                                                                    return chooseItem.equals(a.getProduct());
                                                                }
                                                                return false;
                                                            })
                                                            .toList()
                                                            .get(0));

                } catch (IndexOutOfBoundsException e) {
                    System.out.println("That Product is not in your cart");
                }
            }
        }
    }

    private static void getAllItemsInCart() {
        schoppingCarts
                .stream()
                .forEach(a -> System.out.println(a.getProduct()));
        double totalCost = schoppingCarts
                .stream()
                .mapToDouble(a -> a.getCost())
                .sum();
        System.out.println("Your Current Price of all the Items together is: " + totalCost + "FR.");
    }

    private static void selfScan() {
        double totalCost = listAllProducts();
        scanAllItems();
        getTheSchüperPoints(totalCost);
    }

    private static void scanAllItems() {
        boolean noBarCode = false;
        for (int i = 0; i < schoppingCarts.size(); i++) {
            if(!schoppingCarts
                    .get(i)
                    .isBarcode()) {
                noBarCode = true;
            }
        }
        scanAllPastries(noBarCode);
    }

    private static void scanAllPastries(boolean noBarCode) {
        while (noBarCode) {

            for (SchoppingCart pastries : schoppingCarts) {
                String scan = InputIn.nextLineOut("Enter the Pastries in your Cart to scan them");
                if(pastries
                        .getProduct()
                        .equals(scan)) {
                    pastries.setBarcode(true);
                }
            }
            noBarCode = false;
        }
    }

    private static void getTheSchüperPoints(double totalCost) {
        System.out.println("Your Current Price of all the Items together is: " + totalCost + "FR.");
        double total = 0;
        for (int i = 0; i < schoppingCarts.size(); i++) {
            total += schoppingCarts
                    .get(i)
                    .getCost();

        }
        schüperCard(total);
    }

    private static void normalRegister() {
        getAllItemsInCart();
        double total = 0;
        for (int i = 0; i < schoppingCarts.size(); i++) {
            total += schoppingCarts
                    .get(i)
                    .getCost();
        }
        schüperCard(total);
    }

    private static void schüperCard(double total) {
        int points = (int) Math.floor(total);
        String schuperCard = InputIn.nextLineOut("Do you have a Schupercard to scan? Yes or No");
        switch (schuperCard) {
            case "Yes" -> {
                System.out.println("You now have: ");
                CØØPLists.schüpercardsList
                        .stream()
                        .forEach(a -> System.out.println(a.setPoints(points)));
                System.out.println(" Points on your SchüperCard");

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
        cøøpLists.schopppingCartList();
    }
}