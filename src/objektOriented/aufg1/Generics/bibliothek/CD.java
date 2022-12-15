package objektOriented.aufg1.Generics.bibliothek;

public class CD<T> {
    private T artist; // artist of the song in this verion of artist
    private int amountOfSongs;

    public CD(T artist, int amountOfSongs) {
        this.artist = artist;
        this.amountOfSongs = amountOfSongs;
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
