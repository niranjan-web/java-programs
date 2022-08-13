//Write a program that will have a Vector which is capable of 
//storing emp objects. Use an Iterator and enumeration to list 
//all the elements of the Vector.

package listPrograms;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVectorDemo 
{

    String name;
    int id;
    String address;
    int salary;
    EmployeeVectorDemo(String name,int id,String address,int salary)
    {
        this.name = name;
        this.id = id;
        this.address = address;
        this.salary = salary;
        
    }
    
    public String toString() 
    {
        return "Employee id:" + id + "\n"+" name:" + name + "\n"+" address:" + address + "\n"+" salary:" + salary + "\n"+"";
        
    }
    
    public static void main(String[] args) 
    {
        
        Vector<EmployeeVectorDemo> vector = new Vector<EmployeeVectorDemo>();
        
        vector.add(new EmployeeVectorDemo("bruce",001,"china",20000));
        vector.add(new EmployeeVectorDemo("leo",001,"argentina",40000));
        vector.add(new EmployeeVectorDemo("brad",001,"singapore",60000));
        vector.add(new EmployeeVectorDemo("jimmy",001,"dubai",80000));
        vector.add(new EmployeeVectorDemo("nolan",001,"canada",100000));

        Iterator<EmployeeVectorDemo> itr = vector.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }

}
