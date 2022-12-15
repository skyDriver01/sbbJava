package objektOriented.aufg1.Generics.bibliothek;

public class Newspaper <T> {
    private T publisher;
    private T date;

    public Newspaper(T publisher, T date) {
        this.publisher = publisher;
        this.date = date;
    }

    public T getPublisher() {
        return publisher;
    }

    public void setPublisher(T publisher) {
        this.publisher = publisher;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}