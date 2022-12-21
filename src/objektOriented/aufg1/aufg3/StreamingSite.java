package objektOriented.aufg1.aufg3;

import objektOriented.aufg1.aufg2.InputIn;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StreamingSite {
    static List <Movie> movies;
    static List <Person> accounts = new ArrayList <>(); //merken Static ist nicht immer gut. "Sobald du static weg hasst kann alles besser/leichter und fehlerfreier werden" -Linus von Sbb

    public void executeSite() {
        initMovies();
        accounts.add(new Person("siu", "siu", "siu@", "1234 1234 1234 1234", "12/12", "012", true, Person.SubscriptionType.MONTHLY));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hello, What would you like to do?");
        System.out.println("1: Create an Account");
        System.out.println("2: Log into your Account");
        System.out.println("3: Remove an account");
        System.out.println("4: Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

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

        String username = createNewUserName();

        String password = InputIn.nextLineOut("Enter a Password you will remember");

        String email = getUsersEmail();

        String creditcard = InputIn.nextLineOut("Enter your CreditCard Information");
        creditcard = getCreditcardNumber(creditcard);

        String creditcardExperation = getCreditcardExperation();

        String creditcardSecurityNumber = getCreditcardSecurityNumber();

        System.out.println("Do you want to get a subscription to enjoy Ad-Free and unlimited Viewing? (Type true if you want a subscription or false if you don't want one");
        boolean subscription = true;
        Person.SubscriptionType subscriptionType = askIfSubscriptionIsWanted(subscription);


        accounts.add(new Person(username, password, email, creditcard, creditcardExperation, creditcardSecurityNumber, subscription, subscriptionType));

        streamSiteOn(accounts.get(accounts.size() - 1));

        return noSameUsernames;
    }

    private static String createNewUserName() {
        String username = InputIn.nextLineOut("Enter your username");
        for (Person existingAccount : accounts) {
            while (username.equals(existingAccount.getUsername())) {
                System.out.println("That Username is already in use please enter another one.");
                username = InputIn.nextLine();
            }

        }
        return username;
    }

    private static String getUsersEmail() {
        boolean noSameMail = true;
        boolean spellChecker = true;
        String email = InputIn.nextLineOut("What is your E-mail address?");
        email = checkTheEmail(noSameMail, spellChecker, email);
        return email;
    }

    private static String checkTheEmail(boolean noSameMail, boolean spellChecker, String email) {
        while (noSameMail) {
            for (Person existingAccount : accounts) {
                while (spellChecker) {
                    boolean containsAnAet = false;
                    email = checkForAnAet(email, containsAnAet);

                    if(email.equals(existingAccount.getEmail())) {
                        System.out.println("Email is already in use try another one ");
                        email = InputIn.nextLine();
                    } else {
                        spellChecker = false;
                    }

                    noSameMail = isANewValidEmail(noSameMail, email, existingAccount);
                }
            }
        }
        return email;
    }

    private static boolean isANewValidEmail(boolean noSameMail, String email, Person existingAccount) {
        if(!email.equals(existingAccount.getEmail())) {
            noSameMail = false;
        }
        return noSameMail;
    }

    private static String checkForAnAet(String email, boolean containsAnAet) {
        while (!containsAnAet) {
            if(email.contains("@")) {
                containsAnAet = true;
            } else {
                System.out.println("Your mail needs an @");
                email = InputIn.nextLine();
            }
        }
        return email;
    }

    private static String getCreditcardNumber(String creditcard) {
        while (!creditcard.matches("[0-9 ]{19}")) { //Schauen das regex auch mit aet für mail gemacht werden kann
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

    private static Person.SubscriptionType askIfSubscriptionIsWanted(boolean subscription) {
        Person.SubscriptionType subscriptionType = null;
        if(subscription == Boolean.parseBoolean(InputIn.nextLine())) {
            subscriptionType = getSubscriptionType();
        }
        return subscriptionType;
    }

    private static Person.SubscriptionType getSubscriptionType() {
        Person.SubscriptionType subscriptionType;
        System.out.println("What kind of subscription would you like the monthly subscription for 15Fr.(type: monthly) or the yearly subscription for 150fr.(type: yearly)");
        subscriptionType = switch (InputIn
                .nextLine()
                .toUpperCase()) {
            case "MONTHLY" -> Person.SubscriptionType.MONTHLY;
            case "YEARLY" -> Person.SubscriptionType.YEARLY;
            default -> null;
        };
        return subscriptionType;
    }

    private static boolean loginToExistingUser(boolean exit) {
        getAllExistingAccounts();
        exit = loginConditions(exit);
        return exit;
    }

    private static void getAllExistingAccounts() {
        System.out.println("What account would you like to enter?");
        for (Person existingAccounts : accounts) {
            System.out.println(existingAccounts.getUsername() + ", ");
        }
    }

    private static boolean loginConditions(boolean exit) {
        String desiredLogin = InputIn.nextLineOut("Type your username");
        for (Person existingAccount : accounts) {
            if(desiredLogin.equals(existingAccount.getUsername())) {
                String desiredPassword = InputIn.nextLineOut("Type your password");

                if(desiredPassword.equals(existingAccount.getPassword())) { //Check that its the right Password
                    System.out.println("Welcome back. Enjoy the movies");
                    exit = true;
                    streamSiteOn(existingAccount);
                } else {
                    System.out.println("Wrong Password");
                }
            }
        }
        return exit;
    }

    private static void streamSiteOn(Person loggedInAccount) {
        boolean streamsiteOn;
        streamsiteOn = false;
        System.out.println("Welcome to the Site. Please keep in mind while searching for movies to use proper grammar. Enjoy the movies");
        while (!streamsiteOn) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1: Search for a Movie");
            System.out.println("2: Change your CreditCard Information");
            System.out.println("3: View the amount of people with a subscription");
            System.out.println("4 Show all creditCard information's of people with a monthly subscription");
            System.out.println("5: Show Movie-Search History");
            System.out.println("6: Logout of your account");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("[Select your Number]");


            streamsiteOn = getAllSwtichCases(loggedInAccount, streamsiteOn);
        }
    }

    private static boolean getAllSwtichCases(Person loggedInAccount, boolean streamsiteOn) {
        int options = Integer.parseInt(InputIn.nextLine());
        switch (options) {
            case 1 -> {
                int search = Integer.parseInt(InputIn.nextLineOut("Type 1: To search for a movie with its name. Type 2: To search for a movie with its genre."));
                switch (search) {
                    case 1 -> nameSearch(loggedInAccount);
                    case 2 -> genreSearch(loggedInAccount);
                }
            }
            case 2 -> changeCreditcard();
            case 3 -> countUsersWithSubscriptions();
            case 4 -> getCreditcardInfoFromMonthlyPaymentUsers();
            case 5 -> displayMovieSearchHistory(loggedInAccount);
            case 6 -> streamsiteOn = logOutOfTheStreamSite();
        }
        return streamsiteOn;
    }

    private static void countUsersWithSubscriptions() {
        int counter = 0;
        for (Person people : accounts) {
            if(people.isSubscription()) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void displayMovieSearchHistory(Person loggedInAccount) {
        loggedInAccount
                .getWatchedMovies()
                .forEach(movie -> System.out.println(movie.name));
    }

    private static void getCreditcardInfoFromMonthlyPaymentUsers() {
        for (Person loggedInAccount : accounts) {
            if(loggedInAccount
                    .getSubscriptionType()
                    .equals(Person.SubscriptionType.MONTHLY)) {
                System.out.println(loggedInAccount.getCreditCard());
            }
        }
    }

    private static void deleteUser() {
        System.out.println("What Contact do you want to Delete?");

        for (Person existingAccounts : accounts) {
            System.out.println(existingAccounts.getUsername());
        }

        String input = InputIn.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if(input.equalsIgnoreCase(accounts
                                              .get(i)
                                              .getUsername())) {
                String pass = InputIn.nextLineOut("Password pls:");

                if(pass.equalsIgnoreCase(accounts
                                                 .get(i)
                                                 .getPassword())) {
                    accounts.remove(accounts.get(i));
                }
            }
        }
    }

    private static void changeCreditcard() {
        String creditcard = InputIn.nextLineOut("Pls enter your Old CreditCard Information if you wish to change it. Enter it like :XXXX XXXX XXXX XXXX");

        for (Person credit : accounts) {
            if(credit
                    .getCreditCard()
                    .equals(creditcard)) {
                System.out.println("Type in your new Creditcard Information");
                creditcard = InputIn.nextLine();
                creditcard = getCreditcardNumber(creditcard);
                credit.setCreditCard(creditcard);
            }
        }
    }

    public static void nameSearch(Person loggedInAccount) {
        String movieFinder = InputIn.nextLineOut("Type in the movie name or a word that might appear in its name (if you want to see all Movies just press enter)");
        showAllMovieNamesWithSimilaritiesWithTheInput(movieFinder);

        String getInformation = InputIn.nextLineOut("Which of these Movies do you want the Information of");
        getMovieInformationOfWantedMovie(loggedInAccount, getInformation); //WantedMovie is what Movie was searched for after all names to that were shown
    }

    private static void getMovieInformationOfWantedMovie(Person loggedInAccount, String getInformation) {
        for (Movie movieSave : movies) {
            if(movieSave
                    .getName()
                    .equalsIgnoreCase(getInformation)) {
                movieSave.setViews(movieSave.getViews() + 1);
                System.out.println(
                        movieSave.getName() + " " + movieSave.getDuration() + " " + movieSave.getGenre() + " " +
                        movieSave.getProducer() + " " + movieSave.getViews());
                loggedInAccount.watchMovie(movieSave);
            }
        }
    }

    private static void showAllMovieNamesWithSimilaritiesWithTheInput(String movieFinder) {
        for (Movie movieSave : movies) {      //movieSave ist die Klasse wo alles abgespeichert ist von den Infos der Filme
            if(movieSave
                    .getName()
                    .toLowerCase()
                    .contains(movieFinder)) {
                System.out.println(movieSave.getName());
            }
        }
    }

    public static void genreSearch(Person loggedInAccount) {
        String genreFinder = InputIn.nextLineOut("Type in the Genre of the Movie you want to find. Keep in mind the Genre might not fit any movie");
        showAllMovieNamesWithTheSearchedGenre(genreFinder);

        String getInformation = InputIn.nextLineOut("Which of these Movies do you want the Information of");
        getTheInformationOfTheMovieWithTheSameNameAsTheInput(loggedInAccount, getInformation);
    }

    private static void getTheInformationOfTheMovieWithTheSameNameAsTheInput(Person loggedInAccount, String getInformation) {
        for (Movie movieSave : movies) {
            if(movieSave
                    .getName()
                    .equalsIgnoreCase(getInformation)) {
                movieSave.setViews(movieSave.getViews() + 1);
                System.out.println(
                        movieSave.getDuration() + " " + movieSave.getGenre() + " " + movieSave.getProducer() + " " +
                        movieSave.getViews());
                loggedInAccount.watchMovie(movieSave);
            }
        }
    }

    private static void showAllMovieNamesWithTheSearchedGenre(String genreFinder) {
        for (Movie movieSave : movies) {
            if(movieSave
                    .getGenre()
                    .toLowerCase()
                    .contains(genreFinder)) {
                System.out.println(movieSave.getName());
            }
        }
    }

    private static boolean logOutOfTheStreamSite() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hello, What would you like to do?");
        System.out.println("1: Create an Account");
        System.out.println("2: Log into your Account");
        System.out.println("3: Remove an account");
        System.out.println("4: Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        switchOptions();
        return true;
    }

    public static void initMovies() {
        List <Movie> movieList = new ArrayList <>();
        movieList.add(new Movie("the Godfather", Duration.ofMinutes(175),
                                "Crime " + "Drama", "Francis Ford Coppola", 4322));
        movieList.add(new Movie("the Shawshank Redemption", Duration.ofMinutes(142), "Drama", "Frank Darabont", 11239));
        movieList.add(new Movie("shindler's List", Duration.ofMinutes(195),
                                "History " + "Drama " + "Biography", "Steven Spielberg", 654321));
        movieList.add(new Movie("forrest Gump", Duration.ofMinutes(142),
                                "Romance " + "Drama", "Robert Zemechkis", 4576856));
        movieList.add(new Movie("angry Birds", Duration.ofMinutes(97),
                                "Animation " + "Action " + "Adventure", "Clay Kaytis" + " Fergal Reilly", 0));
        movieList.add(new Movie("shrek", Duration.ofMinutes(90),
                                "Fantasy " + "Adventure " + "Animation", "Andrew Adamson", 999999999));
        movieList.add(new Movie("the Dark Knight", Duration.ofMinutes(152),
                                "Action " + "Drama " + "Detective story", "Christopher Nolan", 42312));
        movieList.add(new Movie("wall-E", Duration.ofMinutes(98),
                                "Adventure " + "Animation " + "Family", "Andrew Stanton", 1));
        movieList.add(new Movie("avengers: Infinity War", Duration.ofMinutes(149),
                                "Sci-Fi " + "Adventure " + "Action", "Anthony Russo" + "Joe Russo", 54345));
        movieList.add(new Movie("joker", Duration.ofMinutes(122),
                                "Thriller " + "Detective Story " + "Drama", "Todd Phillips", 999999998));
        movieList.add(new Movie("the Wolf of Wall Street", Duration.ofMinutes(180),
                                "Comedy " + "Biography" + "Detective Story", "Martin Scorsese", 1234543));
        movieList.add(new Movie("the Truman Show", Duration.ofMinutes(103),
                                "Drama " + "Comedy", "Peter Weir", 999999997));
        movies = movieList;
    }
}