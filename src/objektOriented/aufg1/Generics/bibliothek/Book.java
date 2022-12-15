package objektOriented.aufg1.Generics.bibliothek;

public class Book<T> {
    private T author;
    private T genre;
    private T leased;

    public Book(T author, T genre, boolean leased) {
        this.author = author;
        this.genre = genre;
        this.leased = leased;
    }

    public T getLeased() {
        return leased;
    }

    public void setLeased(T leased) {
        this.leased = leased;
    }

    public T getAuthor() {
        return author;
    }

    public T getGenre() {
        return genre;
    }

    public void setAuthor(T author) {
        this.author = author;
    }

    public void setGenre(T genre) {
        this.genre = genre;
    }
}