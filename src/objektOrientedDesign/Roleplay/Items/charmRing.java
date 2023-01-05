package objektOrientedDesign.Roleplay.Items;

public class charmRing extends Ring{
    double lessenEnemiesFV;
    double charm;       //To make the enemies FV go down a bit

    public charmRing(double weight, double lessenEnemiesFV, double charm) {
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
