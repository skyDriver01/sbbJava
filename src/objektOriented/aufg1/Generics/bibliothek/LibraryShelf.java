package objektOriented.aufg1.Generics.bibliothek;

import java.util.ArrayList;
import java.util.List;

public class LibraryShelf<T extends Comparable> {
    public static void main(String[] args) {

    }

    private T insideTheLibrary(T element) {

        return insideTheLibrary(element);
    }

    final private List <T> booklist() {
        List <T> books = new ArrayList <>();
        books.add((T) new Book <T>((T) "Steven Spielberg", (T) "Fantasy"));
        books.add((T) new Book <T>((T) "Walt Disney", (T) "Comedy"));
        books.add((T) new Book <T>((T) "Marcel Proust", (T) "Novel"));
        books.add((T) new Book <T>((T) "James Joyce", (T) "History"));
        books.add((T) new Book <T>((T) "F. Scott Fitzgerald", (T) "Fantasy"));
        books.add((T) new Book <T>((T) "Charles Dickens", (T) "History"));
        books.add((T) new Book <T>((T) "Harper Lee", (T) "Novel"));
        books.add((T) new Book <T>((T) "Sun tzu", (T) "treatise"));
        return books;
    }

    final private List <T> cdList() {
        List <T> cds = new ArrayList <>();
        cds.add((T) new CD <T>((T) "Pink Floyd",10));
        cds.add((T) new CD <T>((T) "Led Zeppelin",8));
        cds.add((T) new CD <T>((T) "The Beatles",9));
        cds.add((T) new CD <T>((T) "AC/DC",14));
        cds.add((T) new CD <T>((T) "Def Leppard",7));
        cds.add((T) new CD <T>((T) "Neil Young",12));
        return cdList();
    }

    final private List <T> dvdList() {
        List <T> dvds = new ArrayList <>();
        dvds.add((T) new DVD <T>((T) "David Fincher", (T) "Crime"));
        dvds.add((T) new DVD <T>((T) "Fracis Ford Coppola", (T) "Drama"));
        dvds.add((T) new DVD <T>((T) "Jean-Jacques Annaud", (T) "Adventure"));
        dvds.add((T) new DVD <T>((T) "Edward Zwick", (T) "Thriller"));
        dvds.add((T) new DVD <T>((T) "Guy Ritchie", (T) "Comedy"));
        dvds.add((T) new DVD <T>((T) "Christopher Nolan", (T) "Action"));
        return dvdList();
    }

    final private List <T> newspaperList() {
        List <T> newspapers = new ArrayList <>();
        newspapers.add((T) new Newspaper <T>((T) "The New York Times", (T) "16th April 1912"));  // TODO: Change the second T Type to Date or smth that works better with dates.
        newspapers.add((T) new Newspaper <T>((T) "Daily Mail", (T) "25th October 1929"));
        newspapers.add((T) new Newspaper <T>((T) "The News Chronicle", (T) "2nd May 1945"));
        newspapers.add((T) new Newspaper <T>((T) "Chicago Tribune", (T) "22nd November 1963"));
        newspapers.add((T) new Newspaper <T>((T) "Evening Standard", (T) "21st July 1969"));
        newspapers.add((T) new Newspaper <T>((T) "The Sun", (T) "17th August 1977"));
        return newspaperList();
    }
}