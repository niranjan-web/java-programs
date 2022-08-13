//Develop a java class with a instance variable Country treeset (H1) add a 
//method saveCountryNames(String CountryName) , the method should add the passed 
//country to a treeset (H1) and return the added treeset(H1).
//Develop a method getCountry(String CountryName) which iterates through the 
//HashSet and returns the country if exist else return null. 
//NOTE: You can test the methods using a main method.

package setPrograms;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCountry {

    public static void main(String[] args) {
        saveCountryName("USA");
        saveCountryName("india");
        saveCountryName("dubai");
        saveCountryName("spain");    
        
        System.out.println(getCountry("USA"));
        System.out.println(getCountry("india"));
        System.out.println(getCountry("dubai"));
        System.out.println(getCountry("korea"));

    }
    
    static TreeSet<String> set = new TreeSet<String>();
    static TreeSet<String> saveCountryName(String countryName)
    {
        set.add(countryName);
        return set;
    }
    
    public static String getCountry(String countryName)
    {
        Iterator<String> itr = set.iterator();
        
        while(itr.hasNext())
        {
            if(itr.next().equals(countryName));
            {
                return countryName;
            }
        }
        return null;
    }

}
