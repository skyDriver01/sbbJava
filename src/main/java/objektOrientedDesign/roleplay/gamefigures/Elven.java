package objektOrientedDesign.roleplay.gamefigures;

import main.java.objektOrientedDesign.roleplay.Log;
import main.java.objektOrientedDesign.roleplay.items.Armor;
import main.java.objektOrientedDesign.roleplay.items.HeavyArmor;
import main.java.objektOrientedDesign.roleplay.items.LightArmor;
import main.java.objektOrientedDesign.roleplay.weapons.Bow;

import static main.java.objektOrientedDesign.roleplay.TextStuff.ANSI_RED;
import static main.java.objektOrientedDesign.roleplay.TextStuff.ANSI_RESET;

public class Elven extends Gamefigurine {
    public Elven(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        double mFV = super.getfV() + (getmV() / 2);
        if(getWeapon() != null) {
            if(getWeapon() instanceof Bow) {
                double bowFV = mFV + (super.getfV() / 2);
                return bowFV;
            }
        }
        return mFV;
    }

    @Override
    public void setArmor(Armor armor) {
        if(armor instanceof LightArmor) {
            super.setArmor(armor);
        } else {
            if(armor instanceof HeavyArmor) {
                System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Heavy Armor" + ANSI_RESET);
                Log.addMessage(initGameFigurines().get(1).getName() + "tried to equip armor that he cant wear");
            }
        }
    }
}