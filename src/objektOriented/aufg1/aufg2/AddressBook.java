package objektOriented.aufg1.aufg2;

public class AddressBook {

    private String name;
    private String Email;
    private String PhoneNumber;

    public AddressBook(String name, String email, String phoneNumber) {
        this.name = name;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

}
