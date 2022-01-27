package collectionDemo;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Object>
{

    @Override
    public int compare(Object o1, Object o2) 
    {
        Pc obj = (Pc) o1;
        Pc obj1 = (Pc) o2;
        
        if(obj.price>obj1.price)
        {
            return 1;
        }
        else if(obj.price <obj1.price)
        {
            return -1;
        }
        return 0;
        
        
    }

}
