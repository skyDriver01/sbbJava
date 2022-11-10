package objektOriented.aufg1.aufg3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamingSite {
    public static void executeSite() {

    }
    private static void changeCreditcard(String creditcard, Scanner scanner, List<Person> tempList) {
        System.out.println("Pls enter your Old CreditCard Information if you wish to change it. Enter it like :XXXX XXXX XXXX XXXX");
        creditcard = scanner.nextLine();
        for (Person credit : tempList) {
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
        movieList.add(new Movies("the Godfather", "175", "Crime " + "Drama", "Francis Ford Coppola", "4322", false));
        movieList.add(new Movies("the Shawshank Redemption", "142", "Drama", "Frank Darabont", "11234", false));
        movieList.add(new Movies("shindler's List", "195", "History " + "Drama " + "Biography", "Steven Spielberg", "654321", false));
        movieList.add(new Movies("forrest Gump", "142", "Romance " + "Drama", "Robert Zemechkis", "0", false));
        movieList.add(new Movies("angry Birds", "97", "Animation " + "Action " + "Adventure", "Clay Kaytis" + " Fergal Reilly", "456452", false));
        movieList.add(new Movies("shrek", "90", "Fantasy " + "Adventure " + "Animation", "Andrew Adamson", "9999999999", false));
        movieList.add(new Movies("the Dark Knight", "152", "Action " + "Drama " + "Detective story", "Christopher Nolan", "42312", false));
        movieList.add(new Movies("wall-E", "98", "Adventure " + "Animation " + "Family", "Andrew Stanton", "1", false));
        movieList.add(new Movies("avengers: Infinity War", "149", "Sci-Fi " + "Adventure " + "Action", "Anthony Russo" + "Joe Russo", "54345", false));
        movieList.add(new Movies("joker", "122", "Thriller " + "Detective Story " + "Drama", "Todd Phillips", "9999998", false));
        movieList.add(new Movies("the Wolf of Wall Street", "180", "Comedy " + "Biography" + "Detective Story", "Martin Scorsese", "1234543", false));
        movieList.add(new Movies("the Truman Show", "103", "Drama " + "Comedy", "Peter Weir", "9999997", false));
        return movieList;
    }
}
