package objektOriented.aufg1.aufg3;

import objektOriented.aufg1.aufg2.InputIn;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StreamingSite {
    static List<Movie> movies;
    static List<Person> accounts = new ArrayList<>(); //merken Static ist nicht immer gut. "Sobald du static los hasst kann alles besser werden" -Linus von Sbb

    public static void executeSite() {
            initMovies();
            accounts.add(new Person("siu", "siu", "siu@", "1234 1234 1234 1234", "12/12", "012", true, Person.SubscriptionType.MONTHLY));
            System.out.println("Hello, What would you like to do?");
            System.out.println("1: Create an Account");
            System.out.println("2: Log into your Account");
            System.out.println("3: Remove an account");
            System.out.println("4: Exit");

        switchOptions();
    }

    private static void switchOptions() {
        boolean exit = false;
        while (!exit) {
            int login = Integer.parseInt(InputIn.nextLineOut("[Select your Number]"));
            switch (login) {
                case 1 -> exit = gatherUsersInformation();
                case 2 -> exit = loginToExistingUser(exit);
                case 3 -> deleteUser();
                case 4 -> exit = true;
            }
        }
    }

    private static boolean gatherUsersInformation() {
        boolean noSameUsernames = true;
        String username = InputIn.nextLineOut("Enter your username");
        for (Person entry : accounts) {
            while (username.equals(entry.getUsername())) {
                System.out.println("That Username is already in use please enter another one.");
                username = InputIn.nextLine();
            }

        }
        String password = InputIn.nextLineOut("Enter a Password you will remember");
        String email = getUsersEmail();

        String creditcard = InputIn.nextLineOut("Enter your CreditCard Information");
        creditcard = getCreditcardNumber(creditcard);

        String creditcardExperation = getCreditcardExperation();
        String creditcardSecurityNumber = getCreditcardSecurityNumber();

        System.out.println("Do you want to get a subscription to enjoy Ad-Free and unlimited Viewing? (Type true if you want a subscription or false if you don't want one");
        boolean subscription = true;
        Person.SubscriptionType subscriptionType = null;
        if (subscription == Boolean.parseBoolean(InputIn.nextLine())) {
            System.out.println("What kind of subscription would you like the monthly subscription for 15Fr.(type: monthly) or the yearly subscription for 150fr.(type: yearly)");
            subscriptionType = switch (InputIn.nextLine().toUpperCase()) {
                case "MONTHLY" -> Person.SubscriptionType.MONTHLY;
                case "YEARLY" -> Person.SubscriptionType.YEARLY;
                default -> null;
            };
        }
        accounts.add(new Person(username, password, email, creditcard, creditcardExperation, creditcardSecurityNumber, subscription, subscriptionType));

        streamSiteOn(accounts.get(accounts.size()-1));
        return noSameUsernames;
    }

    private static String getUsersEmail() {
        boolean noSameMail = true;
        boolean loop = true;
        String email = InputIn.nextLineOut("What is your E-mail address?");
        while (noSameMail) {
            for (Person entry : accounts) {
                while (loop) {
                    boolean containsAnAet = false;
                    while (!containsAnAet) {
                        if (email.contains("@")) {
                            containsAnAet = true;
                        } else {
                            System.out.println("Your mail needs an @");
                            email = InputIn.nextLine();
                        }
                    }
                    if (email.equals(entry.getEmail())) {
                        System.out.println("Email is already in use try another one ");
                        email = InputIn.nextLine();
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

    private static String getCreditcardNumber(String creditcard) {
        while (!creditcard.matches("[0-9 ]{19}")) {
            System.out.println("Enter your Credit Card Information correctly pls.(Like : XXXX XXXX XXXX XXXX)");
            creditcard = InputIn.nextLine();
        }
        return creditcard;
    }

    private static String getCreditcardExperation() {
        String creditcardExperation = InputIn.nextLineOut("Enter your CreditCards Experation Date pls. Keep in Mind to put a / between both numbers");
        while (!creditcardExperation.matches("[0-9 /]{5}")) {
            System.out.println("Enter your CreditCards Experation Date like this Pls(XX/XX)");
            creditcardExperation = InputIn.nextLine();
        }
        return creditcardExperation;
    }

    private static String getCreditcardSecurityNumber() {
        String creditcardSecurityNumber = InputIn.nextLineOut("Enter your CreditCards Security Number pls.");
        while (!creditcardSecurityNumber.matches("[0-9]{3}")) {
            System.out.println("Enter your CreditCards Security Number like this pls.(XXX)");
            creditcardSecurityNumber = InputIn.nextLine();
        }
        return creditcardSecurityNumber;
    }

    private static boolean loginToExistingUser(boolean exit) {
        System.out.println("What account would you like to enter?");
        for (Person entry : accounts) {
            System.out.println(entry.getUsername() + ", ");
        }
        String desiredLogin = InputIn.nextLineOut("Type your username");
        for (Person entry : accounts) {
            if (desiredLogin.equals(entry.getUsername())) {
                String desiredPassword = InputIn.nextLineOut("Type your password");
                if (desiredPassword.equals(entry.getPassword())) {
                    System.out.println("Welcome back. Enjoy the movies"); //TODO Namen gut ändern
                    exit = true;
                    streamSiteOn(entry);
                } else {
                    System.out.println("Wrong Password");
                }
            }
        }
        return exit;
    }

    private static void countUsersWithSubscriptions() {
        int counter = 0;
        for (Person people : accounts) {
            if (people.isSubscription()) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void streamSiteOn(Person entry) {
        boolean streamsiteOn;
        streamsiteOn = false;
        System.out.println("Welcome to the Site. Please keep in mind while searching for movies to use proper grammar. Enjoy the movies");
        while (!streamsiteOn) {
            System.out.println("1: Search for a Movie");
            System.out.println("2: Change your CreditCard Information");
            System.out.println("3: View the amount of people with a subscription");
            System.out.println("4 Show all creditCard information's of people with a monthly subscription");
            System.out.println("5: Show all watched Movies");
            System.out.println("6: Logout of your account");
            System.out.println("[Select your Number]");

            int options = Integer.parseInt(InputIn.nextLine());
            switch (options) {
                case 1 -> {
                    int search = Integer.parseInt(InputIn.nextLineOut("Type 1: To search for a movie with its name. Type 2: To search for a movie with its genre."));
                    switch (search) {
                        case 2 -> genreSearch(entry);
                        case 1 -> nameSearch(entry);
                    }
                }
                case 2 -> changeCreditcard();
                case 3 -> countUsersWithSubscriptions();
                case 4 -> getCreditcardInfoFromMonthlyPaymentUsers();
                case 5 -> displayWatchedMovies(accounts.get(accounts.size() - 1));
                case 6 -> streamsiteOn = logOutOfTheStreamSite();
            }
        }
    }

    private static boolean logOutOfTheStreamSite() {
        System.out.println("Hello, What would you like to do?");
        System.out.println("1: Create an Account");
        System.out.println("2: Log into your Account");
        System.out.println("3: Remove an account");
        System.out.println("4: Exit");

        switchOptions();
        return true;
    }

    private static void displayWatchedMovies(Person entry) {
        entry.getWatchedMovies().forEach(movie -> System.out.println(movie.name));
    }

    private static void getCreditcardInfoFromMonthlyPaymentUsers() {
        for (Person entry : accounts) {
            if (entry.getSubscriptionType().equals(Person.SubscriptionType.MONTHLY)) {
                System.out.println(entry.getCreditCard());
            }
        }
    }

    private static void deleteUser() {
        System.out.println("What Contact do you want to Delete?");
        for (Person entry : accounts) {
            System.out.println(entry.getUsername());
        }
        String input = InputIn.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (input.equalsIgnoreCase(accounts.get(i).getUsername())) {
                String pass = InputIn.nextLineOut("Password pls:");
                if (pass.equalsIgnoreCase(accounts.get(i).getPassword())) {
                    accounts.remove(accounts.get(i));
                }
            }
        }
    }

    private static void changeCreditcard() {
        String creditcard = InputIn.nextLineOut("Pls enter your Old CreditCard Information if you wish to change it. Enter it like :XXXX XXXX XXXX XXXX");
        for (Person credit : accounts) {
            if (credit.getCreditCard().equals(creditcard)) {
                System.out.println("Type in your new Creditcard Information");
                creditcard = InputIn.nextLine();
                creditcard = getCreditcardNumber(creditcard);
                credit.setCreditCard(creditcard);
            }
        }
    }

    public static void nameSearch(Person entry) {
        String movieFinder = InputIn.nextLineOut("Type in the movie name or a word that might appear in its name (if you want to see all Movies just press enter)");
        for (Movie movieSave : movies) {      //movieSave ist die Klasse wo alles abgespeichert ist von den Infos der Filme
            if (movieSave.getName().toLowerCase().contains(movieFinder)) {
                System.out.println(movieSave.getName());
            }
        }
        String getInformation = InputIn.nextLineOut("Which of these Movies do you want the Information of");
        for (Movie movieSave : movies) {
            if (movieSave.getName().equalsIgnoreCase(getInformation)) {
                movieSave.setViews(movieSave.getViews() + 1);
                System.out.println(movieSave.getName() + " " + movieSave.getDuration() + " " + movieSave.getGenre() + " " + movieSave.getProducer() + " " + movieSave.getViews());
                entry.watchMovie(movieSave);
            }
        }
    }

    public static void genreSearch(Person entry) {
        String genreFinder = InputIn.nextLineOut("Type in the Genre of the Movie you want to find. Keep in mind the Genre might not fit any movie");
        for (Movie movieSave : movies) {
            if (movieSave.getGenre().toLowerCase().contains(genreFinder)) {
                System.out.println(movieSave.getName());
            }
        }
        String getInformation = InputIn.nextLineOut("Which of these Movies do you want the Information of");
        for (Movie movieSave : movies) {
            if (movieSave.getName().equalsIgnoreCase(getInformation)) {
                movieSave.setViews(movieSave.getViews() + 1);
                System.out.println(movieSave.getDuration() + " " + movieSave.getGenre() + " " + movieSave.getProducer() + " " + movieSave.getViews());
                entry.watchMovie(movieSave);
            }
        }
    }

    public static void initMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("the Godfather", Duration.ofMinutes(175), "Crime " + "Drama", "Francis Ford Coppola", 4322));
        movieList.add(new Movie("the Shawshank Redemption", Duration.ofMinutes(142), "Drama", "Frank Darabont", 11239));
        movieList.add(new Movie("shindler's List", Duration.ofMinutes(195), "History " + "Drama " + "Biography", "Steven Spielberg", 654321));
        movieList.add(new Movie("forrest Gump", Duration.ofMinutes(142), "Romance " + "Drama", "Robert Zemechkis", 4576856));
        movieList.add(new Movie("angry Birds", Duration.ofMinutes(97), "Animation " + "Action " + "Adventure", "Clay Kaytis" + " Fergal Reilly", 0));
        movieList.add(new Movie("shrek", Duration.ofMinutes(90), "Fantasy " + "Adventure " + "Animation", "Andrew Adamson", 999999999));
        movieList.add(new Movie("the Dark Knight", Duration.ofMinutes(152), "Action " + "Drama " + "Detective story", "Christopher Nolan", 42312));
        movieList.add(new Movie("wall-E", Duration.ofMinutes(98), "Adventure " + "Animation " + "Family", "Andrew Stanton", 1));
        movieList.add(new Movie("avengers: Infinity War", Duration.ofMinutes(149), "Sci-Fi " + "Adventure " + "Action", "Anthony Russo" + "Joe Russo", 54345));
        movieList.add(new Movie("joker", Duration.ofMinutes(122), "Thriller " + "Detective Story " + "Drama", "Todd Phillips", 999999998));
        movieList.add(new Movie("the Wolf of Wall Street", Duration.ofMinutes(180), "Comedy " + "Biography" + "Detective Story", "Martin Scorsese", 1234543));
        movieList.add(new Movie("the Truman Show", Duration.ofMinutes(103), "Drama " + "Comedy", "Peter Weir", 999999997));
        movies = movieList;
    }
}