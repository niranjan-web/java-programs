//same program using treemap
package mapPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountryMapUsingTreeMap
{

    public static void main(String[] args) 
    {
        /*
         * CountryMapUsingTreeMap obj = new CountryMapUsingTreeMap();
         * System.out.println(obj.method("india","delhi"));
         * System.out.println(obj.capital("india"));
         * System.out.println(obj.countryName("delhi"));
         */

        CountryMapUsingTreeMap obj = new CountryMapUsingTreeMap();
        System.out.println(obj.saveCountryCapital("india", "delhi")+"\n");
        System.out.println("country is "+obj.getCountry("delhi")+"\n");
        System.out.println("capital is "+obj.getCapital("india")+"\n");
        System.out.println("the arraylist representation of map is "+obj.arrayList()+"\n");
        System.out.println("after swapping \n");
        System.out.println(obj.swapping());

    }
    
        public TreeMap<String, String> map = new TreeMap<String, String>();
        
        public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) 
        {
            map.put(CountryName, capital);
            return map;
        }
        
        public String getCapital(String CountryName) 
        {
            return map.get(CountryName);
        }
        
        public String getCountry(String capitalName) 
        {
           //return map.get(capitalName);

            Set<Entry<String, String>> set = map.entrySet();
            Iterator<Entry<String, String>> itr = set.iterator();
            
            while (itr.hasNext()) 
            {
                Entry<String, String> map = itr.next();
                
                if (map.getValue().equals(capitalName))
                    return map.getKey();
            }
            
            return null;
        }
        public TreeMap<String, String> swapping() 
        {
            TreeMap<String, String> map1 = new TreeMap<String, String>();
            
            Set<Entry<String, String>> set = map.entrySet();
            Iterator<Entry<String, String>> itr = set.iterator();
            
            while (itr.hasNext()) 
            {
                Map.Entry<String, String> map = itr.next();
                map1.put(map.getValue(), map.getKey());
            }
            
            return map1;
        }
        
        public ArrayList<String> arrayList() 
        {
            ArrayList<String> list = new ArrayList<>();
            
            Set<Entry<String, String>> set = map.entrySet();
            Iterator<Entry<String, String>> itr = set.iterator();
            
            while (itr.hasNext()) 
            {
                Map.Entry<String, String> map = itr.next();
                list.add(map.getKey());
                list.add(map.getValue());
            }
            
            return list;
        }
} 
    
    /*
     * TreeMap<String,String> map = new TreeMap<String,String>(); private
     * TreeMap<String,String> method(String countryName,String capital ) {
     * map.put(countryName, capital); return map; }
     * 
     * private String countryName(String countryName) {
     * if(map.containsKey(countryName)) { return map.get(countryName); } return
     * countryName; } private String capital(String capital) {
     * if(map.containsKey(capital)) { return map.get(capital); } return capital; }
     */

