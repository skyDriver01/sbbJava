package objektOriented.CØØP;

public class Schüpercard {
    private int points;
    private String id;

    public Schüpercard(int points, String id) {
        this.points = points;
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
