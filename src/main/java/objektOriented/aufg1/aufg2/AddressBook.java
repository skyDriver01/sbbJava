package objektOriented.aufg1.aufg2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public void executeTheSite() {
        List<Contact> addressBookList = new ArrayList<>();
      //  HashMap<Integer, String> systemOptions = new HashMap<Integer, String>();
        boolean programmEnd = false;
        showSiteFunctions (addressBookList, programmEnd);
    }

    private static void showSiteFunctions(List<Contact> addressBookList, boolean programmEnd) {
        while (!programmEnd) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1: Add a new Person in the address book");
            System.out.println("2: Give out the Number of People in the address book");
            System.out.println("3: Search for a specific Person");
            System.out.println("4: Delete a contact from the book via the contacts E-mail");
            System.out.println("5: Close the book");
            System.out.println("________________________________________________________");
            System.out.println("Type the Number of what you would like to do.(1,2,3,4,5)");
            int performTask = Integer.parseInt(InputIn.nextLine());
            programmEnd = getOptionsForTheAddressBook(addressBookList, false, performTask);
        }
    }

    private static boolean getOptionsForTheAddressBook(List<Contact> addressBookList, boolean programmEnd, int performTask) {
        switch (performTask) {
            case 1 -> {
                gatherUserInformation(addressBookList);
            }

            case 2 -> {
                System.out.println("There are currently " + addressBookList.size() + " People in this address book");
            }

            case 3 -> {
                findUser(addressBookList);
            }

            case 4 -> {
                deleteUser(addressBookList);
            }
            case 5 -> {
                programmEnd = true;
                System.out.println("bye");
            }
        }
        return programmEnd;
    }

    private static void deleteUser(List<Contact> addressBookList) {
        System.out.println("What Contact do you want to Delete?");
        showAllExistingEmails (addressBookList);

        String wantedEmail = InputIn.nextLine();
        deleteTheWantedPerson (addressBookList, wantedEmail);
    }

    private static void deleteTheWantedPerson(List<Contact> addressBookList, String wantedEmail) {
        for (int i = 0; i < addressBookList.size(); i++) {
            if (addressBookList.get(i).getEmail().equals(wantedEmail)) {
                addressBookList.remove(i);
            }
        }
    }

    private static void showAllExistingEmails(List<Contact> addressBookList) {
        for (Contact entry : addressBookList) {
            System.out.println(entry.getEmail());
        }
    }

    private static void findUser(List<Contact> addressBookList) {
        System.out.println("What Persons Information do you want to get?");
        getAllExistingPeople (addressBookList);

        String desiredPerson = InputIn.nextLine();
        getTheInformationOfTheWantedPerson (addressBookList, desiredPerson);
    }

    private static void getTheInformationOfTheWantedPerson(List<Contact> addressBookList, String desiredPerson) {
        for (Contact entry : addressBookList) {
            if (entry.getName().equalsIgnoreCase(desiredPerson)) {
                System.out.println(entry.getName() + " " + entry.getEmail() + " " + entry.getPhoneNumber());
            }
        }
    }

    private static void getAllExistingPeople(List<Contact> addressBookList) {
        for (Contact entry : addressBookList) {
            System.out.println("--------------------");
            System.out.print(entry.getName() + ", ");
        }
    }

    private static void gatherUserInformation(List<Contact> addressBookList) {
        String name = InputIn.nextLineOut("Enter the new Persons Name");

        String mail = getUserEmail(addressBookList);

        String phoneNumber = InputIn.nextLineOut("Enter the Persons PhoneNumber");
        while (!(phoneNumber.contains("+") && phoneNumber.length() >= 16)) {
            phoneNumber = InputIn.nextLineOut("Enter a PhoneNumber like this: +XX XX XXX XX XX");
        }

        addressBookList.add(new Contact(name, mail, phoneNumber));
    }

    private static String getUserEmail(List<Contact> addressBookList) {
        boolean noSameMail = true;
        String mail = InputIn.nextLineOut("What is your E-mail address?");
        boolean containsAnAet = false;
        mail = checkIfTheEmailHasAnAet (mail, containsAnAet);
        mail = checkIfThatEmailIsAlreadyInUse (addressBookList, noSameMail, mail);
        return mail;
    }

    private static String checkIfTheEmailHasAnAet(String mail, boolean containsAnAet) {
        while (!containsAnAet) {
            if (mail.contains("@")) {
                containsAnAet = true;
            } else {
                mail = InputIn.nextLineOut("Your mail needs an @");
            }
        }
        return mail;
    }

    private static String checkIfThatEmailIsAlreadyInUse(List<Contact> addressBookList, boolean noSameMail, String mail) {
        for (Contact entry : addressBookList) {
            while (noSameMail) { //can't have the same Email twice.
                if (mail.equals(entry.getEmail())) {
                    mail = InputIn.nextLineOut("Email is already in use try another one");
                }
                if (!mail.equals(entry.getEmail())) {
                    noSameMail = false;
                }
            }
        }
        return mail;
    }
}