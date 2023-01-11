package objektOrientedDesign.roleplay.gamefigures;

public class Troll extends Gamefigurine {

    public Troll(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        if(getWeapon().getWeapon().equals("Club")) {
            setfV(getfV() * 2);
        }
        return getfV();
    }
}
