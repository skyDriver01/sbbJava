package objektOriented.aufg1.aufg4;

import java.time.Duration;

public class Contract {
    private Duration experationDate;

    public enum getPropertyContract {KORNWEG71, ENSINGERSTRASSE36}

    public enum getKornwegApartments {FIRSTFLOOR, SECONDFLOOR}

    public enum getEnsingerApartments {FIRSTFLOOR, SECONDFLOOR, THIRDFLOOR}

    public Contract(Duration experationDate) {
        this.experationDate = experationDate;
    }

    public Duration getExperationDate() {
        return experationDate;
    }
}