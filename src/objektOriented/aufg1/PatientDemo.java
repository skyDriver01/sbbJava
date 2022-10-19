package objektOriented.aufg1;

import java.util.Scanner;

public class PatientDemo {
    public static void main(String[] args) {
        Scanner getFirstpatient = new Scanner(System.in);
        System.out.println("Whats your name");
        String name = getFirstpatient.nextLine();
        System.out.println("Your age?");
        int age = Integer.parseInt(getFirstpatient.nextLine());
        System.out.println("Your height?");
        float height = Float.parseFloat(getFirstpatient.nextLine());
        System.out.println("Your weight?");
        float weight = Float.parseFloat(getFirstpatient.nextLine());
        System.out.println("Your temperature");
        float temperature = Float.parseFloat(getFirstpatient.nextLine());
        System.out.println("Are you vaccinated?(true or false)");
        boolean isVaccinated = Boolean.parseBoolean(getFirstpatient.nextLine());
        new Patient(name, age, height, weight, temperature, isVaccinated);
        System.out.println("Enter the patients name that you want information from");
        System.out.println(Patient.giveMeTheInformation(getFirstpatient.nextLine()).toString());

    }
}