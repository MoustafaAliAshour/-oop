package gymmembershipmanagementsystem;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminRole extends JFrame {
    private TrainerDatabase database;

    public AdminRole() {
        this.database = new TrainerDatabase("Trainers.txt");
        database.readFromFile();
    }

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer trainer = new Trainer(trainerId, name, email, specialty, phoneNumber);
        if (!database.contains(trainerId)) {
            database.insertRecord(trainer);
            JOptionPane.showMessageDialog(this,"The Trainer with Id = " + trainerId + " has successfully been added!", "Addition Successful", JOptionPane.INFORMATION_MESSAGE);
            database.saveToFile();
        } else {
            JOptionPane.showMessageDialog(this, "The Trainer with Id = " + trainerId + " already exists!", "Addition Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Trainer> getListOfTrainers() {
        return database.returnAllRecords();
    }

    public void removeTrainer(String key) {
        if (database.contains(key)) {
            database.deleteRecord(key);
            JOptionPane.showMessageDialog(this,"The Trainer with Id = " + key + " has successfully been removed!", "Deletion Successful", JOptionPane.INFORMATION_MESSAGE);
            database.saveToFile();
        } else {
            JOptionPane.showMessageDialog(this,"Trainer with ID " + key + " not found.","Deletion Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void logout() {
        database.saveToFile();
    }
}
