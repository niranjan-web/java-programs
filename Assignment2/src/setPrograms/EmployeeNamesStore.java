//Write a program to store a group of employee names into a HashSet, retrieve 
//the elements one by one using an Iterator.
package setPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeNamesStore {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        
        System.out.println("hashset print in a random order \n");
        set.add("calvin");
        set.add("harris");
        set.add("jackson");
        set.add("donold");
        set.add("abel tesfaye");
        set.add("abel tesfaye");//duplicate
        
        
        Iterator<String> itr = set.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        

    }

}
