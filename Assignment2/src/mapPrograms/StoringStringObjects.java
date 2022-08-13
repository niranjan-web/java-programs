//Create a Collection called HashMap which is capable of storing String objects. 
//The program should have the following abilities
//a) Check if a particular key exists or not 
//b) Check if a particular value exists or not 
//c) Use Iterator to loop through the map key set
package mapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StoringStringObjects 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String,String> obj = new HashMap<String,String>();
        
        obj.put("mark", "america");
        obj.put("dwayne", "australia");
        obj.put("josh", "cuba");
        obj.put("jake", "panama");
        obj.put("logan", "argentina");
        
        Set<Entry<String, String>> set = obj.entrySet(); 
        Iterator<Entry<String, String>> itr =  set.iterator();
         
         while(itr.hasNext())
         {
             Entry<String,String> s =itr.next();
             System.out.println(s);
         }
         System.out.println();
        
         System.out.println("enter the key to search");
         String name = scan.nextLine();
         
         if(obj.containsKey(name))
         {
             System.out.println(name+" is available \n");
         }else
         {
             System.out.println(name+" is not available \n");
         }
         
         System.out.println("enter the value to search");
         String name1 = scan.nextLine();
         
         if(obj.containsValue(name1))
         {
             System.out.println(name1+" is available \n");
         }
         else
         {
             System.out.println(name1+" is not available ");
         }
         
         /*
          * while(itr.hasNext()) { Entry<String, String> s = itr.next();
          * 
          * if(itr.next().getKey().equals(name)) {
          * System.out.println(name+" is available"); break; } else {
          * System.out.println(name+"  is not available"); break; }
          * 
          * }
          */
         
         /*
          * System.out.println();
          * 
          * set = obj.entrySet(); itr = set.iterator();
          * 
          * System.out.println("enter the value to search"); String name1 =
          * scan.nextLine(); while(itr.hasNext()) { Entry<String,String> s =itr.next();
          * if(s.getValue().equals(name1)) { System.out.println(name1+"  is available");
          * break; }else { System.out.println(name1+"  is not available"); break; } }
          */
         scan.close();
    }

}
