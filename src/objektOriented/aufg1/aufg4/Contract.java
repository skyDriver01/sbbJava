package objektOriented.aufg1.aufg4;

public class Contract {
    private int contractBeginning;
    private int contractEnd;
    private String monthlyPayment;
    private String gender;
    private getPropertyContract address = getPropertyContract.valueOf (Apartment.address);
    private int birthDate;

    public enum getPropertyContract {
        KORNWEG71, ENSINGERSTRASSE36
    }
    public enum getKornwegApartments {FIRSTFLOOR, SECONDFLOOR}

    public enum getEnsingerApartments {FIRSTFLOOR, SECONDFLOOR, THIRDFLOOR}


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
