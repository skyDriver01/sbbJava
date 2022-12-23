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
                                                               // Todo : Register endlich mal machen und alle CASES ZU EIGENEN METHODEN VERÄNDERN DAMIT DIESE EINTE METHODE NICHT MEHR SO LANG IST.
                                                               " Do you want to add to your Basket. Type a Number");
                                for (int i = 0; i <= amount; i++) {
                                    CØØPLists.schoppingCarts.add(new SchoppingCart(veggie.getProduct(), veggie.getPrice()));

                                }
                                System.out.printf("The Item was added to your Cart Successfully");
                            }
                            case "No" -> System.out.println("Ok");

                            default -> System.out.println("Ok");
                        }
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