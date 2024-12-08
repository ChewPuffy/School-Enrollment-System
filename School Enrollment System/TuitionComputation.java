import java.util.ArrayList;

public class TuitionComputation extends CourseUNITS{
    double BSIT = (BSITunits * 1000) + 7854;
    double BMMA = (BMMAunits * 1000) + 7854;
    double BSTM = (BSTMunits * 1000) + 7854;
    double BSBA = (BSBAunits * 1000) + 7854;
    
    //REGULAR STUDENTS COMPUTATION 
    public double getBSITtuition(){
        return BSIT;  
    }

    public double getBMMAtuition(){
        return BMMA;  
    }

    public double getBSTMtuition(){
        return BSTM; 
    }
    
    public double getBSBAtuition(){
        return BSBA;   
    }


    //REGULAR STUDENTS COMPUTATION WITH DISCOUNT/SCHOLARSHIP
    public double getBSITtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = BSIT * discountdecimal;
        return BSIT - discount;  
    }

    public double getBMMAtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = BMMA * discountdecimal;
        return BMMA - discount;  
    }

    public double getBSTMtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = BSTM * discountdecimal;
        return BSTM - discount; 
    }
    
    public double getBSBAtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = BSBA * discountdecimal;
        return BSBA - discount;   
    }

    //IRREGULAR STUDENTS COMPUTATIONS
    public double BSITtuition(ArrayList<String> subjects){
        double totalUNITS = 0;
        
        for(String subject : subjects){
            if(BSITmajorSubs1stSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs1stSem.contains(subject)){
                if(BSITminorSubs1stSem.get(2).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
            else if(BSITmajorSubs2ndSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs2ndSem.contains(subject)){
                if(BSITminorSubs1stSem.get(1).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
        }

        return (totalUNITS * 1000) + 7854;
    }

    public double BMMAtuition(ArrayList<String> subjects){
        double totalUNITS = 0;

        for(String subject : subjects){
            if(BSITmajorSubs1stSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs1stSem.contains(subject)){
                if(BSITminorSubs1stSem.get(2).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
            else if(BSITmajorSubs2ndSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs2ndSem.contains(subject)){
                if(BSITminorSubs1stSem.get(2).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
        }

        return (totalUNITS * 1000) + 7854;
    }

     public double BSTMtuition(ArrayList<String> subjects){
        double totalUNITS = 0;

        for(String subject : subjects){
            if(BSITmajorSubs1stSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs1stSem.contains(subject)){
                if(BSITminorSubs1stSem.get(1).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
            else if(BSITmajorSubs2ndSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs2ndSem.contains(subject)){
                if(BSITminorSubs1stSem.get(1).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
        }
        
        return (totalUNITS * 1000) + 7854;
    }

     public double BSBAtuition(ArrayList<String> subjects){
        double totalUNITS = 0;

        for(String subject : subjects){
            if(BSITmajorSubs1stSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs1stSem.contains(subject)){
                if(BSITminorSubs1stSem.get(3).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
            else if(BSITmajorSubs2ndSem.contains(subject)){
                totalUNITS+=3;
            } 
            else if(BSITminorSubs2ndSem.contains(subject)){
                if(BSITminorSubs1stSem.get(2).equals(subject)){
                    totalUNITS+=2;
                } else {
                    totalUNITS+=3;
                }
            } 
        }
       
        return (totalUNITS * 1000) + 7854;
    }
}
