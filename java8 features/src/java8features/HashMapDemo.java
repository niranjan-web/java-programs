package java8features;

import java.util.*;

public class HashMapDemo {

   
    public static void main(String[] args) {
        Map<String,Integer> obj = new HashMap<String,Integer>();
        HashMapDemo myObj = new HashMapDemo();
        
        
        
        
        obj.put("alan", 10);
        obj.put("bezos", 20);
        obj.put("derrick", 30);
        obj.put("cristiano", 40);
        obj.put("", 50);
        obj.put("mansa musa", 60);
        
       // obj.forEach((e,t)->System.out.println(e+" :"+t));
        System.out.println("hashMap: \n"+ obj);
        System.out.println();

        
        Map<String,Integer> obj1 = new TreeMap<String,Integer>();
        
        obj1.put("elon", 90);
        obj1.put("bezos", 20);
        obj1.put("warren", 30);
        obj1.put("mark", 40);
        obj1.put("mansa musa", 50);
        obj1.put("mansa musa", 60);
        
        //obj.forEach((e1,t1)->System.out.println(e1+" :"+t1));
        System.out.println("TreeMap: \n"+ obj1);
        System.out.println();
        
        
        Map<String,Integer> obj2 = new LinkedHashMap<String,Integer>();
        
        obj2.put("elon", 20);
        obj2.put("bezos", 10);
        obj2.put("warren", 30);
        obj2.put("mark", 40);
        obj2.put("mansa musa", 50);
        obj2.put("mansa musa", 60);
        
        //obj.forEach((e2,t2)->System.out.println(e2+" :"+t2));
        System.out.println("LikedHashMap: \n"+ obj2);

        
    }

}
