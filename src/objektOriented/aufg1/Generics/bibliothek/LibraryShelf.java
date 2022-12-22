package objektOriented.aufg1.Generics.bibliothek;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class LibraryShelf<T> {
    static List <Book> bookList;
    static List <CD> cdList;
    static List <DVD> dvdList;
    static List <Newspaper> newspaperList;

    public void insideTheLibrary(T element) {
        booklist();
        cdList();
        dvdList();
        newspaperList();
        boolean exit = true;
        while (exit) {
            options();
            int option = InputIn.nextLineIntOut("choose one of these options pls.");
            switch (option) {
                case 1 -> lease();
                case 2 -> returnOption();
                case 3 -> getInformation();
                case 4 -> exit = false;
            }
        }
    }

    private static void options() {
        System.out.println("Hello what would you like to do?");
        System.out.println("1: Lease a Item");
        System.out.println("2: Give back a leased Item");
        System.out.println("3: Give the Information of the Item in the Library");
        System.out.println("4: leave");
    }

    private static void getInformation() {
        String getItem = InputIn.nextLineOut("What Item would you like to get the Info from? The Items are: Book, Cd, Dvd or Newspaper, Type in what you want to see");
        switch (getItem) {
            case "Book" -> bookCase();
            case "Cd" -> cdCase();
            case "Dvd" -> dvdCase();
            case "Newspaper" -> newspaperCase();
        }
    }

    private static void lease() {
        String getItem = InputIn.nextLineOut("What Item kind would you like to lease? (Book, Cd, Dvd or Newspaper)");
        switch (getItem) {
            case "Book" -> leaseABook();
            case "Cd" -> leaseACd();
            case "Dvd" -> leaseADvd();
            case "Newspaper" -> leaseANewspaper();
        }
    }

    private static void leaseABook() {
        bookList
                .stream()
                .forEach(a -> System.out.println(a.getName()));
        String getBook = InputIn.nextLineOut("What Book do you went to get the Information from");
        for (Book bookInfo : bookList) {
            if(bookInfo
                    .getName()
                    .equals(getBook)) {
                System.out.println(
                        "The Name of the Book: " + bookInfo.getName() + ", Who wrote it: " + bookInfo.getAuthor() +
                        ", What Genre it is: " + bookInfo.getGenre() + ", Is it already leased: " +
                        bookInfo.getLeased());
            }
        }
        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                for (Book book : bookList) {
                    if(book
                            .getName()
                            .equals(getBook)) {
                        book.setLeased(true);
                    }
                }
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    private static void leaseANewspaper() {
        newspaperList
                .stream()
                .forEach(a -> System.out.println(a.getPublisher()));
        String getNewspaper = InputIn.nextLineOut("What Newspaper do you want to get the Information of");
        for (Newspaper newspaperInfo : newspaperList) {
            if(newspaperInfo
                    .getPublisher()
                    .equals(getNewspaper)) {
                System.out.println("The Name of the Publishing Agency: " + newspaperInfo.getPublisher() +
                                   ", When was this published: " + newspaperInfo.getDate() +
                                   ", Is it already leased: " + newspaperInfo.getLeased());
            }
        }
        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                for (Newspaper newspaper : newspaperList) {
                    if(newspaper
                            .getPublisher()
                            .equals(getNewspaper)) {
                        newspaper.setLeased(true);
                    }
                }
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    private static void leaseADvd() {
        dvdList
                .stream()
                .forEach(a -> System.out.println(a.getName()));
        String getDvd = InputIn.nextLineOut("What Dvd do you want the Information of?");
        for (DVD dvdInfo : dvdList) {
            if(dvdInfo
                    .getName()
                    .equals(getDvd)) {
                System.out.println("The Name of the Dvd: " + dvdInfo.getName() + ", Who is the Director: " +
                                   dvdInfo.getDirector() + ", What Genre is it: " + dvdInfo.getGenre() +
                                   ", Is it already leased: " + dvdInfo.getLeased());
            }
        }
        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                for (DVD dvd : dvdList) {
                    if(dvd
                            .getName()
                            .equals(getDvd)) {
                        dvd.setLeased(true);
                    }
                }
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    private static void leaseACd() {
        cdList
                .stream()
                .forEach(a -> System.out.println(a.getName()));
        String getCd = InputIn.nextLineOut("What Cd do you want the Information of?");
        for (CD cdInfo : cdList) {
            if(cdInfo
                    .getName()
                    .equals(getCd)) {
                System.out.println(
                        "The Name of the Album: " + cdInfo.getName() + ", Who is the artist: " + cdInfo.getArtist() +
                        ", How many Tracks: " + cdInfo.getAmountOfSongs() + ", Is it already leased: " +
                        cdInfo.getLeased());
            }
        }
        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                for (CD cd : cdList) {
                    if(cd
                            .getName()
                            .equals(getCd)) {
                        cd.setLeased(true);
                    }
                }
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    public static void bookCase() {
        bookList
                .stream()
                .forEach(a -> System.out.println(a.getName()));
        getBookInfo();
    }

    private static void getBookInfo() {
        String getBook = InputIn.nextLineOut("What Book do you went to get the Information from");
        for (Book bookInfo : bookList) {
            if(bookInfo
                    .getName()
                    .equals(getBook)) {
                System.out.println(
                        "The Name of the Book: " + bookInfo.getName() + ", Who wrote it: " + bookInfo.getAuthor() +
                        ", What Genre it is: " + bookInfo.getGenre() + ", Is it already leased: " +
                        bookInfo.getLeased());
            }
        }
    }

    public static void newspaperCase() {
        newspaperList
                .stream()
                .forEach(a -> System.out.println(a.getPublisher()));
        getNewsPaperInfo();
    }

    private static void getNewsPaperInfo() {
        String getNewspaper = InputIn.nextLineOut("What Newspaper do you went to get the Information from");
        for (Newspaper newspaperInfo : newspaperList) {
            if(newspaperInfo
                    .getPublisher()
                    .equals(getNewspaper)) {
                System.out.println("The Name of the Publishing Agency: " + newspaperInfo.getPublisher() +
                                   ", When was this published: " + newspaperInfo.getDate() +
                                   ", Is it already leased: " + newspaperInfo.getLeased());
            }
        }
    }

    public static void dvdCase() {
        dvdList
                .stream()
                .forEach(a -> System.out.println(a.getName()));
        getDvdInfo();
    }

    private static void getDvdInfo() {
        String getDVD = InputIn.nextLineOut("What DVD do you went to get the Information from");
        for (DVD dvdInfo : dvdList) {
            if(dvdInfo
                    .getName()
                    .equals(getDVD)) {
                System.out.println("The Name of the Dvd: " + dvdInfo.getName() + ", Who is the Director: " +
                                   dvdInfo.getDirector() + ", What Genre is it: " + dvdInfo.getGenre() +
                                   ", Is it already leased: " + dvdInfo.getLeased());
            }
        }
    }

    public static void cdCase() {
        cdList
                .stream()
                .forEach(a -> System.out.println(a.getName()));
        getCDInfo();
    }

    private static void getCDInfo() {
        String getCD = InputIn.nextLineOut("What CD do you went to get the Information from");
        for (CD cdInfo : cdList) {
            if(cdInfo
                    .getName()
                    .equals(getCD)) {
                System.out.println(
                        "The Name of the Album: " + cdInfo.getName() + ", Who is the artist: " + cdInfo.getArtist() +
                        ", How many Tracks: " + cdInfo.getAmountOfSongs() + ", Is it already leased: " +
                        cdInfo.getLeased());
            }
        }
    }

    private static void returnOption() {
        String getItem = InputIn.nextLineOut("What Item kind would you like to return? (Book, Cd, Dvd or Newspaper)");
        switch (getItem) {
            case "Book" -> bookReturn();

            case "Cd" -> cdReturn();

            case "Dvd" -> dvdReturn();

            case "Newspaper" -> newspaperReturn();

        }
    }

    private static void newspaperReturn() {
        newspaperList
                .stream()
                .filter(a -> a.getLeased())
                .forEach(a -> System.out.println(a.getPublisher()));
        String returnItem = InputIn.nextLineOut("What Newspaper would you like to return?");
        for (Newspaper newspaper : newspaperList) {
            if(newspaper
                    .getPublisher()
                    .equals(returnItem)) {
                newspaper.setLeased(false);
            }
        }
    }

    private static void dvdReturn() {
        dvdList
                .stream()
                .filter(a -> a.isLeased())
                .forEach(a -> System.out.println(a.getName()));
        String returnItem = InputIn.nextLineOut("What Dvd would you like to return?");
        for (DVD dvd : dvdList) {
            if(dvd
                    .getName()
                    .equals(returnItem)) {
                dvd.setLeased(false);
            }
        }
    }

    private static void cdReturn() {
        cdList
                .stream()
                .filter(a -> a.isLeased())
                .forEach(a -> System.out.println(a.getName()));
        String returnItem = InputIn.nextLineOut("What Cd would you like to return?");
        for (CD cd : cdList) {
            if(cd
                    .getName()
                    .equals(returnItem)) {
                cd.setLeased(false);
            }
        }
    }

    private static void bookReturn() {
        bookList
                .stream()
                .filter(a -> a.isLeased())
                .forEach(a -> System.out.println(a.getName()));
        String returnItem = InputIn.nextLineOut("What Book do you want to return?");
        for (Book book : bookList) {
            if(book
                    .getName()
                    .equals(returnItem)) {
                book.setLeased(false);
            }
        }
    }

    private void booklist() {
        List <T> books = new ArrayList <>();
        books.add((T) new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fantasy", false));
        books.add((T) new Book("Oliver Twist", "Charles Dickens", "History", false));
        books.add((T) new Book("To kill a Mockingbird", "Harper Lee", "Novel", true));
        books.add((T) new Book("The Art of War", "Sun tzu", "treatise", false));
        bookList = (List <Book>) books;
    }

    private void cdList() {
        List <T> cds = new ArrayList <>();
        cds.add((T) new CD("Dark Side Of the Moon", "Pink Floyd", 10, true));
        cds.add((T) new CD("Led Zeppelin IV", "Led Zeppelin", 8, false));
        cds.add((T) new CD("Abbey Road", "The Beatles", 9, false));
        cds.add((T) new CD("Highway to Hell", "AC/DC", 14, true));
        cds.add((T) new CD("Hysteria", "Def Leppard", 7, false));
        cds.add((T) new CD("Harvest Moon", "Neil Young", 12, true));
        cdList = (List <CD>) cds;
    }

    private void dvdList() {
        List <T> dvds = new ArrayList <>();
        dvds.add((T) new DVD("Fight Club", "David Fincher", "Crime", true));
        dvds.add((T) new DVD("The Godfather", "Fracis Ford Coppola", "Drama", true));
        dvds.add((T) new DVD("Black Gold", "Jean-Jacques Annaud", "Adventure", false));
        dvds.add((T) new DVD("Inception", "Christopher Nolan", "Action", false));
        dvdList = (List <DVD>) dvds;
    }

    private void newspaperList() {
        List <T> newspapers = new ArrayList <>();
        newspapers.add((T) new Newspaper("The New York Times", "16April 1912", true));
        newspapers.add((T) new Newspaper("Daily Mail", "25th October 1929", true));
        newspapers.add((T) new Newspaper("The News Chronicle", "2nd May 1945", false));
        newspapers.add((T) new Newspaper("Chicago Tribune", "22nd November 1963", false));
        newspapers.add((T) new Newspaper("Evening Standard", "21st July 1969", true));
        newspapers.add((T) new Newspaper("The Sun", "17th August 1977", false));
        newspaperList = (List <Newspaper>) newspapers;
    }
}