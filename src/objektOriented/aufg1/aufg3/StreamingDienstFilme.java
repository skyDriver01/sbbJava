package objektOriented.aufg1.aufg3;

import java.security.PrivateKey;

public class StreamingDienstFilme {
    private String name;
    private String duration;
    private String genre;
    private String producer;
    private String views;
    private boolean viewed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public StreamingDienstFilme(String name, String duration, String genre, String producer, String views, boolean viewed) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.producer = producer;
        this.views = views;
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        return "StreamingDienstFilme{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                ", producer='" + producer + '\'' +
                ", views='" + views + '\'' +
                ", viewed=" + viewed +
                '}';
    }
}
