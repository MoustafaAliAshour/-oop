package gymmembershipmanagementsystem;

import java.util.*;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TrainerRole extends JFrame{
    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;

    public TrainerRole() {
        this.memberDatabase = new MemberDatabase("Members.txt");
        this.classDatabase = new ClassDatabase("Class.txt");
        this.registrationDatabase = new MemberClassRegistrationDatabase("Registrations.txt");
        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }

    public void addMember(String memberID, String name, String email, String membershipType, String phoneNumber, String status) {
        if (!memberDatabase.contains(memberID)) {
            Member newMember = new Member(memberID, name, email, membershipType, phoneNumber, status);
            memberDatabase.insertRecord(newMember);
            JOptionPane.showMessageDialog(this,"The Member with Id = " + memberID + " has successfully been added!", "Addition Successful", JOptionPane.INFORMATION_MESSAGE);
            memberDatabase.saveToFile();
        } else {
            JOptionPane.showMessageDialog(this, "The Member with Id = " + memberID + " already exists!", "Addition Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Member> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        if(!classDatabase.contains(classID)){
            Class newClass = new Class(classID, className, trainerID, duration, maxParticipants);
            classDatabase.insertRecord(newClass);
            JOptionPane.showMessageDialog(this,"The Class with Id = " + classID + " has successfully been added!", "Addition Successful", JOptionPane.INFORMATION_MESSAGE);
            classDatabase.saveToFile();
        }
        else{
            JOptionPane.showMessageDialog(this, "The Class with Id = " + classID + " already exists!", "Addition Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Class> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        Class classToRegister = classDatabase.getRecord(classID);
        if (classToRegister == null) {
        JOptionPane.showMessageDialog(this, "Class not found for ID: " + classID, "Error", JOptionPane.ERROR_MESSAGE);
        return false;
        }
        else if (classToRegister.getAvailableSeats() > 0) {
            String registrationID = memberID + "-" + classID;
            MemberClassRegistration registration = new MemberClassRegistration(registrationID, memberID, classID, "Active", registrationDate);
            registrationDatabase.insertRecord(registration);
            classToRegister.setAvailableSeats(classToRegister.getAvailableSeats() - 1);
            JOptionPane.showMessageDialog(this,"The Member with Id = " + memberID + " has successfully registred to Class "+ classID);
            classDatabase.saveToFile();
            return true;
        }
        JOptionPane.showMessageDialog(this, "The Class has no available seats" , "Message", JOptionPane.ERROR_MESSAGE);
        return false;
        }

    public boolean cancelRegistration(String memberID, String classID) {
        MemberClassRegistration registration = registrationDatabase.getRecord(memberID + "-" + classID);
        if (registration == null) {
            JOptionPane.showMessageDialog(this, "No registration found for member ID: " + memberID + " and class ID: " + classID, "Cancellation Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isBefore(registration.getRegistrationDate().plusDays(3))) {
            registration.setStatus("Canceled");
            registrationDatabase.updateRecord(registration);
            registrationDatabase.saveToFile();
            JOptionPane.showMessageDialog(this, "Refund has been issued for the canceled registration.", "Refund Issued", JOptionPane.INFORMATION_MESSAGE);
            Class targetClass = classDatabase.getRecord(classID);
            if (targetClass != null) {
                targetClass.setAvailableSeats(targetClass.getAvailableSeats() + 1);
                classDatabase.saveToFile();
            }
            JOptionPane.showMessageDialog(this, "The member with ID = " + memberID + " has been successfully unregistered from Class " + classID, "Cancellation Successful", JOptionPane.INFORMATION_MESSAGE);
            return true;
            } else {
                JOptionPane.showMessageDialog(this, "Cancellation for member ID: " + memberID + " and class ID: " + classID + " cannot be processed as it is beyond the allowed 3-day window.", "Cancellation Failed", JOptionPane.WARNING_MESSAGE);
                return false;
            }
    }

    public List<MemberClassRegistration> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }
}

