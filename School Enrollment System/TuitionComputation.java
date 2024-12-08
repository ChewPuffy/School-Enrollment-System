public class TuitionComputation extends CourseUNITS{
    
    public int BSITRegularTuition(int discount){
       return BSITunits * 1000 - discount;  
    }

    public int BMMARegularTuition(int discount){
       return BMMAunits * 1000 - discount;  
    }

    public int BSTMRegularTuition(int discount){
       return BSTMunits * 1000 - discount;  
    }
    
    public int BSBARegularTuition(int discount){
       return BSBAunits * 1000 - discount;  
    }

}
