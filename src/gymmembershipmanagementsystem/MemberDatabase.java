package gymmembershipmanagementsystem;

import java.io.*;
import java.util.*;

public class MemberDatabase extends Database<Member> {
    public MemberDatabase(String fileName){
        super(fileName);
    }
    @Override
    public Member createRecordFrom(String line) {
        String[] data = line.split(", ");
        if (data.length != 6) {
            throw new IllegalArgumentException("Incorrect format in line: " + line);
        }
        return new Member(data[0], data[1], data[2], data[3], data[4], data[5]);
    }
}