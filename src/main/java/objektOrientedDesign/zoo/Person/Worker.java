package objektOrientedDesign.zoo.Person;

public class Worker extends People{
    private int wage;
    private String description;
    public Worker(String phonenumber,int wage,String description) {
        super(phonenumber);
        this.wage = wage;
        this.description = description;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
