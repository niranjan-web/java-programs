package functionInterface;
import java.util.function.Consumer;

class ConsumerDemo{
    class ConsumerDemo1 implements Consumer<String>
    {
        public  void accept(String str) 
        {
            System.out.println(str);
        }  
     }
    public static void main(String[] args) {
       Consumer<String> obj = (str)-> System.out.println(str);
       obj.accept("hello learners...");
       
       
       Consumer<String > obj1 = (str1)-> System.out.println("hello learners "+str1);
       obj1.accept("hello learners...");
       
    
       
        obj.andThen(obj1).accept("whats'up");
//        ConsumerDemo1 obj = new ConsumerDemo1();
//        obj.accept("hello learners");

    }
}