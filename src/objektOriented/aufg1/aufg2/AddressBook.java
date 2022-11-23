package objektOriented.aufg1.aufg2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static void executeTheSite() {
        Scanner scanner = new Scanner(System.in);
        List<Contact> addressBookList = new ArrayList<>();
        HashMap<Integer, String> systemOptions = new HashMap<Integer, String>();
        boolean programmEnd = false;
        while (!programmEnd) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1: Add a new Person in the address book");
            System.out.println("2: Give out the Number of People in the address book");
            System.out.println("3: Search for a specific Person");
            System.out.println("4: Delete a contact from the book via the contacts E-mail");
            System.out.println("5: Close the book");
            System.out.println("________________________________________________________");
            System.out.println("Type the Number of what you would like to do.(1,2,3,4,5)");
            int performTask = Integer.parseInt(scanner.nextLine());
//TODO Hashmaps anschauen
            programmEnd = getOptionsForTheAddressBook(scanner, addressBookList, false, performTask);
        }
    }

    private static boolean getOptionsForTheAddressBook(Scanner scanner, List<Contact> addressBookList, boolean programmEnd, int performTask) {
        switch (performTask) {
            case 1 -> {
                gatherUserInformation(scanner, addressBookList);
                break;
            }

            case 2 -> {
                System.out.println("There are currently " + addressBookList.size() + " People in this address book");
                break;
            }

            case 3 -> {
                findUser(scanner, addressBookList);
                break;
            }

            case 4 -> {
                deleteUser(scanner, addressBookList);
                break;
            }
//TODO Scanner so wie weg bekommen für immer(mit Readern) Utility class für scanner machen NICHT reader benutzen.
            case 5 -> {
                programmEnd = true;
                System.out.println("bye");
                break;
            }
        }
        return programmEnd;
    }

    private static void deleteUser(Scanner scanner, List<Contact> addressBookList) {
        System.out.println("What Contact do you want to Delete?");
        for (Contact entry : addressBookList) {
            System.out.println(entry.getEmail());
        }

        String wantedEmail = scanner.nextLine();

        for (int i = 0; i < addressBookList.size(); i++) {
            if (addressBookList.get(i).getEmail().equals(wantedEmail)) {
                addressBookList.remove(i);
            }
        }
    }

    private static void findUser(Scanner scanner, List<Contact> addressBookList) {
        System.out.println("What Persons Information do you want to get?");
        for (Contact entry : addressBookList) {
            System.out.println("--------------------");
            System.out.print(entry.getName() + ", ");
        }
        String desiredPerson = scanner.nextLine();
        for (Contact entry : addressBookList) {
            if (entry.getName().equalsIgnoreCase(desiredPerson)) {
                System.out.println(entry.getName() + " " + entry.getEmail() + " " + entry.getPhoneNumber());
            }
        }
    }

    private static void gatherUserInformation(Scanner scanner, List<Contact> addressBookList) {
        System.out.println("Enter The New Persons Name");
        String name = scanner.nextLine();

        String mail = getUserEmail(scanner, addressBookList);

        System.out.println("Enter your phone Number");
        String phoneNumber = scanner.nextLine();
        while (!(phoneNumber.contains("+") && phoneNumber.length() >= 16)) {
            System.out.println("Enter a PhoneNumber like this: +XX XX XXX XX XX");
            phoneNumber = scanner.nextLine();
        }

        addressBookList.add(new Contact(name, mail, phoneNumber));

        return;
    }

    private static String getUserEmail(Scanner scanner, List<Contact> addressBookList) {
        boolean noSameMail = true;
        System.out.println("What is your E-mail address?");
        String mail = scanner.nextLine();
        boolean containsAnAet = false;
        while (!containsAnAet) {
            if (mail.contains("@")) {
                containsAnAet = true;
            } else {
                System.out.println("Your mail needs an @");
                mail = scanner.nextLine();
            }
        }
        for (Contact entry : addressBookList) {
            while (noSameMail) { //can't have the same Email twice.
                if (mail.equals(entry.getEmail())) {
                    System.out.println("Email is already in use try another one ");
                    mail = scanner.nextLine();
                }
                if (!mail.equals(entry.getEmail())) {
                    noSameMail = false;
                }
            }
        }
        return mail;
    }
}