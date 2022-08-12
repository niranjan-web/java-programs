import com.sun.tools.javac.Main;

public class FunctionalDemo implements Name,Name1{

	public static void main(String[] args) {
		
		Name obj = ()->System.out.println("hello world");
		obj.add();
		//Name obj1 = new Name();
		Name1.method();
		
		

		
	}

	public void add() {
		System.out.println("hello world");
		
	}

	
}

interface Name{
	
	 void add();
	 
	
	
	
}
interface Name1{
	
	static void method() {
		System.out.println("hello everyone i'm niranjan");
	}
}
