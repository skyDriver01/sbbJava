package objektOriented.aufg1.Generics.bibliothek;

public class CD {
    private String name;
    private String artist; // artist of the song in this verion of artist
    private int amountOfSongs;
    private boolean leased;

    public CD(String name, String artist, int amountOfSongs, boolean leased) {
        this.name = name;
        this.artist = artist;
        this.amountOfSongs = amountOfSongs;
        this.leased = leased;
    }

    public boolean getLeased() {
        return leased;
    }

    public void setLeased(boolean leased) {
        this.leased = leased;
    }

    public String getArtist() {
        return artist;
    }

    public int getAmountOfSongs() {
        return amountOfSongs;
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