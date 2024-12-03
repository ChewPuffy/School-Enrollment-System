import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
public class CreateDB {
    public static void main(String[] args) {
      CreateDB db = new CreateDB();
      db.SampleCode();
    }


    public void SampleCode(){
         // Specify the directory path
        Path directoryPath = Paths.get("C:\\directory1");
        Path createFile = directoryPath.resolve("sample.txt");
        try {
            // Check if the directory exists
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);  // Create the directory if it doesn't exist
                System.out.println("Directory created: " + directoryPath);
            } else {
                System.out.println("Directory already exists: " + directoryPath);
            }
       

        Scanner handler = new Scanner(System.in);
        System.out.print("Create a file inside the " + directoryPath + "?: ");
        String a = handler.nextLine();

        if(!a.equalsIgnoreCase("")){
           
            if (!Files.exists(createFile)) {
                    Files.createFile(createFile);
                    System.out.println("File created: " + createFile);
                } else {
                    System.out.println("File already exists: " + createFile);
                }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}