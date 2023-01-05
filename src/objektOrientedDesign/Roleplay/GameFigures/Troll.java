package objektOrientedDesign.Roleplay.GameFigures;

public class Troll extends Gamefigurine{
    private boolean gotClub;

    public Troll(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion,
                 boolean gotClub) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.gotClub = gotClub;
    }

    public boolean isGotClub() {
        return gotClub;
    }

    public void setGotClub(boolean gotClub) {
        this.gotClub = gotClub;
    }
}
