package objektOrientedDesign.roleplay.items;

public class CharmRing extends Ring{
    private double lessenEnemiesFV;
    private double charm;       //To make the enemies FV go down a bit

    public CharmRing(double weight, double lessenEnemiesFV, double charm) {
        super(weight);
        this.lessenEnemiesFV = lessenEnemiesFV;
        this.charm = charm;
    }

    public double getLessenEnemiesFV() {
        return lessenEnemiesFV;
    }

    public void setLessenEnemiesFV(double lessenEnemiesFV) {
        this.lessenEnemiesFV = lessenEnemiesFV;
    }

    public double getCharm() {
        return charm;
    }

    public void setCharm(double charm) {
        this.charm = charm;
    }
}
