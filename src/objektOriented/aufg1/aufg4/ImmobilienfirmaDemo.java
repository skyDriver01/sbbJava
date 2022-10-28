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
    }
    public static void output(){
        firm();
        property();
        contract();
    }
    public static void property(){
        List<Property> propertyList = new ArrayList<>();
        propertyList.add(new Property("","","",""));
        propertyList.add(new Property("","","",""));
    }
    public static void apartment(){
        List<Apartment> apartmentList = new ArrayList<>();
        //Apartments for the first Property \/
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
    //-------------------------------------------------------------------------------------------------------
        //Apartments for the second Property \/
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
        apartmentList.add(new Apartment("",0,01,"","",""));
    }
    public static void contract(){
    }
    public static void firm() {
        List<Immobilienfirma> tempList = new ArrayList<>();
        Stream<Immobilienfirma> temp = tempList.stream();
        tempList.add(new Immobilienfirma("Index 0 out of bounds", "No Entry"));

    }
}