//Write a program that will have a Properties class which is capable of storing 
//some States of India and their Capital. Use an Iterator to list all the 
//elements of the Properties.

package mapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class StatesOfIndia 
{

    public static void main(String[] args) 
    {
         HashMap<String,String> map = new HashMap<String,String>();
        
         map.put("tamil nadu", "chennai");
         map.put("Delhi", "agra");
         map.put("maharashtra", "mumbai");
         map.put("west bengal", "kolkata");
         map.put("kerala", "thiruvananthapuram");
        
         
         Set<Entry<String,String>> set = map.entrySet();
         Iterator<Entry<String,String>> itr = set.iterator();
         
         while(itr.hasNext())
         {
             Entry<String, String> set1 =  itr.next();
             System.out.println(set1);
         }
         
         

    }

}
