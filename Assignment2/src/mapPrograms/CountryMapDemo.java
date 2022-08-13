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

import java.util.HashMap;

public class CountryMapDemo 
{

    public static void main(String[] args) 
    { 
        System.out.println(saveCountryCapital("america","washington"));
        System.out.println(getCapital("america"));
        getCountryName("washington");

    }
    
    static HashMap<String,String> map = new HashMap<String,String>();
    
   static HashMap<String,String>saveCountryCapital(String countryName,String capital) 
    {
        map.put(countryName,capital);
        return map;
    }
   
   static void getCountryName(String countryName)
   {
       if(map.containsKey(countryName))
       {
           System.out.println(map.get(countryName));
       }
      
   }
   
   static String getCapital(String capital)
   {
       if(map.containsKey(capital))
   {
       System.out.println(map.get(capital));
   }
    return capital;
   }

}

