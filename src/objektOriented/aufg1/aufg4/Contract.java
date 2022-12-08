package objektOriented.aufg1.aufg4;

import java.util.Calendar;

public class Contract {

    private Calendar experationDate;
    private Tenant tenant;

    public Contract(Calendar experationDate, Tenant tenant) {
        this.experationDate = experationDate;
        this.tenant = tenant;
    }

    public enum getPropertyContract {KORNWEG71, ENSINGERSTRASSE36}

    public enum getKornwegApartments {FIRSTFLOOR, SECONDFLOOR}

    public enum getEnsingerApartments {FIRSTFLOOR, SECONDFLOOR, THIRDFLOOR}

    public void setExperationDate(Calendar experationDate) {
        this.experationDate = experationDate;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Calendar getExperationDate() {
        return experationDate;
    }
}