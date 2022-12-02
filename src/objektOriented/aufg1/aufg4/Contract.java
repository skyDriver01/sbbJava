package objektOriented.aufg1.aufg4;

public class Contract {
    private int contractBeginning;
    private int contractEnd;
    private String monthlyPayment;
    private String gender;
    private getPropertyContract address = getPropertyContract.valueOf(Apartment.address);
    private int birthDate;

    public enum getPropertyContract {
        KORNWEG71, Ensingerstrasse36
    }

    public enum getApartment {
        KF1, KF2, EF1, EF2, EF3            //KF für Kornweg Floor 1 odr 2/ EF für Ensingerstrasse Floor 1, 2 odr 3
    }

    public Contract(int contractBeginning, int contractEnd, String monthlyPayment, String gender, int birthDate) {
        this.contractBeginning = contractBeginning;
        this.contractEnd = contractEnd;
        this.monthlyPayment = monthlyPayment;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public int getContractBeginning() {
        return contractBeginning;
    }

    public int getContractEnd() {
        return contractEnd;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthDate() {
        return birthDate;
    }
}
