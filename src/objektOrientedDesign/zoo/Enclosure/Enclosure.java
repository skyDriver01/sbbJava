package objektOrientedDesign.zoo.Enclosure;

public class Enclosure {
    int enclosureNumber;
    double surfaceArea;
    int fenceHeight;
    int capacity;
    double humidity;
    double temperature;
    boolean moat;

    public Enclosure(int enclosureNumber, double surfaceArea, int fenceHeight, int capacity, double humidity,
                     double temperature, boolean moat) {
        this.enclosureNumber = enclosureNumber;
        this.surfaceArea = surfaceArea;
        this.fenceHeight = fenceHeight;
        this.capacity = capacity;
        this.humidity = humidity;
        this.temperature = temperature;
        this.moat = moat;
    }

    public int getEnclosureNumber() {
        return enclosureNumber;
    }

    public void setEnclosureNumber(int enclosureNumber) {
        this.enclosureNumber = enclosureNumber;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getFenceHeight() {
        return fenceHeight;
    }

    public void setFenceHeight(int fenceHeight) {
        this.fenceHeight = fenceHeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isMoat() {
        return moat;
    }

    public void setMoat(boolean moat) {
        this.moat = moat;
    }
}