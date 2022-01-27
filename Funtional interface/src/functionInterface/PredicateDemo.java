package functionInterface;
import java.util.function.Predicate;

public class PredicateDemo {
    
    public static void main(String args[]) {
        
        Predicate<Integer> obj = (t) ->
        {
                    if(t % 2 == 0)
                        return true;
                    else
                        return false;
        };
        System.out.println(obj.test(10));
       
    }
}      
    


