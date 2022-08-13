//Develop a java class with a instance variable CountryMap HashMap (M1) 
//* add a method saveCountryCapital(String CountryName, String capital) , 
//* the method should add the passed country and capital as key/value in the map M1 and return the 
//Map (M1).
//Key- Country Value - Capital
//India Delhi
//Japan Tokyo
//2. Develop a method getCapital(String CountryName) which returns the capital for the country passed 
//from the Map M1 created in step 1.
//3. Develop a method getCountry(String capitalName) which returns the country for the capital name 
//passed from the Map M1 created in step 1.
//4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as 
//the key and value as Country and returns the Map M2.
//Key – Capital Value – Country
//Delhi India
//Tokyo Japan
//5. Develop a method which iterates through the map M1 and creates an ArrayList with all 
//the Country names stored as keys. This method should return the ArrayList.
//NOTE: You can test the methods using a main method
package listPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMapDemo 
{

    public static void main(String[] args) 
    {
        CountryMapDemo obj = new CountryMapDemo();
        
        System.out.println(obj.saveCountryCapital("india","delhi"));
        System.out.println(obj.getCapital("india"));
        System.out.println(obj.getCountry("delhi"));
        System.out.println(obj.swapping());
        System.out.println(obj.arrayList());

    }
    HashMap<String,String> map = new HashMap<String,String>();

    public HashMap<String,String> saveCountryCapital(String countryName, String capital)
    {
        map.put(countryName, capital);
        return map; 
    }
    
    public String getCapital(String countryName)
    {
       return map.get(countryName);
      
    }
    
    public String getCountry(String capital)
    {
        Set<Entry<String, String>> set = map.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();
        
        while(itr.hasNext())
        {
            Map.Entry<String, String> map = itr.next();
            if(map.getValue().equals(capital))     //value -->country name, key -->capital, delhi == delhi
            {
             return map.getKey();   
            }
        }
        return null;
    }
    
    public HashMap<String,String> swapping()
    {
        
     HashMap<String,String> map = new HashMap<String,String>();//for storing map1 in map
    Set<Entry<String, String>> set = map.entrySet();
    Iterator<Entry<String, String>> itr = set.iterator();
    
    while(itr.hasNext()) 
    {
        Map.Entry<String, String> map1 =  itr.next();
        map.put(map1.getValue(), map1.getKey());
    }
    return map;
    
    }
    
    public ArrayList<String> arrayList() 
    {
        ArrayList<String> list = new ArrayList<>();
        
        Set<Entry<String, String>> set = map.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();
        
        while (itr.hasNext()) 
        {
            /*Map.Entry<String, String> map*/  itr.next();
            list.add(itr.next().getKey());
            list.add(itr.next().getValue());
        }
        
        return list;
    }

}
