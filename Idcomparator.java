import java.util.Comparator;

public class Idcomparator implements Comparator<Emp> {   //yhe java.util package mai hai
                
    public int compare(Emp o1,Emp o2){                     //comparator example
        return o1.getEmpId()-o2.getEmpId();
    }
}
