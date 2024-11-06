package gymmembershipmanagementsystem;

public class Trainer implements Searchable {
    private String trainerId, name, email, specialty, phoneNumber;

    public Trainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.specialty = specialty;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getSearchKey() {
        return trainerId;
    }

    @Override
    public String lineRepresentation() {
        return String.join(", ", trainerId, name, email, specialty, phoneNumber);
    }
}
