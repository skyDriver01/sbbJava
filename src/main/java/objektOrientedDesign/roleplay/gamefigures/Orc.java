package objektOrientedDesign.roleplay.gamefigures;

import objektOrientedDesign.roleplay.Log;

public class Orc extends Gamefigurine {
    private boolean rage;
    private double startHealth;

    public Orc(String name, double lP, double cC, double fV, double res, double speed, double accuracy, double evasion,
               boolean rage, double remainingHealth) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.rage = rage;
        this.startHealth = remainingHealth;
    }

    public boolean isRage() {
        return rage;
    }

    private void checkForRage() {
        if(!rage && super.getlP() < this.startHealth / 4) {
            super.setRes(super.getRes() * 2);
            rage = true;
        }
    }

    @Override
    public double getfV() {
        checkForRage();
        if(rage) {
            Log.addMessage(getName() + " Was enraged");
            return super.getfV() * 3;
        }
        return super.getfV();
    }



    public void setRage(boolean rage) {
        this.rage = rage;
    }

    public double getStartHealth() {
        return startHealth;
    }

    public void setStartHealth(double startHealth) {
        this.startHealth = startHealth;
    }
}