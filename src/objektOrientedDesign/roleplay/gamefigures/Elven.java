package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.weapons.Bow;

public class Elven extends Gamefigurine {
    public Elven(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV(){
        double mFV = super.getfV() + (getmV() / 2);
        if(getWeapon().getClass().equals(Bow.class)){
            double bowFV = mFV + (super.getfV() / 2 );
            return bowFV;
        }
        return mFV;
    }

}