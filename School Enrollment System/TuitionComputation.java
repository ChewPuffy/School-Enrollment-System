public class TuitionComputation extends CourseUNITS{
    
    //REGULAR STUDENTS COMPUTATION 
    public double BSITtuition(){
        return BSITunits * 1000;  
    }

    public double BMMAtuition(){
        return BMMAunits * 1000;  
    }

    public double BSTMtuition(){
        return BSTMunits * 1000; 
    }
    
    public double BSBAtuition(){
        return BSBAunits * 1000;   
    }


    //REGULAR STUDENTS COMPUTATION WITH DISCOUNT/SCHOLARSHIP
    public double BSITtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = (BSITunits * 1000) * discountdecimal;
        return (BSITunits * 1000) - discount;  
    }

    public double BMMAtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = (BMMAunits * 1000) * discountdecimal;
        return (BMMAunits * 1000) - discount;  
    }

    public double BSTMtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = (BSTMunits * 1000) * discountdecimal;
        return (BSTMunits * 1000) - discount; 
    }
    
    public double BSBAtuition(double discountpercent){
        double discountdecimal = discountpercent / 100;
        double discount = (BSBAunits * 1000) * discountdecimal;
        return (BSBAunits * 1000) - discount;   
    }

    //IRREGULAR STUDENTS COMPUTATIONS
    public double BSITtuition(String[] subjects){
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

        return totalUNITS * 1000;
    }

    public double BMMAtuition(String[] subjects){
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

        return totalUNITS * 1000;
    }

     public double BSTMtuition(String[] subjects){
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
        
        return totalUNITS * 1000;
    }

     public double BSBAtuition(String[] subjects){
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
       
        return totalUNITS * 1000;
    }
}
