import java.io.IOException;
import java.nio.file.*;
public class CreateDB{
Path directoryPath = Path.of("C:\\StudentsDB");
Path createFile; 

    public void DB(){
         // Specify the directory path
        
        try {
            // Check if the directory exists
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);  // Create the directory if it doesn't exist
                System.out.println("Directory created: " + directoryPath);
            } else {
                System.out.println("Directory already exists: " + directoryPath);
            }
       
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void StudentRecord(String filename, String name, String gender, String Birthdate, String address, String number, String email, String course, String term, String sem, String guardiancontact){
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
            Files.writeString(createFile, address + System.lineSeparator(), StandardOpenOption.APPEND);    
        } catch (Exception e) {
              e.printStackTrace();
        }
    }
}
