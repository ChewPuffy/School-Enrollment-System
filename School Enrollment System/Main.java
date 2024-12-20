import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main implements Methods{
/*
MEMBERS
- Yumul, Lattrelle
- Quiroz, Aian Stephen
- Gonzales, Terence
- Burgos, Joyce
- Yalung, Miguel
*/
TuitionComputation tc = new TuitionComputation();
CourseUNITS cu = new CourseUNITS();
CreateDB cdb = new CreateDB();
Random random = new Random();
static int runningtask;
static int EnrollmentType;
String name,gender,birthdate,address,number,email,
course,sem,guardiancontact,studentno,lastName;

int last6digits;
    public static void main(String[] args) {
        CreateDB cdb = new CreateDB();
        cdb.DB();
        Main m = new Main();   
        m.Menu();
    }

    public void Menu(){
        Scanner handler = new Scanner(System.in);
        System.out.println("[===================================================]"); 
        System.out.println("[            Enrollment Simulation System           ]");
        System.out.println("[===================================================]");
        System.out.print("Please choose a student record management action:\n[1] Enrollment\n[2] Update Student's Record\n[3] View Student Record\n[4] Exit program\n\nEnter your choice (1 / 2 / 3):");
        runningtask=handler.nextInt();
        switch (runningtask) {
            case 1:
                Enrollment();
                break;
            case 2:
                UpdateStudentRecord();
                break;
            case 3:
                ViewStudentRecord();
                break;
            case 4:
                System.out.println("Program finished");
                break;
            default:
                System.out.println("Invalid input");
        }

    }

    public void ViewStudentRecord(){
        Scanner handler = new Scanner(System.in);
        spaces();
        System.out.print("Enter student name (ex: John Doe): ");
        String input = handler.nextLine();
        System.out.println("====Student Info====");
        cdb.viewRecord(input);
    }

    public void Irreg(){
        Scanner handler = new Scanner(System.in);
        last6digits = 100000 + random.nextInt(900000);
        studentno = "02000" + String.valueOf(last6digits);

        System.out.print("Please enter the details:\nFull Name: ");
            name=handler.nextLine();
            String[] nameParts = name.split(" ");
            String lastName = nameParts[nameParts.length - 1].toLowerCase();
            email = lastName + String.valueOf(last6digits) + "@sanfernando.sti.edu.ph";
        System.out.print("Gender: ");
            gender=handler.nextLine();

        System.out.print("Date of Birth: ");
            birthdate=handler.nextLine();

        System.out.print("Address: ");
            address=handler.nextLine();
        
        System.out.print("Contact Number: ");
            number=handler.nextLine();
        
        System.out.println("Email: " +email+"\nProgram/Course:\nAvailable courses:\nBachelor of Science in Information Technology (BSIT)\nBachelor of Science in Business Administration (BSBA)\nBachelor of Science in Tourism Management (BSTM)\nBachelor of Multimedia Arts (BMMA)");
        System.out.print("Enter the course name (ex: BSIT): ");
            course=handler.nextLine();
        
        System.out.println("Term: 2nd");
        System.out.print("Semester: ");
            sem=handler.nextLine();

        System.out.print("Guardian Contact: ");
            guardiancontact=handler.nextLine();

        //BSIT 1st sem
        if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("1st")){
           
            System.out.println("[Available Subjects]");
            for (String element : cu.BSITmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BSITminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }
            


            System.out.println("Total tuition: " + tc.BSITtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
                double balance = tc.BSITtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        //BSIT 2nd sem
        else if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("2nd")){
           
            System.out.println("[Available Subjects]");
            for (String element : cu.BSITmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BSITminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }


            System.out.println("Total tuition: " + tc.BSITtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
            double balance = tc.BSITtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        //BMMA 1st sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("1st")){
            
            System.out.println("[Available Subjects]");
            for (String element : cu.BMMAmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BMMAminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }

            System.out.println("Total tuition: " + tc.BMMAtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
            double balance = tc.BMMAtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        //BMMA 2nd sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("2nd")){
            
            System.out.println("[Available Subjects]");
            for (String element : cu.BMMAmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BMMAminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }

            System.out.println("Total tuition: " + tc.BMMAtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
            double balance = tc.BMMAtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        //BSTM 1st sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("1st")){
           
            System.out.println("[Available Subjects]");
            for (String element : cu.BSTMmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BSTMminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }


            System.out.println("Total tuition: " + tc.BSTMtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
            double balance = tc.BSTMtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        //BSTM 2nd sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("2nd")){
           
            System.out.println("[Available Subjects]");
            for (String element : cu.BSTMmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BSTMminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }

            System.out.println("Total tuition: " + tc.BSTMtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
            double balance = tc.BSTMtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        //BSBA 1st sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("1st")){
            System.out.println("[Available Subjects]");
            for (String element : cu.BSBAmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BSBAminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }

            System.out.println("Total tuition: " + tc.BSTMtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
            double balance = tc.BSBAtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        //BSBA 2nd sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("2nd")){
            System.out.println("[Available Subjects]");
            for (String element : cu.BSBAmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BSBAminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.print("Enter the subjects (enter done if all subjects have been listed): ");
            ArrayList<String> subjects = new ArrayList<>();
            String input=handler.nextLine();
            subjects.add(input);
            while(!input.equalsIgnoreCase("done")){
                System.out.print(": ");
                input = handler.nextLine();
                subjects.add(input);
            }


            System.out.println("Total tuition: " + tc.BSBAtuition(subjects));
            System.out.print("Amount paid: ");
                double payment = handler.nextInt();
            double balance = tc.BSBAtuition(subjects) - payment;
            System.out.println("Total balance: " + balance);
            System.out.println("Officially enrolled!");
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, "Irregular", course, sem, guardiancontact, String.valueOf(balance));
            spaces();
            cdb.viewRecordIrreg(name);
        }
        
        
    }

    public void Enrollment(){
        Scanner handler = new Scanner(System.in);
        spaces();
        System.out.println("[==== New Enrollee ====]\n");
        System.out.print("Irregular Student? (Y/N): ");
        String choice = handler.nextLine();
        if(choice.equalsIgnoreCase("y")){
            Irreg();
        } 
        else if(choice.equalsIgnoreCase("n")){
            last6digits = 100000 + random.nextInt(900000);
            studentno = "02000" + String.valueOf(last6digits);
            System.out.print("Please enter the details:\nFull Name: ");
            name=handler.nextLine();
            String[] nameParts = name.split(" ");
            lastName = nameParts[nameParts.length - 1].toLowerCase();
            email = lastName + String.valueOf(last6digits) + "@sanfernando.sti.edu.ph";
        System.out.print("Gender: ");
            gender=handler.nextLine();

        System.out.print("Date of Birth: ");
            birthdate=handler.nextLine();

        System.out.print("Address: ");
            address=handler.nextLine();
        
        System.out.print("Contact Number: ");
            number=handler.nextLine();
        
        System.out.println("Email: " +email+"\nProgram/Course:\nAvailable courses:\nBachelor of Science in Information Technology (BSIT)\nBachelor of Science in Business Administration (BSBA)\nBachelor of Science in Tourism Management (BSTM)\nBachelor of Multimedia Arts (BMMA)");
        System.out.print("Enter the course name (ex: BSIT): ");
            course=handler.nextLine();
        
        System.out.println("Term: 2nd");
        System.out.print("Semester: ");
            sem=handler.nextLine();

        System.out.print("Guardian Contact: ");
            guardiancontact=handler.nextLine();
        

        //BSIT 1st sem
        if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("1st")){
            System.out.println("[Subjects]");
            for (String element : cu.BSITmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BSITminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBSITtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));   
                    spaces();
                    cdb.viewRecord(name);   
                }
        }
        //BSIT 2nd sem
        else if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("2nd")){
            System.out.println("[Subjects]");
            for (String element : cu.BSITmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BSITminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBSITtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);        
                }
        }
        //BMMA 1st sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("1st")){
            System.out.println("[Subjects]");
            for (String element : cu.BMMAmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BMMAminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBMMAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance)); 
                    spaces();
                    cdb.viewRecord(name);         
                }
        }
        //BMMA 2nd sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("2nd")){
            
            System.out.println("[Subjects]");
            for (String element : cu.BMMAmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BMMAminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBMMAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance)); 
                    spaces();
                    cdb.viewRecord(name);    
                }
        }
        //BSTM 1st sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("1st")){
            
            System.out.println("[Subjects]");
            for (String element : cu.BSTMmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BSTMminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBSTMtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
        }
        //BSTM 2nd sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("2nd")){
            
            System.out.println("[Subjects]");
            for (String element : cu.BSTMmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BSTMminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBSTMtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));  
                    spaces();
                    cdb.viewRecord(name);    
                }
        }
        //BSBA 1st sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("1st")){
            
            System.out.println("[Subjects]");
            for (String element : cu.BSBAmajorSubs1stSem) {
                System.out.println(element);
            }
            for (String element : cu.BSBAminorSubs1stSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBSBAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
        }
        //BSBA 2nd sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("2nd")){
            
            System.out.println("[Subjects]");
            for (String element : cu.BSBAmajorSubs2ndSem) {
                System.out.println(element);
            }
            for (String element : cu.BSBAminorSubs2ndSem) {
                System.out.println(element);
            }
            System.out.println("Total tuition: "+ tc.getBSBAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, studentno, course, sem, guardiancontact, String.valueOf(balance));
                    spaces();
                    cdb.viewRecord(name);
                }
        }
        }else {
            System.out.println("Invalid input");
        }
    }

    
    public void UpdateStudentRecord(){
        Scanner handler = new Scanner(System.in);
      
        System.out.print("Enter student name (ex: John Doe): ");
        String input = handler.nextLine();
        if(cdb.recordChecker(input)==1){
        System.out.print("[1] Update balance [2] Delete Record:\n ");
        int choice = handler.nextInt();
        handler.nextLine();
        if(choice==1){
        System.out.print("Enter the amount paid: ");
        double payment = handler.nextDouble();   
        cdb.updateBalance(input, payment);
        }
        else if(choice==2){
        System.out.print("Delete file? (Y/N): ");   
            String yn = handler.nextLine();
            if(yn.equalsIgnoreCase("y")){
                cdb.deleteRecord(input);
            } else if(yn.equalsIgnoreCase("n")){
                System.out.println("File deletion cancelled");
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }
        } else{
            //file does not exist
        } 
    }

    public void spaces(){
        System.out.println("\n\n\n\n\n\n");
    }
}
