package objektOriented.aufg1.Generics.bibliothek;

public class Book<T> {
    private T name;
    private T author;
    private T genre;
    private boolean leased;
 //TODO : Specific datatypes
    public Book(T name,T author, T genre, boolean leased) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.leased = leased;
    }

    public boolean getLeased() {
        return leased;
    }

    public void setLeased(boolean leased) {
        this.leased = leased;
    }

    public T getAuthor() {
        return author;
    }

    public T getGenre() {
        return genre;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public boolean isLeased() {
        return leased;
    }
}