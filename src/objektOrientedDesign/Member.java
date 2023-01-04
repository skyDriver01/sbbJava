package objektOrientedDesign;

import java.time.LocalDate;

public class Member extends People{
    LocalDate memberSince;
    int memberNumber;

    public Member(String phonenumber, LocalDate memberSince, int memberNumber) {
        super(phonenumber);
        this.memberSince = memberSince;
        this.memberNumber = memberNumber;
    }

    public LocalDate getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(LocalDate memberSince) {
        this.memberSince = memberSince;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }
}
