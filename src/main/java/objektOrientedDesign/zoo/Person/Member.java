package objektOrientedDesign.zoo.Person;

public class Member extends People{
    private String memberSince;
    private int memberNumber;

    public Member(String phonenumber, String memberSince, int memberNumber) {
        super(phonenumber);
        this.memberSince = memberSince;
        this.memberNumber = memberNumber;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }
}
