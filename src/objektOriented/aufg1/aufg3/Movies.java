package objektOriented.aufg1.aufg3;

public class Movies {
    final String name;
    final String duration; //TODO: Datentyp für Dauer, z.B. Duration
    final String genre;
    final String producer; //Todo kann man velinken mit klasse customer wenn sie gemacht worden ist anstatt einen String zu benutzen.
    final int views;
    final boolean viewed; //TODO eine liste machen wo zeigt welche personen ihn gesehen haben oder zu einer person eine Liste machen wo zeigt welche filme angesehen worden sind.

    public Movies(String name, String duration, String genre, String producer, int views, boolean viewed) {
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


    public String getDuration() {
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

    @Override
    public String toString() {
        return "StreamingDienstFilme{" + "name='" + name + '\'' + ", duration='" + duration + '\'' + ", genre='" + genre + '\'' + ", producer='" + producer + '\'' + ", views='" + views + '\'' + ", viewed=" + viewed + '}';
    }
}
