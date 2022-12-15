package objektOriented.aufg1.Generics.bibliothek;

public class Book<T> {
    private T author;
    private T genre;

    public Book(T author, T genre) {
        this.author = author;
        this.genre = genre;
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