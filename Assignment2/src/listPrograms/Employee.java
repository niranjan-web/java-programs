//Create an Employee class with the related attributes and 
//behaviours. Create one more class EmployeeDB which has the 
//following methods. a. boolean addEmployee(Employee e) b. 
//boolean deleteEmployee(int eCode) c. String showPaySlip(int 
//eCode) d. Employee[] listAll() Use an ArrayList which will be 
//used to store the emplyees and use enumeration/iterator to 
//process the employees. Write a Test Program to test that all 
//functionalities are operational.
package listPrograms;

import java.util.ArrayList;
import java.util.Iterator;


public class Employee {
    String name;
    int age;
    
    Employee(String name, int age){
        this.age = age;
        this.name = name;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) 
    {
        Employee myObj = new Employee("brock",22);
        System.out.println("employee name is "+ myObj.name+" "+"and his age is "+ myObj.age);
        
        ArrayList obj1 = new ArrayList();
        EmployeeDB obj = new EmployeeDB();
       
        obj1.add(obj.addEmployee(myObj));
        obj1.add(obj.deleteEmployee(12345));
        obj1.add(obj.showPaySlip(20_000));
        
        Iterator itr = obj1.iterator();
        while(itr.hasNext()) {
            
            System.out.println(itr.next());
        }
    }
   
}

class EmployeeDB{
    boolean addEmployee(Employee obj) 
    {
        return true;
    }
    boolean deleteEmployee(int eCode) 
    {
        return true;
    }
    String showPaySlip(int eCode) 
    {
        return "your pay slip is here "+ eCode;
    }
    
}
