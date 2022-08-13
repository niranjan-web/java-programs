//Create Collection called TreeSet which is capable of storing String objects. 
//The Collection should have the following capabilities
//a)Reverse the elements of the Collection 
//b)Iterate the elements of the TreeSet 
//c) Checked if a particular element exists or not
package setPrograms;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> obj = new TreeSet<String>();
        
        obj.add("randy");
        obj.add("john");
        obj.add("kane");
        obj.add("romen");
        obj.add("caeser");
        
        System.out.println("----------ascending order------------");
        Iterator<String> itr = obj.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
        
      Iterator<String> itr1 = obj.descendingIterator();
     
          
      System.out.println("----------descending order------------");
      while(itr1.hasNext())
      {
          System.out.println( itr1.next());
      }
      System.out.println();
      
      //check wheather name is avialble or not
      System.out.println("enter the name to search ");
      String name = scan.next();
      
      if(obj.contains(name))
      {
          System.out.println(name+" is avilable in the set");
      }else
      {
          System.out.println(name+" is not avilable in the set");
      }

      scan.close();
    }
    
}
