package objektOriented.aufg1.aufg2;

import objektOriented.aufg1.aufg3.StreamingDienst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdressBuchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<AddressBook> addressBookList = new ArrayList<>();
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

            switch (performTask) {
                case 1:
                    System.out.println("Enter The New Persons Name");
                    String name = scanner.nextLine();
                    boolean noSameMail = true;
                    boolean loop = true;
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
                    for (AddressBook entry : addressBookList) {
                        while (noSameMail) {
                            if (mail.equals(entry.getEmail())) {
                                System.out.println("Email is already in use try another one ");
                                mail = scanner.nextLine();
                            } else {
                                loop = false;
                            }
                            if (!mail.equals(entry.getEmail())) {
                                noSameMail = false;
                            }
                        }
                    }
                    System.out.println("Enter your phone Number");
                    String phoneNumber = scanner.nextLine();
                    while (!(phoneNumber.contains( "+")&&phoneNumber.length()>=16)) {
                        System.out.println("Enter a PhoneNumber like this: +XX XX XXX XX XX");
                        phoneNumber = scanner.nextLine();
                    }

                    addressBookList.add(new AddressBook(name, mail, phoneNumber));

                    break;

                case 2:
                    System.out.println("There are currently " + addressBookList.size() + " People in this address book");
                    break;

                case 3:
                    System.out.println("What Persons Information do you want to get?");
                    for (AddressBook entry : addressBookList) {
                        System.out.println("--------------------");
                        System.out.print(entry.getName() + ", ");
                    }
                    String desiredPerson = scanner.nextLine();
                    for (AddressBook entry : addressBookList) {
                        if (entry.getName().equalsIgnoreCase(desiredPerson)) {
                            System.out.println(entry.getName() + " " + entry.getEmail() + " " + entry.getPhoneNumber());
                        }
                    }
                    break;

                case 4:
                    System.out.println("What Contact do you want to Delete?");
                    for (AddressBook entry : addressBookList) {
                        System.out.println(entry.getEmail());
                    }

                    String wantedEmail = scanner.nextLine();

                    for (int i = 0; i < addressBookList.size(); i++) {
                        if (addressBookList.get(i).getEmail().equals(wantedEmail)) {
                            addressBookList.remove(i);
                        }
                    }
                    break;

                case 5:
                    programmEnd = true;
                    System.out.println("bye");
                    break;
            }
        }
    }
}