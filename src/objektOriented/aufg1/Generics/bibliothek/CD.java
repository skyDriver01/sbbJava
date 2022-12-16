package objektOriented.aufg1.Generics.bibliothek;

public class CD<T> {
    private T name;
    private T artist; // artist of the song in this verion of artist
    private int amountOfSongs;
    private boolean leased;

    public CD(T name,T artist, int amountOfSongs, boolean leased) {
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

    public T getArtist() {
        return artist;
    }

    public void setArtist(T artist) {
        this.artist = artist;
    }

    public int getAmountOfSongs() {
        return amountOfSongs;
    }

    public void setAmountOfSongs(int amountOfSongs) {
        this.amountOfSongs = amountOfSongs;
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
