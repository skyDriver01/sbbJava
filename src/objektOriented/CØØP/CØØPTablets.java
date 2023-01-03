package objektOriented.CØØP;

import objektOriented.CØØP.Groceries.*;
import objektOriented.aufg1.aufg2.InputIn;

public class CØØPTablets {

    public void access() {
        getAccessToLists();
        boolean getProduce = false;
        getAllCases(getProduce);
    }
    // Todo : Register endlich mal machen und alle CASES ZU EIGENEN METHODEN VERÄNDERN DAMIT DIESE EINTE METHODE NICHT MEHR SO LANG IST.
    // Todo : Erst soll man sagen welchen Laden man ansehen will mit der adresse bsp. Wangen an der Aare und dann nur die Produkte ausgeben wo es dort hat mit den Respectiven Shelfs
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
                addVegetableToCart(veggie, "The Item was added to your Cart Successfully ");
            }

            case "Fruits" -> {
                Fruit fruit = getFruit(getItemClass);
                addFruitToCart(fruit);
            }

            case "Sweets" -> {
                Sweet sweet = getSweet(getItemClass);
                addSweetToCart(sweet != null, sweet.getPrice(), sweet.getProduct());
            }

            case "Drinks" -> {
                Drink drinks = getDrink(getItemClass);
                addDrinkToCart(drinks != null, drinks.getPrice(), drinks.getProduct());
            }

            case "Hygiene" -> {
                Hygiene hygiene = getHygiene(getItemClass);
                addHygieneToCart(hygiene != null, hygiene.getPrice(), hygiene.getProduct());
            }

            case "Pastries" -> {
                Pastry pastry = getPastry(getItemClass);
                addPastryToCart(pastry != null, pastry.getPrice(), pastry.getProduct());
            }

            case "Domestic Appliances" -> {
                DomesticAppliance domesticAppliances = getDomesticAppliance(getItemClass);
                addDomesticApplianceToCart(
                        domesticAppliances != null, domesticAppliances.getPrice(), domesticAppliances.getProduct());
            }

            case "Building Materials" -> {
                BuildingMaterial buildingMaterial = getBuildingMaterial(getItemClass);
                addBuildingMaterialsToCart(
                        buildingMaterial != null, buildingMaterial.getPrice(), buildingMaterial.getProduct());
            }
            case "Cart" -> {
                cart();
            }
            case "Register" -> {
                getProduce = true;
                String register = InputIn.nextLineOut("Would you like to use a Self Scan Register or go to a normal one? Type Self Scan or Normal");
                switch (register){
                    case "Self Scan" -> {}
                    case default -> {
                        getAllItemsInCart();
                        String schuperCard =
                    }
                }
            }

            default -> System.out.println("That Category does not exist");
        }
        return getProduce;
    }

    private static void cart() {
        getAllItemsInCart();
        String removeItem = InputIn.nextLineOut("Do you want to remove an Item? Yes or No");
        switch (removeItem) {
            case "Yes" -> {

                String chooseItem = InputIn.nextLineOut("What Item do you want to remove");
                CØØPLists.schoppingCarts
                        .stream()
                        .filter(a -> chooseItem.equals(a.getProduct()))
                        .forEach(a -> CØØPLists.schoppingCarts.remove(a.getProduct() + chooseItem));  // Wont work atm ask a coach for help when there is one
            }
            case default -> System.out.println("All Items stay the same");
        }
    }

    private static void getAllItemsInCart() {
        CØØPLists.schoppingCarts
                .stream()
                .forEach(a -> System.out.println(a.getProduct()));
        double totalCost = CØØPLists.schoppingCarts
                .stream()
                .mapToDouble(a -> a.getCost())
                .sum();
        System.out.println("Your Current Price of all the Items together is: " + totalCost + "FR.");
    }

    private static void addBuildingMaterialsToCart(boolean buildingMaterial, double buildingMaterial1, String buildingMaterial2) {
        if(buildingMaterial) {
            System.out.println(buildingMaterial1 + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    CØØPLists.schoppingCarts.add(new SchoppingCart(buildingMaterial2, buildingMaterial1));
                    System.out.printf("The Item was added to your Cart Successfully");
                }
                case "No" -> {
                    System.out.println("Ok");
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

    private static void addDomesticApplianceToCart(boolean domesticAppliances, double domesticAppliances1, String domesticAppliances2) {
        if(domesticAppliances) {
            System.out.println(domesticAppliances1 + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    CØØPLists.schoppingCarts.add(new SchoppingCart(domesticAppliances2, domesticAppliances1));
                    System.out.printf("The Item was added to your Cart Successfully");
                }
                case "No" -> {
                    System.out.println("Ok");
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

    private static void addPastryToCart(boolean pastry, double pastry1, String pastry2) {
        if(pastry) {
            System.out.println(pastry1 + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    CØØPLists.schoppingCarts.add(new SchoppingCart(pastry2, pastry1));
                    System.out.printf("The Item was added to your Cart Successfully");
                }
                case "No" -> {
                    System.out.println("Ok");
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

    private static void addHygieneToCart(boolean hygiene, double hygiene1, String hygiene2) {
        if(hygiene) {
            System.out.println(hygiene1 + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    CØØPLists.schoppingCarts.add(new SchoppingCart(hygiene2, hygiene1));
                    System.out.printf("The Item was added to your Cart Successfully");
                }
                case "No" -> {
                    System.out.println("Ok");
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

    private static void addDrinkToCart(boolean drinks, double drinks1, String drinks2) {
        if(drinks) {
            System.out.println(drinks1 + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    CØØPLists.schoppingCarts.add(new SchoppingCart(drinks2, drinks1));
                    System.out.printf("The Item was added to your Cart Successfully");
                }
                case "No" -> {
                    System.out.println("Ok");
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

    private static void addSweetToCart(boolean sweet, double sweet1, String sweet2) {
        if(sweet) {
            System.out.println(sweet1 + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    CØØPLists.schoppingCarts.add(new SchoppingCart(sweet2, sweet1));
                    System.out.printf("The Item was added to your Cart Successfully");
                }
                case "No" -> {
                    System.out.println("Ok");
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

    private static void addFruitToCart(Fruit fruit) {
        if(fruit != null) {
            System.out.println(fruit.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    CØØPLists.schoppingCarts.add(new SchoppingCart(fruit.getProduct(), fruit.getPrice()));
                    System.out.printf("The Item was added to your Cart Successfully");
                }
                case "No" -> System.out.println("Ok");

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

    private static void addVegetableToCart(Vegetable veggie, String format) {
        if(veggie != null) {
            System.out.println(veggie.getPrice() + "FR.");
            String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
            switch (addToCart) {
                case "Yes" -> {
                    int amount = InputIn.nexIntOut("How many of this item: " + veggie.getProduct() +
                                                   " Do you want to add to your Basket. Type a Number");
                    for (int i = 0; i < amount; i++) {
                        CØØPLists.schoppingCarts.add(new SchoppingCart(veggie.getProduct(), veggie.getPrice()));

                    }
                    System.out.printf(format);
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
/*
package objektOriented.CØØP;

import objektOriented.CØØP.Groceries.*;
import objektOriented.aufg1.aufg2.InputIn;

public class CØØPTablets {

    public void access() {
        getAccessToLists();
        boolean getProduce = false;
        while (!getProduce) {
            System.out.println("");
            String getItemClass = InputIn.nextLineOut(
                    "Welcome to CØØP. What kind of Item are you searching for? These are the Item Options:" +
                    " (Vegetables, Fruits, Sweets, Drinks, Hygiene, Pastries, Domestic Appliances, Building Materials)" +
                    " If you got all your Items just Type Register and if you want to check your Cart just type Cart");
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
                    String getVeggies =
                            InputIn.nextLineOut("Type a veggie or anything else and we will tell you if that is available and in what stores.");
                    Vegetable veggie = CØØPLists.vegetablesList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getVeggies))
                            .findFirst()
                            .orElse(null);

                    if(veggie != null) {
                        System.out.println(veggie.getPrice() + "FR.");
                        String addToCart =
                                InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");                         //  TODO : Machen das Items aus dem Cart entfernt werden können.
                        switch (addToCart) {                                                                                        // TODO : MACHEN DAS MAN AUSWÄHLEN KANN OB MAN NOCH MEHR ITEMS DIESER KATEGORIE WILL ANSTATT IMMER DIE KATEGORIE ZU SCHREIBEN.!!!
                            case "Yes" -> {                                                                                             //  Todo : Noch mehr Items hinzufügen wzbs. Glass, Türen, Mikrowellen usw.
                                int amount = InputIn.nexIntOut("How many of this item: " + veggie.getProduct() +
                                                               " Do you want to add to your Basket. Type a Number");                // Todo : Register endlich mal machen und alle CASES ZU EIGENEN METHODEN VERÄNDERN DAMIT DIESE EINTE METHODE NICHT MEHR SO LANG IST.
                                for (int i = 0; i <
                                                amount; i++) {                                                                  // Todo : Erst soll man sagen welchen Laden man ansehen will mit der adresse bsp. Wangen an der Aare und dann nur die Produkte ausgeben wo es dort hat mit den Respectiven Shelfs
                                    CØØPLists.schoppingCarts.add(new SchoppingCart(veggie.getProduct(), veggie.getPrice()));

                                }
                                System.out.printf("The Item was added to your Cart Successfully ");
                            }
                            default -> System.out.println("Ok");
                        }
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                    InputIn.nextLine();
                    String anythingElse = InputIn.nextLineOut("Do you need any other Vegetables? Yes Or No");
                    switch (anythingElse) {
                        case "Yes" -> {
                            InputIn.nextLineOut("Type a veggie or anything else and we will tell you if that is available and in what stores.");

                            if(veggie != null) {
                                System.out.println(veggie.getPrice() + "FR.");
                                String addToCart =
                                        InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");                         //  TODO : Machen das Items aus dem Cart entfernt werden können.
                                switch (addToCart) {                                                                                        // TODO : MACHEN DAS MAN AUSWÄHLEN KANN OB MAN NOCH MEHR ITEMS DIESER KATEGORIE WILL ANSTATT IMMER DIE KATEGORIE ZU SCHREIBEN.!!!
                                    case "Yes" -> {                                                                                             //  Todo : Noch mehr Items hinzufügen wzbs. Glass, Türen, Mikrowellen usw.
                                        int amount = InputIn.nexIntOut("How many of this item: " + veggie.getProduct() +
                                                                       " Do you want to add to your Basket. Type a Number");                // Todo : Register endlich mal machen und alle CASES ZU EIGENEN METHODEN VERÄNDERN DAMIT DIESE EINTE METHODE NICHT MEHR SO LANG IST.
                                        for (int i = 0; i <
                                                        amount; i++) {                                                                  // Todo : Erst soll man sagen welchen Laden man ansehen will mit der adresse bsp. Wangen an der Aare und dann nur die Produkte ausgeben wo es dort hat mit den Respectiven Shelfs
                                            CØØPLists.schoppingCarts.add(new SchoppingCart(veggie.getProduct(), veggie.getPrice()));        // Todo :

                                        }
                                        System.out.printf("The Item was added to your Cart Successfully");
                                    }
                                    default -> System.out.println("Ok");
                                }
                            } else {
                                System.out.println("Sorry we do not have that product.");
                            }
                        }
                        case default -> System.out.println("Ok");
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
                    String getFruits =
                            InputIn.nextLineOut("Type a Fruit or anything else and we will tell you if that is available and in what stores.");
                    Fruit fruit = CØØPLists.fruitsList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getFruits))
                            .findFirst()
                            .orElse(null);

                    if(fruit != null) {
                        System.out.println(fruit.getPrice() + "FR.");
                        String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
                        switch (addToCart) {
                            case "Yes" -> {
                                CØØPLists.schoppingCarts.add(new SchoppingCart(fruit.getProduct(), fruit.getPrice()));
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> System.out.println("Ok");

                            default -> System.out.println("Ok");
                        }
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
                    String getSweets =
                            InputIn.nextLineOut("Type a Sweet or anything else and we will tell you if that is available and in what stores.");
                    Sweet sweet = CØØPLists.sweetsList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getSweets))
                            .findFirst()
                            .orElse(null);

                    if(sweet != null) {
                        System.out.println(sweet.getPrice() + "FR.");
                        String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
                        switch (addToCart) {
                            case "Yes" -> {
                                CØØPLists.schoppingCarts.add(new SchoppingCart(sweet.getProduct(), sweet.getPrice()));
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> {
                                System.out.println("Ok");
                            }
                            default -> System.out.println("Ok");
                        }
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
                    String getDrinks =
                            InputIn.nextLineOut("Type a Drink or anything else and we will tell you if that is available and in what stores.");
                    Drink drinks = CØØPLists.drinksList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getDrinks))
                            .findFirst()
                            .orElse(null);

                    if(drinks != null) {
                        System.out.println(drinks.getPrice() + "FR.");
                        String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
                        switch (addToCart) {
                            case "Yes" -> {
                                CØØPLists.schoppingCarts.add(new SchoppingCart(drinks.getProduct(), drinks.getPrice()));
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> {
                                System.out.println("Ok");
                            }
                            default -> System.out.println("Ok");
                        }
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
                    String getHygiene =
                            InputIn.nextLineOut("Type a Hygiene Product or anything else and we will tell you if that is available and in what stores.");
                    Hygiene hygiene = CØØPLists.hygieneList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getHygiene))
                            .findFirst()
                            .orElse(null);

                    if(hygiene != null) {
                        System.out.println(hygiene.getPrice() + "FR.");
                        String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
                        switch (addToCart) {
                            case "Yes" -> {
                                CØØPLists.schoppingCarts.add(new SchoppingCart(hygiene.getProduct(), hygiene.getPrice()));
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> {
                                System.out.println("Ok");
                            }
                            default -> System.out.println("Ok");
                        }
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
                    String getPastries =
                            InputIn.nextLineOut("Type a Pastry or anything else and we will tell you if that is available and in what stores.");
                    Pastry pastry = CØØPLists.pastryList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getPastries))
                            .findFirst()
                            .orElse(null);

                    if(pastry != null) {
                        System.out.println(pastry.getPrice() + "FR.");
                        String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
                        switch (addToCart) {
                            case "Yes" -> {
                                CØØPLists.schoppingCarts.add(new SchoppingCart(pastry.getProduct(), pastry.getPrice()));
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> {
                                System.out.println("Ok");
                            }
                            default -> System.out.println("Ok");
                        }
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
                    String getDomestics =
                            InputIn.nextLineOut("Type a Domestic Appliance or anything else and we will tell you if that is available and in what stores.");
                    DomesticAppliance domesticAppliances = CØØPLists.domesticAppliancesList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getDomestics))
                            .findFirst()
                            .orElse(null);

                    if(domesticAppliances != null) {
                        System.out.println(domesticAppliances.getPrice() + "FR.");
                        String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
                        switch (addToCart) {
                            case "Yes" -> {
                                CØØPLists.schoppingCarts.add(new SchoppingCart(domesticAppliances.getProduct(), domesticAppliances.getPrice()));
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> {
                                System.out.println("Ok");
                            }
                            default -> System.out.println("Ok");
                        }
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
                    String getBuilding =
                            InputIn.nextLineOut("Type a Building Material or anything else and we will tell you if that is available and in what stores.");
                    BuildingMaterial buildingMaterial = CØØPLists.buildingMaterialList
                            .stream()
                            .filter(a -> a
                                    .getProduct()
                                    .equals(getBuilding))
                            .findFirst()
                            .orElse(null);

                    if(buildingMaterial != null) {
                        System.out.println(buildingMaterial.getPrice() + "FR.");
                        String addToCart = InputIn.nextLineOut("Do you wish to add this to your Cart? Yes or No");
                        switch (addToCart) {
                            case "Yes" -> {
                                CØØPLists.schoppingCarts.add(new SchoppingCart(buildingMaterial.getProduct(), buildingMaterial.getPrice()));
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> {
                                System.out.println("Ok");
                            }
                            default -> System.out.println("Ok");
                        }
                    } else {
                        System.out.println("Sorry we do not have that product.");
                    }
                }
                case "Cart" -> {
                    CØØPLists.schoppingCarts
                            .stream()
                            .forEach(a -> System.out.println(a.getProduct()));
                    double totalCost = CØØPLists.schoppingCarts
                            .stream()
                            .mapToDouble(a -> a.getCost())
                            .sum();
                    System.out.println("Your Current Price of all the Items together is: " + totalCost + "FR.");
                    String removeItem = InputIn.nextLineOut("Do you want to remove an Item? Yes or No");
                    switch (removeItem) {
                        case "Yes" -> {

                        }
                        case default -> System.out.println("All Items stay the same");
                    }
                }
                case "Register" -> getProduce = true;

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
        cøøpLists.schopppingCartList();
    }
}
 */