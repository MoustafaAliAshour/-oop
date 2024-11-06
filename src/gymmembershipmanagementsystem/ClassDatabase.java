package gymmembershipmanagementsystem;

import java.io.*;
import java.util.*;

public class ClassDatabase extends Database<Class> {

    public ClassDatabase(String fileName){
        super(fileName);
    }
    @Override
    public Class createRecordFrom(String line) {
        String[] data = line.split(", ");
        if (data.length != 5) {
            throw new IllegalArgumentException("Incorrect format in line: " + line);
        }
        return new Class(data[0], data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
    }
}

