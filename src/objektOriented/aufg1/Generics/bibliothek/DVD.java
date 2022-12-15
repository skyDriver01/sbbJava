package objektOriented.aufg1.Generics.bibliothek;

public class DVD<T> {
    private T director;
    private T genre;

    public DVD(T director, T genre) {
        this.director = director;
        this.genre = genre;
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