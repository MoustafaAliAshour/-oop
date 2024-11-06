package gymmembershipmanagementsystem;

import java.time.*;

public class MemberClassRegistrationDatabase extends Database<MemberClassRegistration> {

    public MemberClassRegistrationDatabase(String fileName) {
        super(fileName);
    }
    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String[] data = line.split(", ");
        if (data.length != 5) {
            throw new IllegalArgumentException("Incorrect format in line: " + line);
        }
        return new MemberClassRegistration(data[0], data[1], data[2], data[3], LocalDate.parse(data[4]));
    }
}

