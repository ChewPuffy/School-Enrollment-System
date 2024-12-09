import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CreateDB{
Path directoryPath = Path.of("C:\\StudentsDB");
Path createFile; 

    public void DB(){
         // Specify the directory path
        
        try {
            // Check if the directory exists
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);  // Create the directory if it doesn't exist
                
            } else {
            
            }
       
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void StudentRecord(String filename, String name, String gender, String Birthdate, String address, String number, String email, String studentnum, String course, String sem, String guardiancontact, String balance){
        try {
            createFile = directoryPath.resolve(filename +".txt");

              if (!Files.exists(createFile)) {
                    Files.createFile(createFile);
                    System.out.println("File created: " + createFile);
                } else {
                    System.out.println("File already exists: " + createFile);
                }
             // Write strings to the file
            Files.writeString(createFile, name + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, gender + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, Birthdate + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, address + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, number + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, email + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, studentnum + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, course + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, "2nd" + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, sem + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, guardiancontact + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, balance + System.lineSeparator(), StandardOpenOption.APPEND); 
        } catch (Exception e) {
              e.printStackTrace();
        }
    }


     public void StudentRecord(String filename, String name, String gender, String Birthdate, String address, String number, String email, String studentnum, String studenttype, String course, String sem, String guardiancontact, String balance){
        try {
            createFile = directoryPath.resolve(filename +".txt");

              if (!Files.exists(createFile)) {
                    Files.createFile(createFile);
                    System.out.println("File created: " + createFile);
                } else {
                    System.out.println("File already exists: " + createFile);
                }
             // Write strings to the file
            Files.writeString(createFile, name + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, gender + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, Birthdate + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, address + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, number + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, email + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, studentnum + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, studenttype + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(createFile, course + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, "2nd" + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, sem + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, guardiancontact + System.lineSeparator(), StandardOpenOption.APPEND);    
            Files.writeString(createFile, balance + System.lineSeparator(), StandardOpenOption.APPEND); 
        } catch (Exception e) {
              e.printStackTrace();
        }
    }

    public void updateBalance(String filename, double amountToSubtract) {
        try {
            createFile = directoryPath.resolve(filename + ".txt");

            if (Files.exists(createFile)) {
                // Read all lines of the file into a list
                List<String> lines = Files.readAllLines(createFile);

                // Extract the balance (assumed to be the last line)
                if (lines.size() > 0) {
                    
                    String balanceLine = lines.get(lines.size() - 1);
                    
                    // Convert the balance to a double
                    double currentBalance = Double.parseDouble(balanceLine.trim());

                    // Subtract the amount from the balance
                    double newBalance = currentBalance - amountToSubtract;

                    // Replace the old balance with the new balance
                    lines.set(lines.size() - 1, String.valueOf(newBalance));

                    // Write the updated lines back to the file
                    Files.write(createFile, lines);
                    System.out.println("Balance updated successfully.\nCurrent Balance: " + newBalance);
                }
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int recordChecker(String filename){
        int result;
         Path filePath = directoryPath.resolve(filename + ".txt");

            if (Files.exists(filePath)) {
                result=1;
            }
            else {
                System.out.println("File does not exist.");
                result=0;
            }
        return result;
    }
    
    public void deleteRecord(String filename) {
      
            Path filePath = directoryPath.resolve(filename + ".txt");

            if (Files.exists(filePath)) {
                
                try {
            // Delete the file if it exists
            Files.delete(filePath);
            System.out.println("File deleted: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
            } else {
                System.out.println("File does not exist.");
                
            }
        
    }

    public void viewRecord(String filename){
        Path filePath = directoryPath.resolve(filename + ".txt");
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<String> elements = new ArrayList<>(Arrays.asList("Name: ","Gender: ","Birthdate: ","Address: ","Number: ","Email: ","Student Number: ","Course: ","Term: ","Semester: ","Guardian Contact: ","Balance: "));
            // Display each line 
            for (int i = 0; i < lines.size(); i++) {
                if (i < elements.size()) {
                    // Print the label and the corresponding line
                    System.out.println(elements.get(i) + lines.get(i));
                } else {
                    // Extra lines without a label
                    System.out.println("Unknown: " + lines.get(i));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
