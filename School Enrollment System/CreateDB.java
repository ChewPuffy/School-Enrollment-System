import java.io.IOException;
import java.nio.file.*;
public class CreateDB{
//CLASS MADE BY LATTRELLE YUMUL
    
    public void DB(){
         // Specify the directory path
        Path directoryPath = Paths.get("C:\\StudentsDB");
        Path createFile = directoryPath.resolve("sample.txt");
        try {
            // Check if the directory exists
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);  // Create the directory if it doesn't exist
                System.out.println("Directory created: " + directoryPath);
            } else {
                System.out.println("Directory already exists: " + directoryPath);
            }
       

      
           
            if (!Files.exists(createFile)) {
                    Files.createFile(createFile);
                    System.out.println("File created: " + createFile);
                } else {
                    System.out.println("File already exists: " + createFile);
                }
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}