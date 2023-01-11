package objektOrientedDesign.roleplay.gamefigures;

public class Elven extends Gamefigurine{
    public Elven(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        if(getWeapon().getWeapon().equals("Bow")){
            setfV(getfV() + (getfV() / 2) + getWeapon().getfV());
            setAccuracy(1);
        }
        return getfV() + getAccuracy();
    }
}