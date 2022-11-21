package functionInterface;

public class LamdaDemo1 {

    public static void main(String[] args) {
        /*
         * Hello obj = ()->System.out.println("hello world"); obj.method();
         */

        Hello obj1 = new Hello() {
            public void method() {
                System.out.println("hello helo");
            }

        };
        obj1.method();

    }

}
@FunctionalInterface
interface Hello {

    void method();
    
    
    default void method1()
    {
    	System.out.println("hello");
    }
}
