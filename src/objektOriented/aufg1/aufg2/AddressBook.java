package objektOriented.aufg1.aufg2;

public class AddressBook {

    private String Name;
    private String Email;
    private String PhoneNumber;

    public AddressBook(String name, String email, String phoneNumber) {
        this.Name = name;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
    }

    public String getName() {
        return this.Name;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

}
