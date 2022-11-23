package objektOriented.aufg1.aufg3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamingSite {
    public static void executeSite() {
        List<Person> tempList = new ArrayList<>();
        tempList.add(new Person("siu", "siu", "siu@", "1234 1234 1234 1234", "12/12", "012", true, Person.SubscriptionType.MONTHLY));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, What would you like to do?");
        System.out.println("1: Create an Account");
        System.out.println("2: Log into your Account");
        System.out.println("3: Remove an account");
        System.out.println("4: Exit");

        switchOptions(tempList, scanner);
    }

    private static void switchOptions(List<Person> tempList, Scanner scanner) {
        boolean exit = false;
        while (!exit) {
            System.out.println("[Select your Number]");
            int login = Integer.parseInt(scanner.nextLine());
            switch (login) {
                case 1 -> exit = gatherUsersInformation(tempList, scanner);

                case 2 -> exit = loginToExistingUser(tempList, scanner, exit);

                case 3 -> deleteUser(tempList, scanner);
                case 4 -> exit = true;
            }
        }
    }

    private static boolean gatherUsersInformation(List<Person> tempList, Scanner scanner) {
        boolean noSameUsernames = true;
        System.out.println("Enter your username");
        String username = scanner.nextLine();
        for (Person entry : tempList) {
            while (username.equals(entry.getUsername())) {
                System.out.println("That Username is already in use please enter another one.");
                username = scanner.nextLine();
            }

        }
        System.out.println("Enter a Password you will remember");
        String password = scanner.nextLine();
        String email = getUsersEmail(tempList, scanner);

        System.out.println("Enter your CreditCard Information");
        String creditcard = scanner.nextLine();
        creditcard = getCreditcardNumber(scanner, creditcard);

        String creditcardExperation = getCreditcardExperation(scanner);
        String creditcardSecurityNumber = getCreditcardSecurityNumber(scanner);

        System.out.println("Do you want to get a subscription to enjoy Ad-Free and unlimited Viewing? (Type true if you want a subscription or false if you don't want one");
        boolean subscription = true;
        Person.SubscriptionType subscriptionType = null;
        if (subscription == Boolean.parseBoolean(scanner.nextLine())) {
            System.out.println("What kind of subscription would you like the monthly subscription for 15Fr.(type: monthly) or the yearly subscription for 150fr.(type: yearly)");
            subscriptionType = switch (scanner.nextLine().toUpperCase()) {
                case "MONTHLY" -> Person.SubscriptionType.MONTHLY;
                case "YEARLY" -> Person.SubscriptionType.YEARLY;
                default -> null;
            };
        }
        tempList.add(new Person(username, password, email, creditcard, creditcardExperation, creditcardSecurityNumber, subscription, subscriptionType));

        streamSiteOn(tempList, scanner);
        return noSameUsernames;
    }

    private static String getUsersEmail(List<Person> tempList, Scanner scanner) {
        boolean noSameMail = true;
        boolean loop = true;
        System.out.println("What is your E-mail address?");
        String email = scanner.nextLine();
        while (noSameMail) {
            for (Person entry : tempList) {
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
        return email;
    }

    private static String getCreditcardNumber(Scanner scanner, String creditcard) {
        while (!creditcard.matches("[0-9 ]{19}")) {
            System.out.println("Enter your Credit Card Information correctly pls.(Like : XXXX XXXX XXXX XXXX)");
            creditcard = scanner.nextLine();
        }
        return creditcard;
    }

    private static String getCreditcardExperation(Scanner scanner) {
        System.out.println("Enter your CreditCards Experation Date pls. Keep in Mind to put a / between both numbers");
        String creditcardExperation = scanner.nextLine();
        while (!creditcardExperation.matches("[0-9 /]{5}")) {
            System.out.println("Enter your CreditCards Experation Date like this Pls(XX/XX)");
            creditcardExperation = scanner.nextLine();
        }
        return creditcardExperation;
    }

    private static String getCreditcardSecurityNumber(Scanner scanner) {
        System.out.println("Enter your CreditCards Security Number pls.");
        String creditcardSecurityNumber = scanner.nextLine();
        while (!creditcardSecurityNumber.matches("[0-9]{3}")) {
            System.out.println("Enter your CreditCards Security Number like this pls.(XXX)");
            creditcardSecurityNumber = scanner.nextLine();
        }
        return creditcardSecurityNumber;
    }

    private static boolean loginToExistingUser(List<Person> tempList, Scanner scanner, boolean exit) {
        System.out.println("What account would you like to enter?");
        for (Person entry : tempList) {
            System.out.println(entry.getUsername() + ", ");
        }
        System.out.println("Type your username");
        String desiredLogin = scanner.nextLine();
        for (Person entry : tempList) {
            if (desiredLogin.equals(entry.getUsername())) {
                System.out.println("Type your password");
                String desiredPassword = scanner.nextLine();
                if (desiredPassword.equals(entry.getPassword())) {
                    System.out.println("Welcome back. Enjoy the movies");
                    exit = true;
                    boolean streamsiteOn = true;
                    System.out.println("Welcome to the Site. Please keep in mind while searching for movies to use proper grammar. Enjoy the movies");

                    while (!streamsiteOn) {
                        System.out.println("1: Search for a Movie");
                        System.out.println("2: Change your CreditCard Information");
                        System.out.println("3: View the amount of people with a subscription");         //TODO utility class für scanner so wie schon einmal erwähnt
                        System.out.println("4 Show all creditCard information's of people with a monthly subscription");
                        System.out.println("5: Logout of your account");
                        System.out.println("[Select your Number]");

                        int options = Integer.parseInt(scanner.nextLine());
                        switch (options) {
                            case 1 -> {
                                System.out.println("Type 1: To search for a movie with its name. Type 2: To search for a movie with its genre.");
                                int search = Integer.parseInt(scanner.nextLine());
                                switch (search) {
                                    case 1 -> nameSearch();
                                    case 2 -> genreSearch();
                                }
                            }
                            case 2 -> changeCreditcard(scanner, tempList);
                            case 3 -> countUsersWithSubscriptions(tempList);
                            case 4 -> getCreditcardInfoFromMonthlyPaymentUsers(tempList);
                            case 5 -> executeSite();
                        }
                    }
                } else {
                    System.out.println("Wrong Password");
                }
            }
        }
        return exit;
    }

    private static void countUsersWithSubscriptions(List<Person> tempList) {
        int counter = 0;
        for (Person people : tempList) {
            if (people.isSubscription()) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void streamSiteOn(List<Person> tempList, Scanner scanner) {
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
                case 1 -> {
                    System.out.println("Type 1: To search for a movie with its name. Type 2: To search for a movie with its genre.");
                    int search = Integer.parseInt(scanner.nextLine());
                    switch (search) {
                        case 1 -> nameSearch(); //TODO viewed und views machen
                        case 2 -> genreSearch();
                    }
                }
                case 2 -> changeCreditcard(scanner, tempList);
                case 3 -> countUsersWithSubscriptions(tempList);
                case 4 -> getCreditcardInfoFromMonthlyPaymentUsers(tempList);
                case 5 -> streamsiteOn = logOutOfTheStreamSite(tempList);
            }
        }
    }

    private static boolean logOutOfTheStreamSite(List<Person> tempList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, What would you like to do?");
        System.out.println("1: Create an Account");
        System.out.println("2: Log into your Account");
        System.out.println("3: Remove an account");
        System.out.println("4: Exit");

        switchOptions(tempList, scanner);
        return true;
    }

    private static void getCreditcardInfoFromMonthlyPaymentUsers(List<Person> tempList) {
        for (Person entry : tempList) {
            if (entry.getSubscriptionType().equals(Person.SubscriptionType.MONTHLY)) {
                System.out.println(entry.getCreditCard());
            }
        }
    }

    private static void deleteUser(List<Person> tempList, Scanner scanner) {
        System.out.println("What Contact do you want to Delete?");
        for (Person entry : tempList) {
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
    }

    private static void changeCreditcard(Scanner scanner, List<Person> tempList) {
        System.out.println("Pls enter your Old CreditCard Information if you wish to change it. Enter it like :XXXX XXXX XXXX XXXX");
        String creditcard = scanner.nextLine();
        for (Person credit : tempList) {
            if (credit.getCreditCard().equals(creditcard)) {
                System.out.println("Type in your new Creditcard Information");
                creditcard = scanner.nextLine();
                creditcard = getCreditcardNumber(scanner, creditcard);
                credit.setCreditCard(creditcard);
            }
        }
    }
    public static List<Movies> watchedMovies(){
        List<Movies> watchedMovieList = new ArrayList<>();
        return watchedMovieList;
    }

    public static void nameSearch() {
        movies();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the movie name or a word that might appear in its name (if you want to see all Movies just press enter)");
        String movieFinder = scanner.nextLine();
        for (Movies movieList : movies()) {
            if (movieList.getName().toLowerCase().contains(movieFinder)) {
                System.out.println(movieList.getName());
            }
        }
        System.out.println("Which of these Movies do you want the Information of");
        String getInformation = scanner.nextLine();
        for (Movies movieList : movies()) {
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
        for (Movies movieList : movies()) {
            if (movieList.getGenre().toLowerCase().contains(genreFinder)) {
                System.out.println(movieList.getName());
            }
        }
        System.out.println("Which of these Movies do you want the Information of");
        String getInformation = scanner.nextLine();
        for (Movies movieList : movies()) {
            if (movieList.getName().equalsIgnoreCase(getInformation)) {
                System.out.println(movieList.getDuration() + " " + movieList.getGenre() + " " + movieList.getProducer() + " " + movieList.getViews() + " " + movieList.isViewed());
            }
        }
    }

    public static List<Movies> movies() {
        List<Movies> movieList = new ArrayList<>();
        movieList.add(new Movies("the Godfather", "175", "Crime " + "Drama", "Francis Ford Coppola", 4322, false));
        movieList.add(new Movies("the Shawshank Redemption", "142", "Drama", "Frank Darabont", 11239, false));
        movieList.add(new Movies("shindler's List", "195", "History " + "Drama " + "Biography", "Steven Spielberg", 654321, false));
        movieList.add(new Movies("forrest Gump", "142", "Romance " + "Drama", "Robert Zemechkis", 4576856, false));
        movieList.add(new Movies("angry Birds", "97", "Animation " + "Action " + "Adventure", "Clay Kaytis" + " Fergal Reilly", 0, false));
        movieList.add(new Movies("shrek", "90", "Fantasy " + "Adventure " + "Animation", "Andrew Adamson", 999999999, false));
        movieList.add(new Movies("the Dark Knight", "152", "Action " + "Drama " + "Detective story", "Christopher Nolan", 42312, false));
        movieList.add(new Movies("wall-E", "98", "Adventure " + "Animation " + "Family", "Andrew Stanton", 1, false));
        movieList.add(new Movies("avengers: Infinity War", "149", "Sci-Fi " + "Adventure " + "Action", "Anthony Russo" + "Joe Russo", 54345, false));
        movieList.add(new Movies("joker", "122", "Thriller " + "Detective Story " + "Drama", "Todd Phillips", 999999998, false));
        movieList.add(new Movies("the Wolf of Wall Street", "180", "Comedy " + "Biography" + "Detective Story", "Martin Scorsese", 1234543, false));
        movieList.add(new Movies("the Truman Show", "103", "Drama " + "Comedy", "Peter Weir", 999999997, false));
        //TODO make the duration parameter a duration datatype not a string
        return movieList;
    }
}