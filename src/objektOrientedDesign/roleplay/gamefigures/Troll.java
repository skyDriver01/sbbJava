package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.weapons.Club;

public class Troll extends Gamefigurine {

    public Troll(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        if(getWeapon() != null) {
            if(getWeapon().getClass().equals(Club.class)) {
                return super.setfV(super.getfV() * 2);
            }
        }
        return super.getfV();
    }
}
