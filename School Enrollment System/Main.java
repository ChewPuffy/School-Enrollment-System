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
        
        System.out.println(email+"\nProgram/Course:\nAvailable courses:\nBachelor of Science in Information Technology (BSIT)\nBachelor of Science in Business Administration (BSBA)\nBachelor of Science in Tourism Management (BSTM)\nBachelor of Multimedia Arts (BMMA)");
        System.out.print("Enter the course name (ex: BSIT): ");
            course=handler.nextLine();
        
        System.out.println("Term: 2nd");
        System.out.print("Semester: ");
            sem=handler.nextLine();

        System.out.print("Guardian Contact: ");
            guardiancontact=handler.nextLine();

        //BSIT 1st sem
        if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("1st")){
            System.out.println("Available subjects:\n"+ cu.BSITmajorSubs1stSem + "\n" + cu.BSITminorSubs1stSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        //BSIT 2nd sem
        else if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Available subjects:\n"+ cu.BSITmajorSubs2ndSem + "\n" + cu.BSITminorSubs2ndSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        //BMMA 1st sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("1st")){
            System.out.println("Available subjects:\n"+ cu.BMMAmajorSubs1stSem + "\n" + cu.BMMAminorSubs1stSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        //BMMA 2nd sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Available subjects:\n"+ cu.BMMAmajorSubs2ndSem + "\n" + cu.BMMAminorSubs2ndSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        //BSTM 1st sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("1st")){
            System.out.println("Available subjects:\n"+ cu.BSTMmajorSubs1stSem + "\n" + cu.BSTMminorSubs1stSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        //BSTM 2nd sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Available subjects:\n"+ cu.BSTMmajorSubs2ndSem + "\n" + cu.BSTMminorSubs2ndSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        //BSBA 1st sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("1st")){
            System.out.println("Available subjects:\n"+ cu.BSBAmajorSubs1stSem + "\n" + cu.BSBAminorSubs1stSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        //BSBA 2nd sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Available subjects:\n"+ cu.BSBAmajorSubs2ndSem + "\n" + cu.BSBAminorSubs2ndSem);
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
            cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
        }
        
        
    }

    public void Enrollment(){
        Scanner handler = new Scanner(System.in);
        System.out.println("[==== New Enrollee ====]\n");
        System.out.print("Irregular Student? (Yes/No): ");
        String choice = handler.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            Irreg();
        } 
        else if(choice.equalsIgnoreCase("no")){
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
        
        System.out.println(email+"\nProgram/Course:\nAvailable courses:\nBachelor of Science in Information Technology (BSIT)\nBachelor of Science in Business Administration (BSBA)\nBachelor of Science in Tourism Management (BSTM)\nBachelor of Multimedia Arts (BMMA)");
        System.out.print("Enter the course name (ex: BSIT): ");
            course=handler.nextLine();
        
        System.out.println("Term: 2nd");
        System.out.print("Semester: ");
            sem=handler.nextLine();

        System.out.print("Guardian Contact: ");
            guardiancontact=handler.nextLine();
        

        //BSIT 1st sem
        if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("1st")){
            System.out.println("Subjects:\n"+ cu.BSITmajorSubs1stSem + "\n" + cu.BSITminorSubs1stSem);
            System.out.println("Total tuition: "+ tc.getBSITtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));      
                }
        }
        //BSIT 2nd sem
        else if(course.equalsIgnoreCase("BSIT") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Subjects:\n"+ cu.BSITmajorSubs2ndSem + "\n" + cu.BSITminorSubs2ndSem);
            System.out.println("Total tuition: "+ tc.getBSITtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSITtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));        
                }
        }
        //BMMA 1st sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("1st")){
            System.out.println("Subjects:\n"+ cu.BMMAmajorSubs1stSem + "\n" + cu.BMMAminorSubs1stSem);
            System.out.println("Total tuition: "+ tc.getBMMAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));          
                }
        }
        //BMMA 2nd sem
        else if(course.equalsIgnoreCase("BMMA") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Subjects:\n"+ cu.BMMAmajorSubs2ndSem + "\n" + cu.BMMAminorSubs2ndSem);
            System.out.println("Total tuition: "+ tc.getBMMAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBMMAtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));     
                }
        }
        //BSTM 1st sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("1st")){
            System.out.println("Subjects:\n"+ cu.BSTMmajorSubs1stSem + "\n" + cu.BSTMminorSubs1stSem);
            System.out.println("Total tuition: "+ tc.getBSTMtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
        }
        //BSTM 2nd sem
        else if(course.equalsIgnoreCase("BSTM") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Subjects:\n"+ cu.BSTMmajorSubs2ndSem + "\n" + cu.BSTMminorSubs2ndSem);
            System.out.println("Total tuition: "+ tc.getBSTMtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSTMtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));      
                }
        }
        //BSBA 1st sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("1st")){
            System.out.println("Subjects:\n"+ cu.BSBAmajorSubs1stSem + "\n" + cu.BSBAminorSubs1stSem);
            System.out.println("Total tuition: "+ tc.getBSBAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
        }
        //BSBA 2nd sem
        else if(course.equalsIgnoreCase("BSBA") && sem.equalsIgnoreCase("2nd")){
            System.out.println("Subjects:\n"+ cu.BSBAmajorSubs2ndSem + "\n" + cu.BSBAminorSubs2ndSem);
            System.out.println("Total tuition: "+ tc.getBSBAtuition());
            System.out.print("Scholarship discount (as digits, type 0 if none): ");
                double discount = handler.nextDouble();
                if(discount==0){
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition() - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
                else {
                    System.out.print("Amount paid: ");
                        double payment = handler.nextDouble();
                    double balance = tc.getBSBAtuition(discount) - payment;
                    System.out.println("Total balance: " + balance);
                    System.out.println("Officially enrolled!");
                    cdb.StudentRecord(name, name, gender, birthdate, address, number, email, course, sem, guardiancontact, String.valueOf(balance));
                }
        }
        }
    }

    
    public void UpdateStudentRecord(){
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter student name (ex: John Doe): ");
        String input = handler.nextLine();
        System.out.print("Enter the amount paid: ");
        double payment = handler.nextDouble();
        cdb.updateBalance(input, payment);
    }


}
