package gymmembershipmanagementsystem;

import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class MemberClassRegistration implements Searchable {
    private String registrationID, memberID, classID, status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String registrationID, String memberID, String classID, String status, LocalDate registrationDate) {
        this.registrationID = registrationID;
        this.memberID = memberID;
        this.classID = classID;
        this.status = status;
        this.registrationDate = registrationDate;
    }
    
    public String getMemberID(){
        return memberID;
    }
    
    public String getClassID(){
        return classID;
    }
    public LocalDate getRegistrationDate(){
        return registrationDate;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearchKey() {
        return memberID + "-" + classID;
    }
    
    public String lineRepresentation() {
        return String.join(", ", registrationID, memberID, classID, status, registrationDate.toString());
    }
}


