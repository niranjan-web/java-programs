package doselect;

import java.util.HashSet;
import java.util.Set;

public class VowelsConsonantsDemo 
{

    public static void main(String[] args) 
    {
        Alphabets obj = new Alphabets();
        System.out.println(obj.uniqueVowels("niranjan learner"));
        System.out.println(obj.uniqueConsonants("niranjan learner"));
                                                   
    }

}
class Alphabets 
{
    public int uniqueVowels(String str)
    {
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' )
            {
                set.add(str.charAt(i));
            }
        }
        return set.size();
    }
    
    public int uniqueConsonants(String str)
    {
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                set.add(str.charAt(i));
            }
        }
        return set.size();

    }
}
