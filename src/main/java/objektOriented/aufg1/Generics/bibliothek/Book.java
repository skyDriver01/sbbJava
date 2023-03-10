package objektOriented.aufg1.Generics.bibliothek;

public class Book{
    private String name;
    private String author;
    private String genre;
    private boolean leased;
    public Book(String name, String author, String genre, boolean leased) {
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

    public String getAuthor() {
        return author;
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