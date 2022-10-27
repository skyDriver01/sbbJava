package objektOriented.aufg1.aufg4;

public class Contract {
    private int ContractBeginning;
    private int ContractEnd;
    private int MonthlyPayment;
    private String Gender;
    private int Birthday;

    public int getContractBeginning() {
        return ContractBeginning;
    }

    public void setContractBeginning(int contractBeginning) {
        ContractBeginning = contractBeginning;
    }

    public int getContractEnd() {
        return ContractEnd;
    }

    public void setContractEnd(int contractEnd) {
        ContractEnd = contractEnd;
    }

    public int getMonthlyPayment() {
        return MonthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        MonthlyPayment = monthlyPayment;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getBirthday() {
        return Birthday;
    }

    public void setBirthday(int birthday) {
        Birthday = birthday;
    }

    public Contract(int contractBeginning, int contractEnd, int monthlyPayment, String gender, int birthday) {
        ContractBeginning = contractBeginning;
        ContractEnd = contractEnd;
        MonthlyPayment = monthlyPayment;
        Gender = gender;
        Birthday = birthday;
    }
}
