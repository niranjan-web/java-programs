//List interface demo
package java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public  class ListDemo  {

    public static void main(String[] args) {
        
        //Arraylist with string demo
        System.out.println("-----------ArrayList--------------");
        ArrayList<String> obj = new ArrayList<String>();  //List<String> obj = new ArrayList<String>();        
        obj.add("conor");
        obj.add("dustin");      
        obj.add("max");
        obj.add("hamilton");
        obj.add("charles");
        System.out.println("the size of the array : "+ obj.size()+"\n");
        
        obj.forEach((e)->System.out.print(e + "," ));//lamda expression
        System.out.println();
//        for(Object obj1:obj ) 
//        {
//            System.out.println(obj1);
//        }
        
        //Arraylist with Integer demo
        List<Integer> obj2 = new ArrayList<Integer>();
        
        obj2.add(31);
        obj2.add(523);
        obj2.add(334);
        obj2.add(69);
        obj2.add(54);
        
        Integer result = obj2.get(1)+obj2.get(2);
        System.out.println(result+"\n");
        
        //Iterator interface demo
        Iterator<Integer> itr = obj2.iterator();
        while(itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
        System.out.println();
        
        //linked list demo
        System.out.println("-----------LinkedList--------------");
        List<String> obj3 = new LinkedList<String>();
        
        obj3.add("iron man");
        obj3.add("captain america");
        obj3.add("hulk");
        obj3.add("thor");
        obj3.add("loki");
        
        for(Object obj4:obj3) 
        {
            System.out.println(obj4);
        }
        
        //vector demo
        System.out.println("-----------Vector--------------");
        List<Character> myObj = new Vector<Character>();
        
        myObj.add('r');
        myObj.add('u');
        myObj.add('g');
        myObj.add('b');
        myObj.add('y');
        
        myObj.forEach((e)->System.out.print(e));
        
        
        
    }
}
