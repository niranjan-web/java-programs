//Create an ArrayList which will be able to store only Strings. 
//Create a printAll method which will print all the elements 
//using an Iterator.

package listPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class StoreOnlyStrings 
{
    
    public static void main(String[] args) 
    {
       printAll();
    }
    
    static ArrayList<String> list = new ArrayList<String>();
   
        static  void  printAll() 
       {
          list.add("bill gates");
          list.add("elon musk");
          list.add("mark zuckerberg"); 
          list.add("jeff bezos");
          list.add("larry page");
         
        Iterator<String> itr = list.iterator();
        
        while(itr.hasNext()) 
        {
          System.out.println(itr.next());  
         }
       
    }

}