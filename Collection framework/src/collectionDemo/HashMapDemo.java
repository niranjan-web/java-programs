package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {

    public static void main(String[] args) {
       Map<Integer,String> obj = new HashMap<Integer,String>();
       obj.put(1,"niranjan");
       obj.put(2,"mark");
       
       Set<Map.Entry<Integer,String>> s =  obj.entrySet();
       
       Iterator<Map.Entry<Integer,String>> itr = s.iterator();
       
       while(itr.hasNext())
       {
          Object o = itr.next();
        Map.Entry<Integer,String> entry = (Map.Entry) o;
         System.out.println(entry.getKey()+" "+entry.getValue());
          System.out.println(o);
          
       }

    }

}
