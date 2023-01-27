package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;
import objektOrientedDesign.roleplay.items.Armor;
import objektOrientedDesign.roleplay.items.HeavyArmor;
import objektOrientedDesign.roleplay.items.LightArmor;
import objektOrientedDesign.roleplay.weapons.Scythe;

import static objektOrientedDesign.roleplay.TextStuff.ANSI_RED;
import static objektOrientedDesign.roleplay.TextStuff.ANSI_RESET;

public class SCP_049 extends Gamefigurine {
    private double instantDeath;

    public SCP_049(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                   double evasion, double instantDeath) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.instantDeath = instantDeath;
    }

    @Override
    public double getInstantDeath() {
        if(getWeapon() != null) {
            if(getWeapon() instanceof Scythe) {
                return setInstantDeath(0.02);
            }
        }

        return instantDeath;
    }

    @Override
    public double setInstantDeath(double instantDeath) {
        this.instantDeath = instantDeath;
        return instantDeath;
    }

    @Override
    public void setArmor(Armor armor) {
        if(armor instanceof LightArmor) {
            System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Light Armor" + ANSI_RESET);
            Log.addMessage(initGameFigurines().get(4).getName() + "tried to equip armor that he cant wear");
        }
        if(armor instanceof HeavyArmor) {
            System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Heavy Armor" + ANSI_RESET);
            Log.addMessage(initGameFigurines().get(4).getName() + "tried to equip armor that he cant wear");
        }
    }
}
/**
 * SCP_049 is the Plague Doctor that can kill by touch
 * to balance this out the chance of this happeniing during the game if he is chosen is 1%.
 */