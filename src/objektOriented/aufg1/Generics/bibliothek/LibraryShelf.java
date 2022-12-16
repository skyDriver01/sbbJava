package objektOriented.aufg1.Generics.bibliothek;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.List;

public class LibraryShelf<T> {
    static List<Book> bookList;
    static List<CD> cdList;
    static List<DVD> dvdList;
    static List<Newspaper> newspaperList;

    public void insideTheLibrary(T element) {
        booklist();
        cdList();
        System.out.println("Hello what would you like to do?");
        System.out.println("1: Lease a Item");
        System.out.println("2: Give back a leased Item");
        System.out.println("3: Give the Information of the Item in the Library");
        System.out.println("4: leave");
        boolean exit = true;
        while (exit) {
            int option = InputIn.nextLineIntOut("choose one of these options pls.");
            switch (option) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {
                    boolean askForItem = true;
                    while (askForItem) {
                        String getItem = InputIn.nextLineOut("What Item would you like to get the Info from? The Items are: Book, Cd, Dvd or Newspaper, Type in what you want to see");
                        switch (getItem){
                            case "Book" ->{
                                String getBook = InputIn.nextLineOut("What Book do you went to get the Information from");
                                for (Book bookInfo : bookList){     //  Works rn TODO: make it so it gives all the books out before asking you and
                                                                            // Todo: make the getItem give out all the Items there are so: Book, Cd, DVD and Newspaper but dont hardcode it.
                                }
                            }
                            case "Cd" -> {
                                String getCD = InputIn.nextLineOut("What CD do you went to get the Information from");
                                for (CD cdInfo : cdList){

                                }
                            }
                            case "Dvd" -> {
                                String getDVD = InputIn.nextLineOut("What DVD do you went to get the Information from");
                                for (DVD dvdInfo : dvdList){

                                }
                            }
                            case "Newspaper" -> {
                                String getNewspaper = InputIn.nextLineOut("What Newspaper do you went to get the Information from");
                                for (Newspaper newspaperInfo : newspaperList){

                                }
                            }
                        }
                    }
                } case 4 -> exit = false;
            }
        }
    }

    final private void booklist() {
        List <T> books = new ArrayList <>();
        books.add((T) new Book("", "Steven Spielberg", "Fantasy", false));
        books.add((T) new Book("", "Walt Disney", "Comedy", false));
        books.add((T) new Book("", "Marcel Proust", "Novel", false));
        books.add((T) new Book("", "James Joyce", "History", false));
        books.add((T) new Book("", "F. Scott Fitzgerald", "Fantasy", false));
        books.add((T) new Book("", "Charles Dickens", "History", false));
        books.add((T) new Book("", "Harper Lee", "Novel", false));
        books.add((T) new Book("The Art of War", "Sun tzu", "treatise", false));
        bookList = (List <Book>) books;
    }

    final private void cdList() {
        List <T> cds = new ArrayList <>();
        cds.add((T) new CD("", "Pink Floyd", 10, false));
        cds.add((T) new CD("", "Led Zeppelin", 8, false));
        cds.add((T) new CD("", "The Beatles", 9, false));
        cds.add((T) new CD("", "AC/DC", 14, false));
        cds.add((T) new CD("", "Def Leppard", 7, false));
        cds.add((T) new CD("", "Neil Young", 12, false));
        cdList = (List <CD>) cds;
    }

    final private void dvdList() {
        List <T> dvds = new ArrayList <>();
        dvds.add((T) new DVD("", "David Fincher", "Crime", false));
        dvds.add((T) new DVD("", "Fracis Ford Coppola", "Drama", false));
        dvds.add((T) new DVD("", "Jean-Jacques Annaud", "Adventure", false));
        dvds.add((T) new DVD("", "Edward Zwick", "Thriller", false));
        dvds.add((T) new DVD("", "Guy Ritchie", "Comedy", false));
        dvds.add((T) new DVD("", "Christopher Nolan", "Action", false));
        dvdList = (List <DVD>) dvds;
    }

    final private void newspaperList() {
        List <T> newspapers = new ArrayList <>();
        newspapers.add((T) new Newspaper("The New York Times", "16April 1912", false));  // TODO: Change the second T Type to Date or smth that works better with dates.
        newspapers.add((T) new Newspaper("Daily Mail", "25th October 1929", false));
        newspapers.add((T) new Newspaper("The News Chronicle", "2nd May 1945", false));
        newspapers.add((T) new Newspaper("Chicago Tribune", "22nd November 1963", false)); //these dont work bc i need to make them with Calender datatype but i dont understand it yet
        newspapers.add((T) new Newspaper("Evening Standard", "21st July 1969", false));
        newspapers.add((T) new Newspaper("The Sun", "17th August 1977", false));
        newspaperList = (List <Newspaper>) newspapers;
    }
}