//Develop a java class with a instance variable Country HashSet (H1) add a 
//method saveCountryNames(String CountryName) , the method should add the passed 
//country to a HashSet (H1) and return the added HashSet(H1).
//Develop a method getCountry(String CountryName) which iterates through the 
//HashSet and returns the country if exist else return null. 
//NOTE: You can test the methods using a main method.

package setPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class CountryProgram 
{

    public static void main(String[] args) 
    {
        CountryProgram obj = new CountryProgram();
        obj.saveCountryNames("USA");
        obj.saveCountryNames("india");
        obj.saveCountryNames("dubai");
        obj.saveCountryNames("spain");
        
        System.out.println(obj.getCountry("USA"));
        System.out.println(obj.getCountry("india"));
        System.out.println(obj.getCountry("dubai"));
        System.out.println(obj.getCountry("korea"));
        

    }
    HashSet<String> set = new HashSet<>();
    
        public HashSet<String> saveCountryNames(String CountryName) 
        {
            set.add(CountryName);
            return set;
    }
    
        public String getCountry(String CountryName) 
        {
            Iterator<String> itr = set.iterator();
        
            while (itr.hasNext()) 
            {
                if (itr.next().equals(CountryName))
                    return CountryName;
            }
        
            return null;
    }
}
