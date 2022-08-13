package functionInterface;

public class SupplierDemo {

    public static void main(String[] args) 
    {
        
        SupplierInterface obj = (str)-> {return str;};
       System.out.println(obj.get("hello learners from supplier interface"));
    }

}

 class Supplier1 implements SupplierInterface
{
    public String get(String name) 
    {
        return name;
    }
}