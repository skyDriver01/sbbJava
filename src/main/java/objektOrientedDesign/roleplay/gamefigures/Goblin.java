package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;
import objektOrientedDesign.roleplay.items.Armor;
import objektOrientedDesign.roleplay.items.HeavyArmor;
import objektOrientedDesign.roleplay.items.LightArmor;
import objektOrientedDesign.roleplay.weapons.Bow;

import static objektOrientedDesign.roleplay.TextStuff.ANSI_RED;
import static objektOrientedDesign.roleplay.TextStuff.ANSI_RESET;

public class Goblin extends Gamefigurine {
    public Goblin(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                  double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        if(getWeapon() != null) {
            if(getWeapon() instanceof Bow) {
                double bowFV = super.getfV() + (super.getfV() / 2);
                return bowFV;
            }
        }
        return super.getfV();
    }

    @Override
    public void setArmor(Armor armor) {
        if(armor instanceof LightArmor) {
            super.setArmor(armor);
        } else {
            if(armor instanceof HeavyArmor) {
                System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Heavy Armor" + ANSI_RESET);
                Log.addMessage(initGameFigurines().get(6).getName() + "tried to equip armor that he cant wear");
                super.setArmor(null);
            }
        }
    }
}