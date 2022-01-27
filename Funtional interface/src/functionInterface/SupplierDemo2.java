package functionInterface;

import java.util.function.Supplier;

/*interface Supplier<String>{
     String printStatement(String str);*/
    
//}
public class SupplierDemo2  {

    public static void main(String[] args) {
          
        Supplier obj =() -> { 
        return "hello world";};
        System.out.println(obj.get());
        
    }

   

}
