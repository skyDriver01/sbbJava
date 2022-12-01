package objektOriented.aufg1.aufg3;

import java.time.Duration;

public class Movies {
    final String name;
    final Duration duration;
    final String genre;
    final String producer;
    private int views;
    final boolean viewed; //TODO person eine Liste machen wo zeigt welche filme angesehen worden sind.

    public Movies(String name, Duration duration, String genre, String producer, int views, boolean viewed) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.producer = producer;
        this.views = views;
        this.viewed = viewed;
    }

    public String getName() {
        return name;
    }


    public Duration getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getProducer() {
        return producer;
    }


    public int getViews() {
        return views;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String toString() {
        return "StreamingDienstFilme{" + "name='" + name + '\'' + ", duration='" + duration + '\''
                + ", genre='" + genre + '\'' + ", producer='" + producer + '\'' +
                ", views='" + views + '\'' + ", viewed=" + viewed + '}';
    }
}
