package objektOriented.aufg1.aufg4;

import java.util.Date;

public class Contract {

    private Date experationDate;
    private Tenant tenant;

    public Contract(Date experationDate, Tenant tenant) {
        this.experationDate = experationDate;
        this.tenant = tenant;
    }

    public enum getPropertyContract {KORNWEG71, ENSINGERSTRASSE36}

    public enum getKornwegApartments {FIRSTFLOOR, SECONDFLOOR}

    public enum getEnsingerApartments {FIRSTFLOOR, SECONDFLOOR, THIRDFLOOR}

    public void setExperationDate(Date experationDate) {
        this.experationDate = experationDate;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Date getExperationDate() {
        return experationDate;
    }
}