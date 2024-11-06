package gymmembershipmanagementsystem;

public class Class implements Searchable {
    private String classID, className, trainerID;
    private int duration, availableSeats;

    public Class(String classID, String className, String trainerID, int duration, int availableSeats) {
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }
    
    public int getAvailableSeats(){
        return availableSeats;
    }
    
    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }

    @Override
    public String getSearchKey() {
        return classID;
    }

    @Override
    public String lineRepresentation() {
        return String.join(", ", classID, className, trainerID, String.valueOf(duration), String.valueOf(availableSeats));
    }
}


