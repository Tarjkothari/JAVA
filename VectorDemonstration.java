import java.io.*;
import java.util.*;
 
public class VectorDemonstration
{
    public static void main(String[] args)
    {
        
        Vector Student = new Vector();
 
        
        Student.add("Mobile");
        Student.add("Laptop");
        Student.add("Watch");
        Student.add("Shoes");
        Student.add("T-shirt");
        Student.add("Jeans");
       
        
        Student.add(0, "Mobile");
        System.out.println(Student);

        Student.remove("Jeans");
        System.out.println(Student);

    }
}