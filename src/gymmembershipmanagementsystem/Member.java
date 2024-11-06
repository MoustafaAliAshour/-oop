package gymmembershipmanagementsystem;

public class Member implements Searchable {
    private String memberID, name, email, membershipType, phoneNumber, status;

    public Member(String memberID, String name, String email, String membershipType, String phoneNumber, String status) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.membershipType = membershipType;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    @Override
    public String getSearchKey() {
        return memberID;
    }

    @Override
    public String lineRepresentation() {
        return String.join(", ", memberID, name, email, membershipType, phoneNumber, status);
    }
}