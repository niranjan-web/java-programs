//Create an ArrayList which will be able to store only numbers 
//like int,float,double,etc, but not any other data type.

package listPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class OnlyNumbersUsingArrayList {

    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<Object>();
        
        list.add(63);
        list.add(123);
        list.add(6387476);
        list.add(63.4f);
        list.add(63655.8757);
        list.add(636558757l);
        
       Iterator<Object> itr = list.iterator();
       
       System.out.println("the numbers are:");
       while(itr.hasNext()) {
           
           System.out.println(itr.next());
        }
        
        
    }

}
