package functionInterface;
import java.util.function.Consumer;

class ConsumerDemo1 implements Consumer<String>
{
    public  void accept(String str) 
    {
        System.out.println(str);
    }  
 }