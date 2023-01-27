package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;
import objektOrientedDesign.roleplay.items.Armor;
import objektOrientedDesign.roleplay.items.HeavyArmor;
import objektOrientedDesign.roleplay.items.LightArmor;
import objektOrientedDesign.roleplay.weapons.Club;

import static objektOrientedDesign.roleplay.TextStuff.ANSI_RED;
import static objektOrientedDesign.roleplay.TextStuff.ANSI_RESET;

public class Troll extends Gamefigurine {

    public Troll(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        if(getWeapon() != null) {
            if(getWeapon().getClass().equals(Club.class)) {
                return super.getfV() * 2;
            }
        }
        return super.getfV();
    }
    @Override
    public void setArmor(Armor armor) {
        if(armor.getClass().equals(LightArmor.class)) {
            System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Light Armor" + ANSI_RESET);
            Log.addMessage(initGameFigurines().get(5).getName() + "tried to equip armor that he cant wear");
        }
        if(armor.getClass().equals(HeavyArmor.class)) {
            System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Heavy Armor" + ANSI_RESET);
            Log.addMessage(initGameFigurines().get(5).getName() + "tried to equip armor that he cant wear");
        }
    }
}