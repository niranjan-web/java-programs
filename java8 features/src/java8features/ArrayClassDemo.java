//comparator interface demo
package java8features;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayClassDemo
{
    /*
     * String name; public ArrayClassDemo(String name) { this.name=name; }
     */

    public static void main(String[] args) 
    {
        ComparatorDemo cd = new ComparatorDemo();
        ComparatorDemo1 cd1 = new ComparatorDemo1();
        
        /*
         * ArrayClassDemo a1 = new ArrayClassDemo("elon"); ArrayClassDemo a2 = new
         * ArrayClassDemo("warren"); ArrayClassDemo a3 = new ArrayClassDemo("mark");
         * ArrayClassDemo a4 = new ArrayClassDemo("garyvee"); ArrayClassDemo a5 = new
         * ArrayClassDemo("larry");
         * ArrayClassDemo[] arr = {a1,a2,a3,a4,a5};
         */
        String[] names = {"elon","warren buffet","jeff bezos","larry page"};
        
        Arrays.sort(names, cd);
        
        for(String name:names) 
        {
            System.out.println(name);
        }
        System.out.println();

        Arrays.sort(names, cd1);
        for(String name:names) 
        {
            System.out.println(name);
        }
       
    }
}

//for ascending and descending using length
 class ComparatorDemo implements Comparator <Object>
 {
    @Override
    public int compare(Object o1, Object o2) 
    {
        String str = (String) o1;
        String str1 = (String) o2;
        
        //int result = str.compareTo(str1);
        
        if(str.length()>str1.length()) 
        {
            return -1;
        }else if(str.length()<str1.length())
        {
            return 1;
        }else 
        { 
            return 0;
        }
       
    }
}

//for ascending and descending using alphabetical order
 class ComparatorDemo1 implements Comparator<Object> 
 {
     @Override
     public int compare(Object o1, Object o2) 
     {
         String str = (String) o1;
         String str1 = (String) o2;
         
         int result = str.compareTo(str1);
         
         if(result >0) 
         {
             return 1;
         }
         else if(result <0)
         {
             return -1;
         }else 
         {
             return 0;
         }
      }
 }
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 