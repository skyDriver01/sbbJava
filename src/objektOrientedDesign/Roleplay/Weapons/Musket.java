package objektOrientedDesign.Roleplay.Weapons;

public class Musket extends LongRange{
    private boolean reload;     // Make it so after the Person with the Musket attacks the next turn he cant attack to reload but he can use items

    public Musket(double weight, double fV, double accuracy, boolean reload) {
        super(weight, fV, accuracy);
        this.reload = reload;
    }

    public boolean isReload() {
        return reload;
    }

    public void setReload(boolean reload) {
        this.reload = reload;
    }
}
