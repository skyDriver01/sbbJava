package objektOriented.aufg1.aufg4;

public class Tenant {
    private String tenant;
    private String gender;
    private int birthDate;

    public Tenant(String tenant, String gender, int birthDate) {
        this.tenant = tenant;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getTenant() {
        return tenant;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthDate() {
        return birthDate;
    }
}