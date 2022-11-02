package objektOriented.aufg1.aufg4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

//TODO GIVE OUT TOTAL NUMBER OF APARTMENTS OF ALL PROPERTIES.
//TODO GIVE OUT THE JANITOR OF A SPECIFIC PROPERTY
//TODO GIVE OUT THE CONTRACTS OF A SPECIFIC PROPERTY
//TODO GIVE OUT THE EMPTY APARTMENTS IN A SPECIFIC PROPERTY
//TODO GIVE OUT THE CONTRACTS THAT WILL EXPIRE NEXT MONTH
//TODO GIVE OUT ALL CONTRACTS SORTED BY PEOPLE(1 PERSON CAN HAVE MORE APARTMENTS THAN ONE)
//TODO GIVE OUT THE MONTHLY GROSS INCOME PER PROPERTY
//TODO GIVE OUT THE YEARLY GROSS INCOME OF THE FIRM (CONTRACTS CAN EXPIRE WITHIN THE YEAR)
public class ImmobilienfirmaDemo {
    public static void main(String[] args) {
        output();
    }

    public static void output() {
        Scanner scanner = new Scanner(System.in);
        apartment();
        property();
        firm();
        options();
        boolean exit = true;
        while (exit){

        }
    }
public static void options(){
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("Hello, What would you like to do?");
    System.out.println("1: See the total number of apartments from all properties together");
    System.out.println("2: Find out who the janitor is for a specific property");
    System.out.println("3: Show all Contracts from a specific property");
    System.out.println("4: Show all Contracts that will expire next month");
    System.out.println("5: Show all Contracts sorted by People");
    System.out.println("6: See the monthly gross income per property");
    System.out.println("7: See the yearly gross income from the Firm");
    System.out.println("8: Exit");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("Select what you would like to do with typing the Number in.");
}
    public static List<Property> property() {
        List<Property> propertyList = new ArrayList<>();
        propertyList.add(new Property("Luka Nikolic", "Rahul Gurung", "Jamie Bläsi", "Kornweg 71"));
        propertyList.add(new Property("Yanir Gopal", "Neil Ramseier", "Sven Schmid", "Ensingerstrasse 36"));
        return propertyList;
    }

    public static List<Apartment> apartment() {
        List<Apartment> apartmentList = new ArrayList<>();
        //Apartments for the first Property \/
        apartmentList.add(new Apartment("Kornweg 71", 1, 11, "1'900Fr.", "3 Room apartment with a good earthy feel to it", "Shervan Yacoub"));
        apartmentList.add(new Apartment("Kornweg 71", 1, 12, "1'900Fr.", "3 Room apartment with a good earthy feel to it", "Tobias Merino"));
        apartmentList.add(new Apartment("Kornweg 71", 1, 13, "1'900Fr.", "3 Room apartment with a good earthy feel to it", "Nick Bracher"));
        apartmentList.add(new Apartment("Kornweg 71", 1, 13, "1'900Fr.", "3 Room apartment with a good earthy feel to it", ""));
        apartmentList.add(new Apartment("Kornweg 71", 2, 21, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", "Yanick Minder"));
        apartmentList.add(new Apartment("Kornweg 71", 2, 22, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", "Manuel Möri"));
        apartmentList.add(new Apartment("Kornweg 71", 2, 23, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", "Jannik Pulfer"));
        apartmentList.add(new Apartment("Kornweg 71", 2, 24, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", ""));
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Apartments for the second Property \/
        apartmentList.add(new Apartment("Ensingerstrasse 36", 1, 11, "2'000Fr.", "3, 1/2 Room apartment with a nice small terrace", "Tobias Merino"));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 1, 12, "2'000Fr.", "3, 1/2 Room apartment with a nice small terrace", "Michael Widmer"));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 1, 13, "2'000Fr.", "3, 1/2 Room apartment with a nice small terrace", ""));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 2, 23, "2'250Fr.", "4, 1/2 Room apartment with a nice cozy feeling", ""));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 2, 21, "2'250Fr.", "4, 1/2 Room apartment with a nice cozy feeling", "Michael Widmer"));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 2, 22, "2'250Fr.", "4, 1/2 Room apartment with a nice cozy feeling", "Arthur Deierlein"));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 3, 31, "2'750Fr.", "6 Room apartment with big balcony and nice View", "Andrin Gurtner"));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 3, 32, "2'750Fr.", "6 Room apartment with big balcony and nice View", "Lars Ruch"));
        apartmentList.add(new Apartment("Ensingerstrasse 36", 3, 33, "2'750Fr.", "6 Room apartment with big balcony and nice View", "Nick Bracher"));
        return apartmentList;
    }

    public static void contract() {
        property();
    }

    public static void firm() {
        contract();
        List<Immobilienfirma> tempList = new ArrayList<>();
        Stream<Immobilienfirma> temp = tempList.stream();
        tempList.add(new Immobilienfirma("Index 0 out of bounds", "No Entry"));
    }
}