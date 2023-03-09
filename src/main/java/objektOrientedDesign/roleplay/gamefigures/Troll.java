package main.java.objektOrientedDesign.roleplay.gamefigures;

import main.java.objektOrientedDesign.roleplay.Log;
import main.java.objektOrientedDesign.roleplay.items.Armor;
import main.java.objektOrientedDesign.roleplay.items.HeavyArmor;
import main.java.objektOrientedDesign.roleplay.items.LightArmor;
import main.java.objektOrientedDesign.roleplay.weapons.Club;

import static main.java.objektOrientedDesign.roleplay.TextStuff.ANSI_RED;
import static main.java.objektOrientedDesign.roleplay.TextStuff.ANSI_RESET;

public class Troll extends Gamefigurine {

    public Troll(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
    }

    @Override
    public double getfV() {
        if(getWeapon() != null) {
            if(getWeapon() instanceof Club) {
                return super.getfV() * 2;
            }
        }
        return super.getfV();
    }
    @Override
    public void setArmor(Armor armor) {
        if(armor instanceof LightArmor) {
            System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Light Armor" + ANSI_RESET);
            Log.addMessage(initGameFigurines().get(5).getName() + "tried to equip armor that he cant wear");
        }
        if(armor instanceof HeavyArmor) {
            System.out.println(ANSI_RED + "The Character you have Chosen is not fit to equip Heavy Armor" + ANSI_RESET);
            Log.addMessage(initGameFigurines().get(5).getName() + "tried to equip armor that he cant wear");
        }
    }
}