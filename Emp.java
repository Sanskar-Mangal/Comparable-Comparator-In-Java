public class Emp  {   //implements Comparable<Emp>   //comparable example

    private String name;
    private String phone;
    private int empId;

    

    public Emp(String name,String phone,int empId){
        this.name=name;
        this.phone=phone;
        this.empId=empId;
    }

    //Ek method hai compare to -> 2 object ke compare krne ke use ho tha hai
    // @Override
    // public int compareTo(Emp o){  // emp o  means current object
    //     return this.empId-o.empId;  
    // }

    //getter and setter access krne ke liye private variable ko class ke 

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public int getEmpId(){
        return empId;
    }

    //create to string method
    public String toString(){
        return "Emp{"+
                    "name= '" +name + '\'' +
                    ", phone= '" + phone + '\'' +
                    ", empId= "+ empId + 
                '}';   
    }
 
}
