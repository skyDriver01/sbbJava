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
         /* TODO : Ask why this wont work(possibly bc of the initGameFigurines list
             but ask for a different way to be able to keep the list,
             maybe in the fight like when the sword is being used or so no clue yet. */
        }
        return getfV() + getAccuracy();
    }
}