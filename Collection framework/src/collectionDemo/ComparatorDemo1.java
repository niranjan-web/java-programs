package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo1 {

    public static void main(String[] args) {
        
        ArrayList<Movies> list = new ArrayList<>();
        ComparatorDemo2 cd= new ComparatorDemo2();
        
        list.add(new Movies("schindler's list","steven speilberg","liam neesam",1991));
        list.add(new Movies("titanic","james camoron","dicaprio",1999));
        list.add(new Movies("avengers end game","russo brothers","robert dowey",2019));
        list.add(new Movies("interstellar","nolan","mathew",2014));
        list.add(new Movies("inception","nolan","dicaprio",2009));
        
        Collections.sort(list,cd);
        for(Movies res : list)
            System.out.println(res);
        
    }

}
class Movies{
    
    String moviesName;
    String directorName;
    String actorName;
    int year;
    
    public Movies(String moviesName, String directorName, String actorName, int year) {
      
        this.moviesName = moviesName;
        this.directorName = directorName;
        this.actorName = actorName;
        this.year = year;
        
        
    }
    @Override
    public String toString() {
        return "Movies [moviesName=" + moviesName + ", directorName=" + directorName + ", actorName=" + actorName
                + ", runTime=" + year + "]";
    }
    
    
}