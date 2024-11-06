package gymmembershipmanagementsystem;

import java.util.*;
import java.io.*;

public abstract class Database<T extends Searchable> {
    protected ArrayList<T> records = new ArrayList<>();
    protected String fileName;
    
    public Database(String fileName){
        this.fileName = fileName;
    }
    
    public void readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(createRecordFrom(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public abstract T createRecordFrom(String line);
    
    public  ArrayList<T> returnAllRecords(){
        return records;
    }
    
    public boolean contains(String key) {
    return records.stream().anyMatch(record -> record.getSearchKey().equals(key));
    }

    public T getRecord(String key){
        return records.stream().filter(record -> record.getSearchKey().equals(key)).findFirst().orElse(null);
    }
    
    public void insertRecord(T record){
        if(!contains(record.getSearchKey())){
            records.add(record);
            saveToFile();
        }
    }
    
    public boolean updateRecord(T updatedRecord) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(updatedRecord.getSearchKey())) {
                records.set(i, updatedRecord);
                saveToFile();
                return true;
            }
        }
        return false;
    }
    
    public void deleteRecord(String key){
        records.removeIf(record -> record.getSearchKey().equals(key));
        saveToFile();
    }
    
    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (T record : records) {
                bw.write(record.lineRepresentation());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
