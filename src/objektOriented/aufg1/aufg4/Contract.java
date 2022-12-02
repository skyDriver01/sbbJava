package objektOriented.aufg1.aufg4;

import objektOriented.aufg1.aufg2.InputIn;

import static objektOriented.aufg1.aufg4.ImmobilienFirmaSite.property;

public class Contract {
    private int contractBeginning;
    private int contractEnd;
    private String monthlyPayment;
    private String gender;
    private getPropertyContract address = getPropertyContract.valueOf (Apartment.address);
    private int birthDate;

    public enum getPropertyContract {
        KORNWEG71, Ensingerstrasse36
    }

    public enum getKornwegApartments {FIRSTFLOOR, SECONDFLOOR}

    public enum getEnsingerApartments {FIRSTFLOOR, SECONDFLOOR, THIRDFLOOR}

    public static void fullContract() {
        System.out.println ("From what property do you want to see the Contracts");
        property ().stream ().forEach (a -> System.out.println (a.getAddress ()));
        if (InputIn.nextLine ().toUpperCase ().equals (getPropertyContract.KORNWEG71)) {
            kornwegContracts ();
        }

        if (InputIn.nextLine ().toUpperCase ().equals (getPropertyContract.Ensingerstrasse36)) {
            ensingerContracts ();
        } else {
            System.out.println ("Whatever you typed is not valid sorry.");
        }
    }

    private static getEnsingerApartments ensingerContracts() {
        getEnsingerApartments ensingerApartments;
        System.out.println ("Do you want to see the Contract for Firstfloor Apartments or from the SecondFloor Apartments or from the ThirdFloor Apartments?");
        System.out.println ("Type firstfloor, secondfloor or thirdfloor");
        ensingerApartments = switch (InputIn.nextLine ().toUpperCase ()) {
            case "FIRSTFLOOR" ->
            case "SECONDFLOOR" ->
            case "THIRDFLOOR" ->
        }; return ensingerApartments;
    }

    private static getKornwegApartments kornwegContracts() {
        getKornwegApartments kornwegApartments;
        System.out.println ("Do you want to see the Contract for Firstfloor Apartments or from the SecondFloor Apartments?");
        System.out.println ("Type firstfloor or secondfloor");
        kornwegApartments = switch (InputIn.nextLine ().toUpperCase ()) {
            case "FIRSTFLOOR" ->
            case "SECONDFLOOR" ->
        };
        return kornwegApartments;
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
