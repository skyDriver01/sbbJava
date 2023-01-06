package objektOrientedDesign.roleplay.gamefigures;

public class ToTest extends Gamefigurine{
    private double instantDeath;   //To test the log and the death also the speed stuff + easier and faster to test.

    public ToTest(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                  double evasion,
                  double instantDeath) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.instantDeath = instantDeath;
    }

    public double getInstantDeath() {
        return instantDeath;
    }

    public void setInstantDeath(double instantDeath) {
        this.instantDeath = instantDeath;
    }
}
