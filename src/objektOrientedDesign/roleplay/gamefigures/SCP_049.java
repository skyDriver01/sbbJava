package objektOrientedDesign.roleplay.gamefigures;

public class SCP_049 extends Gamefigurine {
    private double instantDeath;
    private double regeneration;

    public SCP_049(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                   double evasion,
                   double instantDeath, double regeneration) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.instantDeath = instantDeath;
        this.regeneration = regeneration;
    }

    public double getInstantDeath() {
        if(getWeapon().getWeapon().equals("Scythe")){
            setInstantDeath(0.02);
        }
        return getInstantDeath();
    }

    public void setInstantDeath(double instantDeath) {
        this.instantDeath = instantDeath;
    }

    public double getRegeneration() {
        return regeneration;
    }

    public void setRegeneration(double regeneration) {
        this.regeneration = regeneration;
    }
}
/*
// SCP_049 is the Plague Doctor that can kill by touch
 to balance this out the chance of this happeniing during the game if he is chosen is 1%.
 And because he is a Doctor he can heal himself without the use of Potions but that health
 he gets by regeneration is not alot and will not happen often maybe make it like a 15% chance.
 */