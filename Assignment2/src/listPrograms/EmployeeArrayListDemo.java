//Create an ArrayList of Employee( id,name,address,sal) objects 
//and search for particular Employee object based on id number.
package listPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArrayListDemo {
    
    int id;
    String name;
    String address;
    int salary;
    
    EmployeeArrayListDemo(int id, String name, String address, int salary) //constructor for intialize my instance variable
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    
       public String toString() //to override th tostring method
       {
            return "Employee id:" + id + "\n"+" name:" + name + "\n"+" address:" + address + "\n"+" salary:" + salary + "\n"+"";
        }

    public static void main(String[] args) 
    {
        ArrayList<EmployeeArrayListDemo> list = new ArrayList<EmployeeArrayListDemo>();//here i give class object as a generics
        
        
        list.add(new EmployeeArrayListDemo(141,"Elon","2321, Los Vegas.",100000));
        list.add(new EmployeeArrayListDemo(142,"Mark","2322, Spain.",40000));
        list.add(new EmployeeArrayListDemo(143,"Alex","2323, New York.",50000));
        list.add(new EmployeeArrayListDemo(144,"Jeff","2324, Sydney",60000));
        list.add(new EmployeeArrayListDemo(145,"Chris","2325, Manchester",70000));
        
        Iterator<EmployeeArrayListDemo> itr = list.iterator();
        
        while(itr.hasNext()) 
        {
        
            System.out.println(itr.next());
        }
        
       
    }

   


   

}
