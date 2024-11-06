package gymmembershipmanagementsystem;

import java.io.*;
import java.util.*;

public class TrainerDatabase extends Database<Trainer> {
    
    public TrainerDatabase(String fileName){
        super(fileName);
    }
    @Override
    public Trainer createRecordFrom(String line) {
        String[] data = line.split(", ");
        if (data.length != 5) {
            throw new IllegalArgumentException("Incorrect format in line: " + line);
        }
        return new Trainer(data[0], data[1], data[2], data[3], data[4]);
    }
}




