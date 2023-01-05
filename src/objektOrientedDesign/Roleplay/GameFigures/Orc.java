package objektOrientedDesign.Roleplay.GameFigures;

public class Orc extends Gamefigurine{
 private boolean rage;

    public Orc(String name, double lP, double cC, double fV, double res, double speed, double accuracy, double evasion,
               boolean rage) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.rage = rage;
    }

    public boolean isRage() {
        return rage;
    }

    public void setRage(boolean rage) {
        this.rage = rage;
    }
}