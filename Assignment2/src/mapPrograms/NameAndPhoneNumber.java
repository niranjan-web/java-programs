//Write a program to create a HashMap to store name and phone number (Telephone 
//book). When name is given, we can get back the corresponding phone number.
package mapPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class NameAndPhoneNumber {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("mark", 1111111);
        map.put("jeff", 2222222);
        map.put("cody", 3333333);
        map.put("loki", 4444444);
        map.put("tony", 5555555);
        
        /*
         * Set<Entry<String,Integer>> set = map.entrySet();
         * Iterator<Entry<String,Integer>> itr = set.iterator();
         */
        
        System.out.println("enter the name");
        String name = scan.nextLine();
        
        if(map.containsKey(name))
        {
            System.out.println(name+" phone number is "+ map.get(name));
        }
        /*
         * while(itr.hasNext()) { Entry<String,Integer> s = itr.next(); if(name ==
         * s.getKey()) { System.out.println(name+" phone number is "+ s.getValue());
         * break; } else { System.out.println("pls enter correct name"); break; }
         * 
         * }
         */
        scan.close();

    }

}
