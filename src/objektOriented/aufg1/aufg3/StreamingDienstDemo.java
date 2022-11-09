package objektOriented.aufg1.aufg3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamingDienstDemo {
    public static void main(String[] args) {
        List<StreamingDienst> tempList = new ArrayList<>();
        tempList.add(new StreamingDienst("siu", "siu", "siu@", "1234 1234 1234 1234", "12/12", "012", true, "monthly"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, What would you like to do?");
        System.out.println("1: Create an Account");
        System.out.println("2: Log into your Account");
        System.out.println("3: Remove an account");
        System.out.println("4: Exit");

        boolean exit = false;
        while (!exit) {
            System.out.println("[Select your Number]");
            int login = Integer.parseInt(scanner.nextLine());
            switch (login) {
                case 1:
                    boolean noSameUsernames = false;
                    boolean isLooping = true;
                    System.out.println("Enter your username");
                    String username = scanner.nextLine();
                    while (!noSameUsernames) {
                        for (StreamingDienst entry : tempList) {
                            while (isLooping) {
                                if (username.equals(entry.getUsername())) {
                                    System.out.println("That Username is already in use please enter another one.");
                                    username = scanner.nextLine();
                                } else {
                                    isLooping = false;
                                }
                                if (!username.equals(entry.getUsername())) {
                                    noSameUsernames = true;

                                }
                            }
                        }
                        break;
                    }
                    System.out.println("Enter a Password you will remember");
                    String password = scanner.nextLine();
                    boolean noSameMail = true;
                    boolean loop = true;
                    System.out.println("What is your E-mail address?");
                    String email = scanner.nextLine();
                    while (noSameMail) {
                        for (StreamingDienst entry : tempList) {
                            while (loop) {
                                boolean containsAnAet = false;
                                while (!containsAnAet) {
                                    if (email.contains("@")) {
                                        containsAnAet = true;
                                    } else {
                                        System.out.println("Your mail needs an @");
                                        email = scanner.nextLine();
                                    }
                                }
                                if (email.equals(entry.getEmail())) {
                                    System.out.println("Email is already in use try another one ");
                                    email = scanner.nextLine();
                                } else {
                                    loop = false;
                                }
                                if (!email.equals(entry.getEmail())) {
                                    noSameMail = false;
                                }
                            }
                        }
                    }
                    System.out.println("Enter your CreditCard Information");
                    String creditcard = scanner.nextLine();
                    while (!creditcard.matches("[0-9 ]{19}")) {
                        System.out.println("Enter your Credit Card Information correctly pls.(Like : XXXX XXXX XXXX XXXX)");
                        creditcard = scanner.nextLine();
                    }
                    System.out.println("Enter your CreditCards Experation Date pls. Keep in Mind to put a / between both numbers");
                    String creditcardExperation = scanner.nextLine();
                    while (!creditcardExperation.matches("[0-9 / ]{5}")) {
                        System.out.println("Enter your CreditCards Experation Date like this Pls(XX/XX)");
                        creditcardExperation = scanner.nextLine();
                    }
                    System.out.println("Enter your CreditCards Security Number pls.");
                    String creditcardSecurityNumber = scanner.nextLine();
                    while (!creditcardSecurityNumber.matches("[0-9]{3}")) {
                        System.out.println("Enter your CreditCards Security Number like this pls.(XXX)");
                        creditcardSecurityNumber = scanner.nextLine();
                    }
                    System.out.println("Do you want to get a subscription to enjoy Ad-Free and unlimited Viewing? (Type true if you want a subscription or false if you don't want one");
                    boolean subscription = true;
                    String subscriptionType = null;
                    if (subscription == Boolean.parseBoolean(scanner.nextLine())) {
                        System.out.println("What kind of subscription would you like the monthly subscription for 15Fr.(type: monthly) or the yearly subscription for 150fr.(type: yearly)");
                        subscriptionType = scanner.nextLine();
                    } else {
                        System.out.println("You can choose a subscription at a later point if you want");
                    }

                    tempList.add(new StreamingDienst(username, password, email, creditcard, creditcardExperation, creditcardSecurityNumber, subscription, subscriptionType));

                    boolean streamsiteOn;
                    streamsiteOn = false;
                    System.out.println("Welcome to the Site. Please keep in mind while searching for movies to use proper grammar. Enjoy the movies");
                    while (!streamsiteOn) {
                        System.out.println("1: Search for a Movie");
                        System.out.println("2: Change your CreditCard Information");
                        System.out.println("3: View the amount of people with a subscription");
                        System.out.println("4 Show all creditCard information's of people with a monthly subscription");
                        System.out.println("5: Logout of your account");
                        System.out.println("[Select your Number]");

                        int options = Integer.parseInt(scanner.nextLine());
                        switch (options) {
                            case 1:
                                System.out.println("Type 1: To search for a movie with its name. Type 2: To search for a movie with its genre.");
                                int search = Integer.parseInt(scanner.nextLine());
                                switch (search) {
                                    case 1 -> {          //TODO GIBT NOCH NICHT AN OB EIN FILM VIEWED UND WIE VIELE VIEWS ER HAT.
                                        nameSearch();
                                        break;
                                    }
                                    case 2 -> genreSearch();
                                }
                                break;

                            case 2:
                                System.out.println("Pls enter your Old CreditCard Information if you wish to change it. Enter it like :XXXX XXXX XXXX XXXX");
                                creditcard = scanner.nextLine();
                                for (StreamingDienst credit : tempList) {
                                    if (credit.getCreditCard().equals(creditcard)) {
                                        System.out.println("Type in your new Creditcard Information");
                                        creditcard = scanner.nextLine();
                                        while (!creditcard.matches("[0-9 ]{19}")) {
                                            System.out.println("Enter your Credit Card Information correctly pls.(Like : XXXX XXXX XXXX XXXX)");
                                            creditcard = scanner.nextLine();
                                        }
                                        credit.setCreditCard(creditcard);
                                    }
                                }
                                break;

                            case 3:
                                int counter = 0;
                                for (StreamingDienst people : tempList) {
                                    if (people.isSubscription() == true) {
                                        counter++;
                                    }
                                }
                                System.out.println(counter);
                                break;

                            case 4:
                                for (StreamingDienst entry : tempList) {
                                    if (entry.getSubscriptionType().equals("monthly")) {
                                        System.out.println(entry.getCreditCard());
                                    }
                                }
                                break;

                            case 5:
                                streamsiteOn = true;
                                System.out.println("Hello, What would you like to do?");
                                System.out.println("1: Create an Account");
                                System.out.println("2: Log into your Account");
                                System.out.println("3: Remove an account");
                                System.out.println("4: Exit");
                                exit = false;
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("What account would you like to enter?");
                    for (StreamingDienst entry : tempList) {
                        System.out.println(entry.getUsername() + ", ");
                    }
                    System.out.println("Type your username");
                    String desiredLogin = scanner.nextLine();
                    for (StreamingDienst entry : tempList) {
                        if (desiredLogin.equals(entry.getUsername())) {
                            System.out.println("Type your password");
                            String desiredPassword = scanner.nextLine();
                            if (desiredPassword.equals(entry.getPassword())) {
                                System.out.println("Welcome back. Enjoy the movies");
                                exit = true;
                                streamsiteOn = false;
                                System.out.println("Welcome to the Site. Please keep in mind while searching for movies to use proper grammar. Enjoy the movies");

                                while (!streamsiteOn) {
                                    System.out.println("1: Search for a Movie");
                                    System.out.println("2: Change your CreditCard Information");
                                    System.out.println("3: View the amount of people with a subscription");
                                    System.out.println("4 Show all creditCard information's of people with a monthly subscription");
                                    System.out.println("5: Logout of your account");
                                    System.out.println("[Select your Number]");

                                    int options = Integer.parseInt(scanner.nextLine());
                                    switch (options) {
                                        case 1:
                                            System.out.println("Type 1: To search for a movie with its name. Type 2: To search for a movie with its genre.");
                                            int search = Integer.parseInt(scanner.nextLine());
                                            switch (search) {
                                                case 1 -> {
                                                    nameSearch();
                                                    break;
                                                }
                                                case 2 -> genreSearch();
                                            }
                                            break;

                                        case 2:
                                            System.out.println("Pls enter your Old CreditCard Information if you wish to change it. Enter it like :XXXX XXXX XXXX XXXX");
                                            creditcard = scanner.nextLine();
                                            for (StreamingDienst credit : tempList) {
                                                if (credit.getCreditCard().equals(creditcard)) {
                                                    System.out.println("Type in your new Creditcard Information");
                                                    creditcard = scanner.nextLine();
                                                    while (!creditcard.matches("[0-9 ]{19}")) {
                                                        System.out.println("Enter your Credit Card Information correctly pls.(Like : XXXX XXXX XXXX XXXX)");
                                                        creditcard = scanner.nextLine();
                                                    }
                                                    credit.setCreditCard(creditcard);
                                                }
                                            }
                                            break;

                                        case 3:
                                            int counter = 0;
                                            for (StreamingDienst people : tempList) {
                                                if (people.isSubscription() == true) {
                                                    counter++;
                                                    ;
                                                }
                                            }
                                            System.out.println(counter);
                                            break;

                                        case 4:
                                            for (StreamingDienst entry2 : tempList) {
                                                if (entry2.getSubscriptionType().equals("monthly")) {
                                                    System.out.println(entry2.getCreditCard());
                                                }
                                            }
                                            break;

                                        case 5:
                                            streamsiteOn = true;
                                            System.out.println("Hello, What would you like to do?");
                                            System.out.println("1: Create an Account");
                                            System.out.println("2: Log into your Account");
                                            System.out.println("3: Remove an account");
                                            System.out.println("4: Exit");
                                            exit = false;
                                            break;
                                    }
                                }
                            } else {
                                System.out.println("Wrong Password");
                            }
                        } else {
                            System.out.println("Wrong username or user not found");
                        }
                    }
                    break;

                case 3:
                    System.out.println("What Contact do you want to Delete?");
                    for (StreamingDienst entry : tempList) {
                        System.out.println(entry.getUsername());
                    }
                    String input = scanner.nextLine();
                    for (int i = 0; i < tempList.size(); i++) {
                        if (input.equalsIgnoreCase(tempList.get(i).getUsername())) {
                            System.out.println("Password pls:");
                            String pass = scanner.nextLine();
                            if (pass.equalsIgnoreCase(tempList.get(i).getPassword())) {
                                tempList.remove(tempList.get(i));
                            }
                        }
                    }
                    break;
                case 4:
                    exit = true;
            }
        }
    }

    public static void nameSearch() {
        movies();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the movie name or a word that might appear in its name (if you want to see all Movies just press enter)");
        String movieFinder = scanner.nextLine();
        for (StreamingDienstFilme movieList : movies()) {
            if (movieList.getName().toLowerCase().contains(movieFinder)) {
                System.out.println(movieList.getName());
            }
        }
        System.out.println("Which of these Movies do you want the Information of");
        String getInformation = scanner.nextLine();
        for (StreamingDienstFilme movieList : movies()) {
            if (movieList.getName().equalsIgnoreCase(getInformation)) {
                System.out.println(movieList.getDuration() + " " + movieList.getGenre() + " " + movieList.getProducer() + " " + movieList.getViews() + " " + movieList.isViewed());
            }
        }
    }

    public static void genreSearch() {
        movies();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the Genre of the Movie you want to find. Keep in mind the Genre might not fit any movie");
        String genreFinder = scanner.nextLine();
        int viewCount = 0;
        for (StreamingDienstFilme movieList : movies()) {
            if (movieList.getGenre().toLowerCase().contains(genreFinder)) {
                System.out.println(movieList.getName());
            }
        }
        System.out.println("Which of these Movies do you want the Information of");
        String getInformation = scanner.nextLine();
        for (StreamingDienstFilme movieList : movies()) {
            if (movieList.getName().equalsIgnoreCase(getInformation)) {
                System.out.println(movieList.getDuration() + " " + movieList.getGenre() + " " + movieList.getProducer() + " " + movieList.getViews() + " " + movieList.isViewed());
            }
        }
    }

    public static List<StreamingDienstFilme> movies() {
        List<StreamingDienstFilme> movieList = new ArrayList<>();
        movieList.add(new StreamingDienstFilme("the Godfather", "175", "Crime " + "Drama", "Francis Ford Coppola", "4322+", false));
        movieList.add(new StreamingDienstFilme("the Shawshank Redemption", "142", "Drama", "Frank Darabont", "11234", false));
        movieList.add(new StreamingDienstFilme("shindler's List", "195", "History " + "Drama " + "Biography", "Steven Spielberg", "654321", false));
        movieList.add(new StreamingDienstFilme("forrest Gump", "142", "Romance " + "Drama", "Robert Zemechkis", "0", false));
        movieList.add(new StreamingDienstFilme("angry Birds", "97", "Animation " + "Action " + "Adventure", "Clay Kaytis" + " Fergal Reilly", "456452", false));
        movieList.add(new StreamingDienstFilme("shrek", "90", "Fantasy " + "Adventure " + "Animation", "Andrew Adamson", "9999999999", false));
        movieList.add(new StreamingDienstFilme("the Dark Knight", "152", "Action " + "Drama " + "Detective story", "Christopher Nolan", "42312", false));
        movieList.add(new StreamingDienstFilme("wall-E", "98", "Adventure " + "Animation " + "Family", "Andrew Stanton", "1", false));
        movieList.add(new StreamingDienstFilme("avengers: Infinity War", "149", "Sci-Fi " + "Adventure " + "Action", "Anthony Russo" + "Joe Russo", "54345", false));
        movieList.add(new StreamingDienstFilme("joker", "122", "Thriller " + "Detective Story " + "Drama", "Todd Phillips", "9999998", false));
        movieList.add(new StreamingDienstFilme("the Wolf of Wall Street", "180", "Comedy " + "Biography" + "Detective Story", "Martin Scorsese", "1234543", false));
        movieList.add(new StreamingDienstFilme("the Truman Show", "103", "Drama " + "Comedy", "Peter Weir", "9999997", false));
        return movieList;
    }
}