package objektOriented.aufg1.Generics.bibliothek;

public class CD<T> {
    private T artist; // artist of the song in this verion of artist
    private int amountOfSongs;
    private T leased;

    public CD(T artist, int amountOfSongs, boolean leased) {
        this.artist = artist;
        this.amountOfSongs = amountOfSongs;
        this.leased = leased;
    }

    public T getLeased() {
        return leased;
    }

    public void setLeased(T leased) {
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
}
