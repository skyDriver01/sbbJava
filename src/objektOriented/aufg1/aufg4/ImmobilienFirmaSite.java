package objektOriented.aufg1.aufg4;

import objektOriented.aufg1.aufg2.InputIn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmobilienFirmaSite {
    static List<Apartment> apartment;

    public void output() throws InterruptedException {
        property ();
        initApartment ();
        firm ();
        boolean questions = true;
        while (questions) {
            options ();
            questions = switchCases (true);
        }
    }

    private static boolean switchCases(boolean questions) throws InterruptedException {
        int choice = Integer.parseInt (InputIn.nextLine ());
        switch (choice) {
            case 1 -> {
                System.out.println ("There are " + apartment.size () + " apartments overall");
                Thread.sleep (1500); //Damit es nicht direkt wieder die Optionen anzeigt und man die anzahl sieht ohne hoch zu scrollen
            }

            case 2 -> giveOutJanitor ();

            case 3 -> fullContract (); //todo specific property contract

            //  case 4 -> //Todo all expire conts in month

            //  case 5 -> //todo contracts sorted by peeps

            //  case 6 ->   //todo monthly gross income from props

            //  case 7 ->   //todo yearly gross income of firm

            case 8 -> questions = false;
        }
        return questions;
    }

    private static void giveOutJanitor() throws InterruptedException {
        property ().stream ().forEach (a -> System.out.println (a.getAddress ()));
        String input = InputIn.nextLineOut ("Type the address of the Property that you want to get the janitor from.");
        property ().stream ().filter (property -> property.getAddress ().equals (input)).toList ().stream ().forEach (a -> System.out.println ("The Janitor of this Property is: " + a.getJanitor ()));
        Thread.sleep (1250); //fragen was Thread ist.
    }

    public static void options() {
        System.out.println ("-----------------------------------------------------------------------");
        System.out.println ("Hello, What would you like to do?");
        System.out.println ("1: See the total number of apartments from all properties together");
        System.out.println ("2: Find out who the janitor is for a specific property");
        System.out.println ("3: Show all Contracts from a specific property");
        System.out.println ("4: Show all Contracts that will expire next month");
        System.out.println ("5: Show all Contracts sorted by People");
        System.out.println ("6: See the monthly gross income per property");
        System.out.println ("7: See the yearly gross income from the Firm");
        System.out.println ("8: Exit");
        System.out.println ("-----------------------------------------------------------------------");
        System.out.println ("[Type in the number of the Task that you want to do.]");
    }

    public static List<Property> property() {
        List<Property> propertyList = new ArrayList<> ();
        propertyList.add (new Property ("Luka Nikolic", "Rahul Gurung", "Jamie Bläsi", "Kornweg71"));
        propertyList.add (new Property ("Yanir Gopal", "Neil Ramseier", "Sven Schmid", "Ensingerstrasse36"));
        return propertyList;
    }

    public static void initApartment() {
        List<Apartment> apartmentList = new ArrayList<> ();
        //Apartments for the first Property \/
        apartmentList.add (new Apartment ("Kornweg71", 1, 11, "1'900Fr.", "3 Room apartment with a good earthy feel to it", new Contract (new Date (2022, 12, 24), new Tenant ("Nick Bracher", "Male", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Kornweg71", 1, 12, "1'900Fr.", "3 Room apartment with a good earthy feel to it", new Contract (null, new Tenant (null, null, null))));
        apartmentList.add (new Apartment ("Kornweg71", 1, 13, "1'900Fr.", "3 Room apartment with a good earthy feel to it", new Contract (new Date (2022, 12, 24), new Tenant ("Yanir Gopal", "Diverse", new Date (2006, 9, 25)))));
        apartmentList.add (new Apartment ("Kornweg71", 1, 13, "1'900Fr.", "3 Room apartment with a good earthy feel to it", new Contract (null, new Tenant (null, null, null))));
        apartmentList.add (new Apartment ("Kornweg71", 2, 21, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", new Contract (new Date (2022, 12, 24), new Tenant ("Andrin Gurtner", "Male", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Kornweg71", 2, 22, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", new Contract (new Date (2022, 12, 24), new Tenant ("Sven Schmid", "Diverse", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Kornweg71", 2, 23, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", new Contract (new Date (2022, 12, 24), new Tenant ("Shirvan Yacoub", "Male", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Kornweg71", 2, 24, "1'600Fr.", "1, 1/2 Room apartment not very suitable to live in if you aren't used to small spaces (NO BALCONY)", new Contract (null, new Tenant (null, null, null))));
        //-------------------------------------------------------------------------------------------------------------------Apartments for the second Property \/--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        apartmentList.add (new Apartment ("Ensingerstrasse36", 1, 11, "2'000Fr.", "3, 1/2 Room apartment with a nice small terrace", new Contract (new Date (2022, 12, 24), new Tenant ("Jannik Pulfer", "Diverse", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 1, 12, "2'000Fr.", "3, 1/2 Room apartment with a nice small terrace", new Contract (new Date (2022, 12, 24), new Tenant ("Manuel Möri", "Male", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 1, 13, "2'000Fr.", "3, 1/2 Room apartment with a nice small terrace", new Contract (null, new Tenant (null, null, null))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 2, 23, "2'250Fr.", "4, 1/2 Room apartment with a nice cozy feeling", new Contract (new Date (2022, 12, 24), new Tenant ("Jessica Bracher", "Female", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 2, 21, "2'250Fr.", "4, 1/2 Room apartment with a nice cozy feeling", new Contract (new Date (2022, 12, 24), new Tenant ("Kristina Milenkovic", "Female", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 2, 22, "2'250Fr.", "4, 1/2 Room apartment with a nice cozy feeling", new Contract (new Date (2022, 12, 24), new Tenant ("Hans Ueli", "Male", new Date (2007, 8, 13)))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 3, 31, "2'750Fr.", "6 Room apartment with big balcony and nice View", new Contract (null, new Tenant (null, null, null))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 3, 32, "2'750Fr.", "6 Room apartment with big balcony and nice View", new Contract (null, new Tenant (null, null, null))));
        apartmentList.add (new Apartment ("Ensingerstrasse36", 3, 33, "2'750Fr.", "6 Room apartment with big balcony and nice View", new Contract (new Date (2022, 12, 24), new Tenant ("Luka Nikolic", "Male", new Date (2007, 8, 13)))));
        apartment = apartmentList;
    }

    public static void contract() {
        property ();
    }

    public static void firm() {
        contract ();
        List<Immobilienfirma> tempList = new ArrayList<> ();
        //Stream<Immobilienfirma> temp = tempList.stream();
        tempList.add (new Immobilienfirma ("Index 0 out of bounds", "No Entry"));
    }

    public static void fullContract() {
        System.out.println ("From what property do you want to see the Contracts");
        property ().stream ().forEach (a -> System.out.println (a.getAddress ()));
        Contract.getPropertyContract chooseProperty = switch (InputIn.nextLine ().toUpperCase ()) {
            case "KORNWEG71" -> {
                kornwegContracts ();
                {
                    yield Contract.getPropertyContract.KORNWEG71;
                }
            }
            case "ENSINGERSTRASSE36" -> {
                ensingerContracts ();
                {
                    yield Contract.getPropertyContract.ENSINGERSTRASSE36;
                }
            }
            default -> null;
        };
    }

    private static Contract.getKornwegApartments kornwegContracts() {

        System.out.println ("Do you want to see the Contract for Firstfloor Apartments or from the SecondFloor Apartments?");
        System.out.println ("Type firstfloor or secondfloor");
        Contract.getKornwegApartments kornwegApartments = switch (InputIn.nextLine ().toUpperCase ()) {
            case "FIRSTFLOOR" -> {
                apartment.stream ().forEach (a -> {
                    if (a.getFloor () == 1 && a.getAddress ().equals ("Kornweg71")) {
                        System.out.println ("The Price per month: " + a.monthlyPrice + " The Owner of this apartment: " + a.getContract ().getTenant ().getTenant () + ", This Person defines themself as: " + a.getContract ().getTenant ().getGender () + ", This Contract expires on this date: " + a.getContract ().getExperationDate () ); //TODO wenn a.getContract eingeschrieben wird gibt es mir den Code für seinen speicherort ab. machen das ich auf die Daten wie Tenant und experation Date zugreifen kann. wenn möglich ohne 2te liste

                    }
                });
                //apartment.stream ().forEach (a -> System.out.println (a.getPrice ())); //TODO rn it prints only 2750Fr/ make it print the value of that buildings floor
                yield Contract.getKornwegApartments.FIRSTFLOOR;
            }
            case "SECONDFLOOR" -> {
                apartment.stream ().forEach (a -> {
                    if (a.getFloor () == 2 && a.getAddress ().equals ("Kornweg71")) {
                        //        System.out.println ("The Price" + a.getPrice () + " This room is Owned by(If Vacant its not owned yet): " + a.getTenant () + ", The HouseNumber:  " + a.getHouseNumber () + ", Its Description " + a.getDescription ());

                    }
                });
                yield Contract.getKornwegApartments.SECONDFLOOR;
            }
            default -> null;
        };
        return kornwegApartments;
    }

    private static Contract.getEnsingerApartments ensingerContracts() {
        System.out.println ("Do you want to see the Contract for Firstfloor Apartments or from the SecondFloor Apartments or from the ThirdFloor Apartments?");
        System.out.println ("Type firstfloor, secondfloor or thirdfloor");
        Contract.getEnsingerApartments ensingerApartments = switch (InputIn.nextLine ().toUpperCase ()) {
            case "FIRSTFLOOR" -> {
                apartment.stream ().forEach (a -> {
                    if (a.getFloor () == 1 && a.getAddress ().equals ("Ensingerstrasse36")) {
                        //    System.out.println ("The Price" + a.getPrice () + " This room is Owned by(If Vacant its not owned yet): " + a.getTenant () + ", The HouseNumber:  " + a.getHouseNumber () + ", Its Description " + a.getDescription ());

                    }
                });
                yield Contract.getEnsingerApartments.FIRSTFLOOR;
            }
            case "SECONDFLOOR" -> {
                apartment.stream ().forEach (a -> {
                    if (a.getFloor () == 2 && a.getAddress ().equals ("Ensingerstrasse36")) {               //TODO alle contract infos anzeigen und auch die getPrice zu getMonthlyPrice ändern sonst passt es nicht mit der Variabel
                        //   System.out.println ("The Price" + a.getPrice () + " This room is Owned by(If Vacant its not owned yet): " + a.getTenant () + ", The HouseNumber:  " + a.getHouseNumber () + ", Its Description " + a.getDescription ());

                    }
                });
                yield Contract.getEnsingerApartments.SECONDFLOOR;
            }
            case "THIRDFLOOR" -> {
                apartment.stream ().forEach (a -> {
                    if (a.getFloor () == 3 && a.getAddress ().equals ("Ensingerstrasse36")) {
                        //   System.out.println ("The Price" + a.getPrice () + " This room is Owned by(If Vacant its not owned yet): " + a.getTenant () + ", The HouseNumber:  " + a.getHouseNumber () + ", Its Description " + a.getDescription ());

                    }
                });
                yield Contract.getEnsingerApartments.THIRDFLOOR;
            }
            default -> null;
        };
        return ensingerApartments;
    }
}