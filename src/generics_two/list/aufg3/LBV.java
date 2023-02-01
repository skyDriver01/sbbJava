package generics_two.list.aufg3;

public class LBV {
    private float grade;
    private float worth;  //worth like how much its worth towards the ending grade bsp. "This lbv is worth 50% of your grade"

    public LBV(float grade, float worth) {
        this.grade = grade;
        this.worth = worth;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float getWorth() {
        return worth;
    }

    public void setWorth(float worth) {
        this.worth = worth;
    }
}