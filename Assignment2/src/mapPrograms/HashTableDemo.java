//1. Develop a java class with a instance variable CountryMap HashMap (M1) add 
//a method saveCountryCapital(String CountryName, String capital) , the method 
//should add the passed country and capital as key/value in the map M1 and return 
//the Map (M1).
//Key- Country Value - Capital
//India Delhi
//Japan Tokyo
//2. Develop a method getCapital(String CountryName) which returns the capital 
//for the country passed from the Map M1 created in step 1.
//3. Develop a method getCountry(String capitalName) which returns the country 
//Map HashMap
//for the capital name passed from the Map M1 created in step 1.
//4. Develop a method which iterates through the map M1 and creates another map 
//M2 with Capital as the key and value as Country and returns the Map M2.
//Key – Capital Value – Country
//Delhi India
//Tokyo Japan
//5. Develop a method which iterates through the map M1 and creates an ArrayList 
//with all the Country names stored as keys. This method should return the 
//ArrayList.
//NOTE: You can test the methods using a main method.

package mapPrograms;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo 
{
    public static void main(String[] args) 
    {
       System.out.println(method("india","delhi"));
       System.out.println(getCountry("delhi"));  
       System.out.println(getCapital("india"));
       System.out.println(swapping());
       System.out.println(arrayList());

    }
    
    static Hashtable<String,String> hTable = new Hashtable<String,String>();
    private static Hashtable<String,String> method(String conName,String capName)
    {
        hTable.put(conName, capName);
        return hTable;
    }
    
    private static String getCapital(String conName)
    {
        return hTable.get(conName);
    }
    private static String getCountry(String capName)
    {
        
        Set<Entry<String,String>> set =  hTable.entrySet();
        Iterator<Entry<String,String>> itr =  set.iterator();
        
        while(itr.hasNext())
        {
             Map.Entry<String,String> map = itr.next();
            if(map.getValue().equals(capName))
            {
                return map.getKey();
            }
            
        }
       return null;
        
    }
    
    private static Hashtable<String,String> swapping()
    {
        Hashtable<String,String> hTable1 = new Hashtable<String,String>();//for storing the hTable elements
        
        Set<Map.Entry<String,String>> set = hTable.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();
        
        while(itr.hasNext())
        {
            Map.Entry<String,String> map = itr.next();
            hTable1.put(map.getValue(), map.getKey());
        }
        return hTable1;
    }
    
    private static ArrayList<String> arrayList()
    {
        
        ArrayList<String> list = new ArrayList<String>();
        
        Set<Map.Entry<String,String>> set = hTable.entrySet();
        Iterator<Map.Entry<String,String>> itr = set.iterator();
        
        while(itr.hasNext())
        {
            Map.Entry<String,String> map = itr.next();
            list.add(map.getKey());
            list.add(map.getValue());

        }
        return list;
        
    }
}
