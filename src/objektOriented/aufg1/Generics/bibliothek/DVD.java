package objektOriented.aufg1.Generics.bibliothek;

public class DVD<T> {
    private T name;
    private T director;
    private T genre;
    private boolean leased;

    public DVD(T name, T director, T genre, boolean leased) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.leased = leased;
    }

    public boolean getLeased() {
        return leased;
    }

    public void setLeased(boolean leased) {
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