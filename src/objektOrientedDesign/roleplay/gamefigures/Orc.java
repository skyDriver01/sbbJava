package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;

public class Orc extends Gamefigurine {
    private boolean rage;

    public Orc(String name, double lP, double cC, double fV, double res, double speed, double accuracy, double evasion,
               boolean rage) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.rage = rage;
    }

    public double isRage() {
        if(getClass().equals(Orc.class)) {
            if(super.getlP() == super.getlP() / 4) {
                double rageFV = super.getfV() * 3;
                double rageRes = super.getRes() + (super.getRes() / 2);
                Log.addMessage(getName() + " Was enraged");
                return rageFV + rageRes;
            }
        }
        return super.getfV() + super.getRes();
    }

    public void setRage(boolean rage) {
        this.rage = rage;
    }
}