import java.util.Scanner;

public class Main implements Methods{
static Scanner handler = new Scanner(System.in);
static int runningtask;
static int EnrollmentType;

    public static void main(String[] args) {
        Main m = new Main();   
        while(runningtask!=3){   //LOOP MADE BY LATTRELLE YUMUL
        m.Menu();
        }
    }

    public void Menu(){
        System.out.println("[===================================================]"); //FIRST STATEMENT TIL SWITCH CASE MADE BY LATTRELLE YUMUL
        System.out.println("[                 Enrollment System                 ]");
        System.out.println("[===================================================]");
        System.out.print("Please choose a student record management action:\n[1] Enrollment\n[2] Update Student's Record\n[3] Exit program\n\nEnter your choice (1 / 2 / 3):");
        runningtask=handler.nextInt();
        switch (runningtask) {
            case 1:
                Enrollment();
                break;
            case 2:
                UpdateStudentRecord();
                break;
             case 3:
                System.out.println("Program finished");
                break;
            default:
                throw new AssertionError();
        }

    }

    public void Enrollment(){
        System.out.print("Please choose enrollment type:\n[1] New Enrollment (new students)\n[2] Re-Enrollment (returning students)\n[3] Exit program\n\nEnter your choice (1 / 2 / 3):");
    }

    public void Irreg(){
        
    }

    public void NewStudent(){

    }

    public void ReturningStudent(){

    }
    
    public void UpdateStudentRecord(){
        System.out.println("Update Student Record");
    }


}