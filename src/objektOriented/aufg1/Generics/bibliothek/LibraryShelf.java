package objektOriented.aufg1.Generics.bibliothek;

import java.util.ArrayList;
import java.util.List;

public class LibraryShelf<T extends Comparable> {
    public static void main(String[] args) {

    }

    private T insideTheLibrary(T element) {
        booklist();
        cdList();
        dvdList();
        newspaperList();

        return insideTheLibrary(element);
    }

    final private List <T> booklist() {
        List <T> books = new ArrayList <>();
        books.add((T) new Book <T>((T) "Steven Spielberg", (T) "Fantasy", false));
        books.add((T) new Book <T>((T) "Walt Disney", (T) "Comedy",false));
        books.add((T) new Book <T>((T) "Marcel Proust", (T) "Novel",false));
        books.add((T) new Book <T>((T) "James Joyce", (T) "History",false));
        books.add((T) new Book <T>((T) "F. Scott Fitzgerald", (T) "Fantasy",false));
        books.add((T) new Book <T>((T) "Charles Dickens", (T) "History",false));
        books.add((T) new Book <T>((T) "Harper Lee", (T) "Novel",false));
        books.add((T) new Book <T>((T) "Sun tzu", (T) "treatise",false));
        return books;
    }

    final private List <T> cdList() {
        List <T> cds = new ArrayList <>();
        cds.add((T) new CD <T>((T) "Pink Floyd",10,false));
        cds.add((T) new CD <T>((T) "Led Zeppelin",8,false));
        cds.add((T) new CD <T>((T) "The Beatles",9,false));
        cds.add((T) new CD <T>((T) "AC/DC",14,false));
        cds.add((T) new CD <T>((T) "Def Leppard",7,false));
        cds.add((T) new CD <T>((T) "Neil Young",12,false));
        return cdList();
    }

    final private List <T> dvdList() {
        List <T> dvds = new ArrayList <>();
        dvds.add((T) new DVD <T>((T) "David Fincher", (T) "Crime",false));
        dvds.add((T) new DVD <T>((T) "Fracis Ford Coppola", (T) "Drama",false));
        dvds.add((T) new DVD <T>((T) "Jean-Jacques Annaud", (T) "Adventure",false));
        dvds.add((T) new DVD <T>((T) "Edward Zwick", (T) "Thriller",false));
        dvds.add((T) new DVD <T>((T) "Guy Ritchie", (T) "Comedy",false));
        dvds.add((T) new DVD <T>((T) "Christopher Nolan", (T) "Action",false));
        return dvdList();
    }

    final private List <T> newspaperList() {
        List <T> newspapers = new ArrayList <>();
        newspapers.add((T) new Newspaper <T>((T) "The New York Times", (T) "16th April 1912",false));  // TODO: Change the second T Type to Date or smth that works better with dates.
        newspapers.add((T) new Newspaper <T>((T) "Daily Mail", (T) "25th October 1929",false));
        newspapers.add((T) new Newspaper <T>((T) "The News Chronicle", (T) "2nd May 1945",false));
        newspapers.add((T) new Newspaper <T>((T) "Chicago Tribune", (T) "22nd November 1963",false));
        newspapers.add((T) new Newspaper <T>((T) "Evening Standard", (T) "21st July 1969",false));
        newspapers.add((T) new Newspaper <T>((T) "The Sun", (T) "17th August 1977",false));
        return newspaperList();
    }
}