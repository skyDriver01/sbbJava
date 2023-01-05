package objektOrientedDesign.Roleplay.GameFigures;

public class Elven extends Gamefigurine{
    double mV;   //MV is Magic Value

    public Elven(String name, double lP, double cC, double fV, double res, double speed, double accuracy,
                 double evasion,
                 double mV) {
        super(name, lP, cC, fV, res, speed, accuracy, evasion);
        this.mV = mV;
    }

    public double getmV() {
        return mV;
    }

    public void setmV(double mV) {
        this.mV = mV;
    }
}