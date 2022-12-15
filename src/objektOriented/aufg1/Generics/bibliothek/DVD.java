package objektOriented.aufg1.Generics.bibliothek;

public class DVD<T> {
    private T director;
    private T genre;
    private T leased;

    public DVD(T director, T genre, boolean leased) {
        this.director = director;
        this.genre = genre;
        this.leased = leased;
    }

    public T getLeased() {
        return leased;
    }

    public void setLeased(T leased) {
        this.leased = leased;
    }

    public T getDirector() {
        return director;
    }

    public void setDirector(T director) {
        this.director = director;
    }

    public T getGenre() {
        return genre;
    }

    public void setGenre(T genre) {
        this.genre = genre;
    }
}