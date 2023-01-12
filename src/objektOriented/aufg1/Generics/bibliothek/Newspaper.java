package objektOriented.aufg1.Generics.bibliothek;

public class Newspaper {
    private String publisher;
    private String date;
    private boolean leased;

    public Newspaper(String publisher, String date, boolean leased) {
        this.publisher = publisher;
        this.date = date;
        this.leased = leased;
    }

    public boolean getLeased() {
        return leased;
    }

    public void setLeased(boolean leased) {
        this.leased = leased;
    }

    public String getPublisher() {
        return publisher;
    }


    public String getDate() {
        return date;
    }

}