package objektOrientedDesign.roleplay.gamefigures;

public class Elven extends Gamefigurine {
    public Elven(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV(){
        return super.getfV() + (getmV() / 2);
    }

}