package objektOriented.aufg1.aufg4;

import java.util.Date;

public class Tenant {
    private String tenant;
    private String gender;
    private Date birthDate;

    public Tenant(String tenant, String gender, Date birthDate) {
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

    public Date getBirthDate() {
        return birthDate;
    }
}