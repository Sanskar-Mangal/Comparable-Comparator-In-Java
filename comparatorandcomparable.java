import java.util.ArrayList;
//import java.util.Collections;
import java.util.Collections;

public class comparatorandcomparable{
    public static void main(String[] arr){

        ArrayList<Emp> emps=new ArrayList<Emp>();

        emps.add(new Emp("Sanskar","654785",12));
        emps.add(new Emp("Keshav","621455",11));
        emps.add(new Emp("Piyush","987455",14));

        System.out.println("Unsorted:");
        System.out.println(emps);


       // Sort the emps ArrayList using the Comparable interface
       // Collections.sort(emps);
        System.out.println();
        // System.out.println("Sorted by Emp ID:");
        // System.out.println(emps);


        //comparator example sort by id
        Collections.sort(emps,new Idcomparator());
        System.out.println(emps);


        //create new object arraylist sort by name
        System.out.println();
        ArrayList<Emp> emp1=new ArrayList<>(emps);
        Collections.sort(emp1, new Namecomparator());
        System.out.println(emp1);


    }
}