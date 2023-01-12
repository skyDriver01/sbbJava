package objektOriented.aufg1.Generics.bibliothek;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class LibraryShelf<T> {
    private List <T> itemList = new ArrayList <>();

    public void insideTheLibrary() {
        initItemList();
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

    private void options() {
        System.out.println("Hello what would you like to do?");
        System.out.println("1: Lease a Item");
        System.out.println("2: Give back a leased Item");
        System.out.println("3: Give the Information of the Item in the Library");
        System.out.println("4: leave");
    }

    private void getInformation() {
        String getItem =
                InputIn.nextLineOut("What Item would you like to get the Info from? The Items are: Book, Cd, Dvd or Newspaper, Type in what you want to see");
        switch (getItem) {
            case "Book" -> bookCase();
            case "Cd" -> cdCase();
            case "Dvd" -> dvdCase();
            case "Newspaper" -> newspaperCase();
        }
    }

    private void lease() {
        String getItem = InputIn.nextLineOut("What Item kind would you like to lease? (Book, Cd, Dvd or Newspaper)");
        switch (getItem) {
            case "Book" -> leaseABook();
            case "Cd" -> leaseACd();
            case "Dvd" -> leaseADvd();
            case "Newspaper" -> leaseANewspaper();
        }
    }

    private void leaseABook() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Book.class) {
                        Book book = (Book) a;
                        System.out.println(((Book) book).getName());
                    }
                });
        String getBook = InputIn.nextLineOut("What Book do you went to get the Information from");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Book.class) {
                        Book book = (Book) a;
                        if(getBook.equals(book.getName())) {
                            System.out.println("The Name of the Book: " + book.getName() + ", Who wrote it: " + book.getAuthor() + ", What Genre it is: " + book.getGenre() + ", Is it already leased: " + book.getLeased());
                        }
                    }
                });

        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                itemList
                        .stream()
                        .forEach(a -> {
                            if(a.getClass() == Book.class) {
                                Book book = (Book) a;
                                book.setLeased(true);
                            }
                        });
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    private void leaseANewspaper() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Newspaper.class) {
                        Newspaper news = (Newspaper) a;
                        System.out.println(((Newspaper) news).getPublisher());
                    }
                });
        String getNewspaper = InputIn.nextLineOut("What Newspaper do you want to get the Information of");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Newspaper.class) {
                        Newspaper newspaper = (Newspaper) a;
                        if(getNewspaper.equals(newspaper.getPublisher())) {
                            System.out.println("The Name of the Publishing Agency: " + newspaper.getPublisher() + ", When was this published: " + newspaper.getDate() + ", Is it already leased: " + newspaper.getLeased());
                        }
                    }
                });

        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                itemList
                        .stream()
                        .forEach(a -> {
                            if(a.getClass() == Newspaper.class) {
                                Newspaper news = (Newspaper) a;
                                news.setLeased(true);
                            }
                        });
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    private void leaseADvd() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == DVD.class) {
                        DVD dvd = (DVD) a;
                        System.out.println(((DVD) dvd).getName());
                    }
                });
        String getDvd = InputIn.nextLineOut("What Dvd do you want the Information of?");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == DVD.class) {
                        DVD dvd = (DVD) a;
                        if(getDvd.equals(dvd.getName())) {
                            System.out.println("The Name of the Dvd: " + dvd.getName() + ", Who is the Director: " + dvd.getDirector() + ", What Genre is it: " + dvd.getGenre() + ", Is it already leased: " + dvd.getLeased());
                        }
                    }
                });

        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                itemList
                        .stream()
                        .forEach(a -> {
                            if(a.getClass() == DVD.class) {
                                DVD dvd = (DVD) a;
                                dvd.setLeased(true);
                            }
                        });
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    private void leaseACd() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == CD.class) {
                        CD cd = (CD) a;
                        System.out.println(((CD) cd).getName());
                    }
                });
        String getCd = InputIn.nextLineOut("What Cd do you want the Information of?");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == CD.class) {
                        CD cd = (CD) a;
                        if(getCd.equals(cd.getName())) {
                            System.out.println("The Name of the Album: " + cd.getName() + ", Who is the artist: " + cd.getArtist() + ", How many Tracks: " + cd.getAmountOfSongs() + ", Is it already leased: " + cd.getLeased());
                        }
                    }
                });

        String askToLease = InputIn.nextLineOut("Do you want to lease it, if it isnt leased already?(Yes or No)");
        switch (askToLease) {
            case "Yes" -> {
                itemList
                        .stream()
                        .forEach(a -> {
                            if(a.getClass() == CD.class) {
                                CD cd = (CD) a;
                                cd.setLeased(true);
                            }
                        });
            }
            case "No" -> {
                System.out.println("Ok");
            }
        }
    }

    public void bookCase() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Book.class) {
                        Book book = (Book) a;
                        System.out.println(((Book) book).getName());
                    }
                });
        getBookInfo();
    }

    private void getBookInfo() {
        String getBook = InputIn.nextLineOut("What Book do you went to get the Information from");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Book.class) {
                        Book book = (Book) a;
                        if(getBook.equals(book.getName())) {
                            System.out.println("The Name of the Book: " + book.getName() + ", Who wrote it: " + book.getAuthor() + ", What Genre it is: " + book.getGenre() + ", Is it already leased: " + book.getLeased());
                        }
                    }
                });

    }

    public void newspaperCase() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Newspaper.class) {
                        Newspaper news = (Newspaper) a;
                        System.out.println(((Newspaper) news).getPublisher());
                    }
                });
        getNewsPaperInfo();
    }

    private void getNewsPaperInfo() {
        String getNewspaper = InputIn.nextLineOut("What Newspaper do you went to get the Information from");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Newspaper.class) {
                        Newspaper newspaper = (Newspaper) a;
                        if(getNewspaper.equals(newspaper.getPublisher())) {
                            System.out.println("The Name of the Publishing Agency: " + newspaper.getPublisher() + ", When was this published: " + newspaper.getDate() + ", Is it already leased: " + newspaper.getLeased());
                        }
                    }
                });
    }

    public void dvdCase() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == DVD.class) {
                        DVD dvd = (DVD) a;
                        System.out.println(((DVD) dvd).getName());
                    }
                });
        getDvdInfo();
    }

    private void getDvdInfo() {
        String getDVD = InputIn.nextLineOut("What DVD do you went to get the Information from");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == DVD.class) {
                        DVD dvd = (DVD) a;
                        if(getDVD.equals(dvd.getName())) {
                            System.out.println("The Name of the Dvd: " + dvd.getName() + ", Who is the Director: " + dvd.getDirector() + ", What Genre is it: " + dvd.getGenre() + ", Is it already leased: " + dvd.getLeased());
                        }
                    }
                });
    }

    public void cdCase() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == CD.class) {
                        CD cd = (CD) a;
                        System.out.println(((CD) cd).getName());
                    }
                });
        getCDInfo();
    }

    private void getCDInfo() {
        String getCD = InputIn.nextLineOut("What CD do you went to get the Information from");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == CD.class) {
                        CD cd = (CD) a;
                        if(getCD.equals(cd.getName())) {
                            System.out.println("The Name of the Album: " + cd.getName() + ", Who is the artist: " + cd.getArtist() + ", How many Tracks: " + cd.getAmountOfSongs() + ", Is it already leased: " + cd.getLeased());
                        }
                    }
                });
    }

    private void returnOption() {
        String getItem = InputIn.nextLineOut("What Item kind would you like to return? (Book, Cd, Dvd or Newspaper)");
        switch (getItem) {
            case "Book" -> bookReturn();

            case "Cd" -> cdReturn();

            case "Dvd" -> dvdReturn();

            case "Newspaper" -> newspaperReturn();

        }
    }

    private void newspaperReturn() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Newspaper.class) {
                        Newspaper news = (Newspaper) a;
                        System.out.println(((Newspaper) news).getPublisher());
                    }
                });
        String returnItem = InputIn.nextLineOut("What Newspaper would you like to return?");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Newspaper.class) {
                        Newspaper news = (Newspaper) a;
                        if(returnItem.equals(news.getPublisher())) {
                            news.setLeased(false);
                        }
                    }
                });
    }

    private void dvdReturn() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == DVD.class) {
                        DVD dvd = (DVD) a;
                        System.out.println(((DVD) dvd).getName());
                    }
                });     //TODO: Test making a generic method to get the redundant parts of code away.
        String returnItem = InputIn.nextLineOut("What Dvd would you like to return?");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == DVD.class) {
                        DVD dvd = (DVD) a;
                        if(returnItem.equals(dvd.getName())) {
                            dvd.setLeased(false);
                        }
                    }
                });
    }

    private void cdReturn() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == CD.class) {
                        CD cd = (CD) a;
                        System.out.println(((CD) cd).getName());
                    }
                });
        String returnItem = InputIn.nextLineOut("What Cd would you like to return?");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == CD.class) {
                        CD cd = (CD) a;
                        if(returnItem.equals(cd.getName())) {
                            cd.setLeased(false);
                        }
                    }
                });
    }

    private void bookReturn() {
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Book.class) {
                        Book book = (Book) a;
                        System.out.println(((Book) book).getName());
                    }
                });
        String returnItem = InputIn.nextLineOut("What Book do you want to return?");
        itemList
                .stream()
                .forEach(a -> {
                    if(a.getClass() == Book.class) {
                        Book book = (Book) a;
                        if(returnItem.equals(book.getName())) {
                            book.setLeased(false);
                        }
                    }
                });
    }

    private void initItemList() {
        List <T> genericList = new ArrayList <>();
        genericList.add((T) new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fantasy", false));
        genericList.add((T) new Book("Oliver Twist", "Charles Dickens", "History", false));
        genericList.add((T) new Book("To kill a Mockingbird", "Harper Lee", "Novel", true));
        genericList.add((T) new Book("The Art of War", "Sun tzu", "treatise", false));
        //--------------------------------------------------------------------------------------------------------------
        genericList.add((T) new CD("Dark Side Of the Moon", "Pink Floyd", 10, true));
        genericList.add((T) new CD("Led Zeppelin IV", "Led Zeppelin", 8, false));
        genericList.add((T) new CD("Abbey Road", "The Beatles", 9, false));
        genericList.add((T) new CD("Highway to hell", "AC/DC", 14, true));
        genericList.add((T) new CD("Hysteria", "Def Leppard", 7, false));
        genericList.add((T) new CD("Harvest Moon", "Neil Young", 12, true));
        //--------------------------------------------------------------------------------------------------------------
        genericList.add((T) new DVD("Fight Club", "David Fincher", "Crime", true));
        genericList.add((T) new DVD("The Godfather", "Francis Ford Coppola", "Drama", true));
        genericList.add((T) new DVD("Black Gold", "Jean-Jacques Annaud", "Adventure", true));
        genericList.add((T) new DVD("Inception", "Christopher Nolan", "Action", true));
        //--------------------------------------------------------------------------------------------------------------
        genericList.add((T) new Newspaper("The New York Times", "16th April 1912", true));
        genericList.add((T) new Newspaper("Daily Mail", "25th October 1929", true));
        genericList.add((T) new Newspaper("The News Chronicle", "2nd May 1945", false));
        genericList.add((T) new Newspaper("Chicago Tribune", "22nd November 1963", false));
        genericList.add((T) new Newspaper("Evening Standard", "21st July 1969", true));
        genericList.add((T) new Newspaper("The Sun", "17th August 1977", false));
        itemList = genericList;
    }

    public void genericMethod() {
        /*itemList.forEach(a -> {
            if(a.getClass() == DVD.class){
                DVD d = (DVD) a;
                System.out.println(d.getName());
            }
        });*/
    }
}
// TODO : eingültig machen listen book nicht generisch und eine eigene liste names ITEMLIST wo generisch ist (after 3 days if not done go to migu)
    /*private void booklist() {
        List <T> books = new ArrayList <>();
        books.add((T) new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fantasy", false));
        books.add((T) new Book("Oliver Twist", "Charles Dickens", "History", false));
        books.add((T) new Book("To kill a Mockingbird", "Harper Lee", "Novel", true));
        books.add((T) new Book("The Art of War", "Sun tzu", "treatise", false));
        itemList = (List <T>) books;
    }

    private void cdList() {
        List <T> cds = new ArrayList <>();
        cds.add((T) new CD("Dark Side Of the Moon", "Pink Floyd", 10, true));
        cds.add((T) new CD("Led Zeppelin IV", "Led Zeppelin", 8, false));
        cds.add((T) new CD("Abbey Road", "The Beatles", 9, false));
        cds.add((T) new CD("Highway to Hell", "AC/DC", 14, true));
        cds.add((T) new CD("Hysteria", "Def Leppard", 7, false));
        cds.add((T) new CD("Harvest Moon", "Neil Young", 12, true));
        itemList = (List <T>) cds;
    }


    private void dvdList() {
        List <T> dvds = new ArrayList <>();
        dvds.add((T) new DVD("Fight Club", "David Fincher", "Crime", true));
        dvds.add((T) new DVD("The Godfather", "Fracis Ford Coppola", "Drama", true));
        dvds.add((T) new DVD("Black Gold", "Jean-Jacques Annaud", "Adventure", false));
        dvds.add((T) new DVD("Inception", "Christopher Nolan", "Action", false));
        itemList = (List <T>) dvds;
    }

    private void newspaperList() {
        List <T> newspapers = new ArrayList <>();
        newspapers.add((T) new Newspaper("The New York Times", "16April 1912", true));
        newspapers.add((T) new Newspaper("Daily Mail", "25th October 1929", true));
        newspapers.add((T) new Newspaper("The News Chronicle", "2nd May 1945", false));
        newspapers.add((T) new Newspaper("Chicago Tribune", "22nd November 1963", false));
        newspapers.add((T) new Newspaper("Evening Standard", "21st July 1969", true));
        newspapers.add((T) new Newspaper("The Sun", "17th August 1977", false));
        itemList = (List <T>) newspapers;
    }*/