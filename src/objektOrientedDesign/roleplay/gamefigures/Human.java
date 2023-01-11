package objektOrientedDesign.roleplay.gamefigures;

public class Human extends Gamefigurine{
    public Human(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }
    @Override
    public double getfV() {
        if(getWeapon().getWeapon().equals("Musket")){
            setfV(getfV() + (getfV() * 0.4) + getWeapon().getfV());
        } else if(getWeapon().getWeapon().equals("Sword")){
            setfV(getfV() + (getfV() * 0.2) + getWeapon().getfV());
        }
        return getfV();
    }
}