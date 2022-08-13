//synchronized arraylist
package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class SynchronizedDemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        
        Collections.synchronizedList(arr);
        
        arr.add("perl");
        arr.add("c#");
        arr.add("java script");
        arr.add("kotlin");
        arr.add("swift");
        
        synchronized (arr) {
        Iterator<String> itr = arr.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        }
    }

}
