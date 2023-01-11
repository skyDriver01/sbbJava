package objektOrientedDesign.roleplay.gamefigures;

public class Goblin extends Gamefigurine {
    public Goblin(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                  double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }
    @Override
    public double getfV() {
        if(getWeapon().getWeapon().equals("Bow")){
            setfV(getfV() + (getfV() / 2) + getWeapon().getfV());
        } else  if(getWeapon().getWeapon().equals("Throwing Knives")){
            getWeapon().setAmount(6);
            return getWeapon().getAmount();
        }
        return getfV();
    }
}