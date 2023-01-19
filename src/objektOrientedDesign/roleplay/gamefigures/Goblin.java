package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.weapons.Bow;

public class Goblin extends Gamefigurine {
    public Goblin(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                  double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        if(getWeapon().getClass().equals(Bow.class)) {
            double bowFV = super.getfV() + (super.getfV() / 2);
            return bowFV;
        } else {
            return super.getfV();
        }
    }
}