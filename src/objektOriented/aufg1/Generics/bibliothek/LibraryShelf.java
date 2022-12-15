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
        cds.add((T) new CD <T>((T) "Let it Happen",32));
        cds.add((T) new CD <T>((T) "America's Funnyman",44));
        cds.add((T) new CD <T>((T) "",0));
        cds.add((T) new CD <T>((T) "",0));
        cds.add((T) new CD <T>((T) "",0));
        cds.add((T) new CD <T>((T) "",0));
        return cdList();
    }

    final private List <T> dvdList() {
        List <T> dvds = new ArrayList <>();
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        dvds.add((T) new DVD <T>((T) "", (T) ""));
        return dvdList();
    }

    final private List <T> newspaperList() {
        List <T> newspapers = new ArrayList <>();
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        newspapers.add((T) new Newspaper <T>((T) "", (T) ""));
        return newspaperList();
    }
}
