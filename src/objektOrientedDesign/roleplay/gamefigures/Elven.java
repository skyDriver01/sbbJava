package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;
import objektOrientedDesign.roleplay.items.Armor;
import objektOrientedDesign.roleplay.items.HeavyArmor;
import objektOrientedDesign.roleplay.items.LightArmor;
import objektOrientedDesign.roleplay.weapons.Bow;

import static objektOrientedDesign.roleplay.TextStuff.ANSI_RED;
import static objektOrientedDesign.roleplay.TextStuff.ANSI_RESET;

public class Elven extends Gamefigurine {
    public Elven(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        double mFV = super.getfV() + (getmV() / 2);
        if(getWeapon() != null) {
            if(getWeapon().getClass().equals(Bow.class)) {
                double bowFV = mFV + (super.getfV() / 2);
                return bowFV;
            }
        }
        return mFV;
    }

    @Override
    public void setArmor(Armor armor) {
        if(armor.getClass().equals(LightArmor.class)) {
            super.setArmor(armor);
        } else {
            if(armor.getClass().equals(HeavyArmor.class)) {
                System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Heavy Armor" + ANSI_RESET);
                Log.addMessage(initGameFigurines().get(1).getName() + "tried to equip armor that he cant wear");
            }
        }
    }
}