//Set interface demo
package java8features;
import java.util.*;
public class SetDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("-----------HashSet--------------");
        Set<String> obj = new HashSet<String>();
        
        obj.add("bat man");
        obj.add("aqua man");
        obj.add("cyborg");
        obj.add("flash");
        obj.add("super man");
        obj.add("bat man");//duplicate value
        obj.add("super man");//duplicate value
        
        //Iterator interface Demo
        Iterator<String> itr = obj.iterator();
        
        while(itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
        System.out.println(obj.contains("super man"));
        
        System.out.println();
        
        //Hashset demo
        HashSet<Integer> obj1 = new  HashSet<Integer>();
        
        obj1.add(34);
        obj1.add(341);
        obj1.add(634);
        obj1.add(5364);
        obj1.add(34);//dublicate value
        
        obj1.forEach((lObj)-> System.out.println(lObj));
        
        //Linkedhashset demo->sorting in ascending order
        System.out.println("-----------LinkedHashSet--------------");
        LinkedHashSet<Integer> obj2 = new  LinkedHashSet<Integer>();
        
        obj2.add(34);
        obj2.add(341);
        obj2.add(634);
        obj2.add(5364);
        obj2.add(34);//dublicate value
        
        obj2.forEach((lObj1)-> System.out.println(lObj1));
        
        
        System.out.println("-----------TreeSet--------------");
        Set<Integer> myObj = new TreeSet<Integer>();
        myObj.add(6);
        myObj.add(7);
        myObj.add(8);
        myObj.add(5);
        myObj.add(4);
        
        myObj.forEach((e)->System.out.println(e));
      

    }

}
