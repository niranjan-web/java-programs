package functionInterface;

public class NewLamdaDemo {
	public static void main(String[] args) {
		name obj = (num,num1) -> System.out.println(num + num1);
		obj.method(2, 4);
		
		obj.method1();
		
	}
}


interface name
{
	void method(int num,int num1);
	default void method1() {
		System.out.println("hey buddy");
	}
}
