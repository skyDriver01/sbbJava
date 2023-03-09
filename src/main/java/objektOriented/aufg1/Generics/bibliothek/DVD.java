package main.java.objektOriented.aufg1.Generics.bibliothek;

public class DVD {
    private String name;
    private String director;
    private String genre;
    private boolean leased;

    public DVD(String name, String director, String genre, boolean leased) {
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

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLeased() {
        return leased;
    }
}