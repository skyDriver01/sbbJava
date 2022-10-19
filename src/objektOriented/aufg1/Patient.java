package objektOriented.aufg1;

public class Patient {
    private String name;
    private int age;
    private float height;
    private float weight;
    private float temperature;
    private boolean vaccinated;
    private static Patient[] array = new Patient[100];
    private int ID;
    private static int anzahl;

    private String name() {
        return null;
    }

    private int age() {
        return 0;
    }

    private float height() {
        return 0;
    }

    private float weight() {
        return 0;
    }

    private float temperature() {
        return 0;
    }

    private boolean isVaccinated() {
        return isVaccinated();
    }

    public Patient(String name, int age, float height, float weight, float temperature, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.vaccinated = isVaccinated;
        this.ID = anzahl++;
        array[ID] = this;
    }

    public static Patient giveMeTheInformation(String name) {
        for (Patient patient : array) {
            if (patient != null && patient.name.equals(name)) {
                return patient;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float getTemperature() {
        return temperature;
    }

    public boolean vaccinated() {
        return vaccinated;
    }

    @Override
    public String toString() {
        return "Patient{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + ", weight=" + weight + ", temperature=" + temperature + ", vaccinated=" + vaccinated + ", ID=" + ID + '}';
    }
}
