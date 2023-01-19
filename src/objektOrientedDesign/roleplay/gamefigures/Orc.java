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
                super.setfV(super.getfV() * 3);
                super.setRes(getRes() + super.getRes() / 2);
                Log.addMessage(getName() + " Was enraged");
            }
        }
        return super.getfV() + super.getRes();
    }

    public void setRage(boolean rage) {
        this.rage = rage;
    }
}