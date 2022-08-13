package functionInterface;

public class AnonymousClassDemo {

    public static void main(String[] arguments) {
        If obj = (num) -> System.out.println("hello"+ num);
        obj.method(8);
    }
}