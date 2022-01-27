package newdemo;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
       Supplier<String> obj = () -> {return "hello world";};
       System.out.println(obj.get());

    }

}
