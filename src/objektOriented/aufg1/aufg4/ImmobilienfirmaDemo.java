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
    public static void output(){
        firm();
        contract();
    }
    public static void property(){
        List<Property> propertyList = new ArrayList<>();
        propertyList.add(new Property("Luka Nikolic","Rahul Gurung","Jamie Bläsi","Kornweg 71"));
        propertyList.add(new Property("Yanir Gopal","Neil Ramseier","Sven Schmid","Ensingerstrasse 36"));
        apartment();
    }
    public static void apartment(){
        List<Apartment> apartmentList = new ArrayList<>();
        //Apartments for the first Property \/
        apartmentList.add(new Apartment("Kornweg 71",1,11,"1'900Fr.","3 Room apartment with a good earthy feel to it","Shervan Yacoub"));
        apartmentList.add(new Apartment("Kornweg 71",1,12,"1'900Fr.","3 Room apartment with a good earthy feel to it","Tobias Merino"));
        apartmentList.add(new Apartment("Kornweg 71",1,13,"1'900Fr.","3 Room apartment with a good earthy feel to it","Nick Bracher"));
        apartmentList.add(new Apartment("Kornweg 71",2,21,"1'600Fr.","1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)","Yanick Minder"));
        apartmentList.add(new Apartment("Kornweg 71",2,22,"1'600Fr.","1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)","Manuel Möri"));
        apartmentList.add(new Apartment("Kornweg 71",2,23,"1'600Fr.","1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)","Jannik Pulfer"));
    //-------------------------------------------------------------------------------------------------------
        //Apartments for the second Property \/
        apartmentList.add(new Apartment("Ensingerstrasse 36",1,11,"2'000Fr.","3, 1/2 Room apartment with a nice small terrace","Nihat Yilmazer"));
        apartmentList.add(new Apartment("Ensingerstrasse 36",1,12,"2'000Fr.","3, 1/2 Room apartment with a nice small terrace","Michael Widmer"));
        apartmentList.add(new Apartment("Ensingerstrasse 36",2,21,"2'250Fr.","4, 1/2 Room apartment with a nice cozy feeling","Joshua Scholze"));
        apartmentList.add(new Apartment("Ensingerstrasse 36",2,22,"2'250Fr.","4, 1/2 Room apartment with a nice cozy feeling","Arthur Deierlein"));
        apartmentList.add(new Apartment("Ensingerstrasse 36",3,31,"2'750Fr.","6 Room apartment with big balcony and nice View","Andrin Gurtner"));
        apartmentList.add(new Apartment("Ensingerstrasse 36",3,32,"2'750Fr.","6 Room apartment with big balcony and nice View","Lars Ruch"));
    }
    public static void contract(){
        apartment();
    }
    public static void firm() {
        property();
        List<Immobilienfirma> tempList = new ArrayList<>();
        Stream<Immobilienfirma> temp = tempList.stream();
        tempList.add(new Immobilienfirma("Index 0 out of bounds", "No Entry"));

    }
}