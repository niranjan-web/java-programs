
public class ConstructorDemo 
{

    public ConstructorDemo() 
    {
        this("hello world");
        System.out.println("super class");
    }
    ConstructorDemo(String name)
    {    
        System.out.println("hey"+name);
    }
    

    public static void main(String[] args) 
    {
        ConstructorDemo obj = new ConstructorDemo("niranjan");
        ConstructorDemo obj1 = new Demoo1();
        

    }

}
class Demoo1 extends ConstructorDemo
{
    
     Demoo1()
    {
         super();
        System.out.println("child constructor");
    }
     Demoo1(String name)
     {
         
         System.out.println(name);
     }
}