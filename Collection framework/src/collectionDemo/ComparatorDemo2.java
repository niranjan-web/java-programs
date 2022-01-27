package collectionDemo;

import java.util.Comparator;

public class ComparatorDemo2 implements Comparator<Movies> {

    @Override
    public int compare(Movies o1, Movies o2) {
        
 
        if(o1.year>o2.year)
            return -1;
        else if(o1.year<o2.year)
            return 1;
        else
        return 0;
    }

}
