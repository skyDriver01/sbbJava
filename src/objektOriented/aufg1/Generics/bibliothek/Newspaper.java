package objektOriented.aufg1.Generics.bibliothek;

public class Newspaper <T> {
    private T publisher;
    private T date;
    private T leased;

    public Newspaper(T publisher, T date, boolean leased) {
        this.publisher = publisher;
        this.date = date;
        this.leased = leased;
    }

    public T getLeased() {
        return leased;
    }

    public void setLeased(T leased) {
        this.leased = leased;
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