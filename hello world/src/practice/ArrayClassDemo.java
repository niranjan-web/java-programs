package practice;

public class ArrayClassDemo {
	String name;
	public ArrayClassDemo(String name) {
		this.name = name;
		
	}

	public static void main(String[] args) {
		ArrayClassDemo obj = new ArrayClassDemo("niranjan");
		ArrayClassDemo obj1 = new ArrayClassDemo("gobika");
		ArrayClassDemo obj2 = new ArrayClassDemo("latha");
		
		ArrayClassDemo[] ar =  new ArrayClassDemo[] {obj1,obj,obj2};
		
		
		}
}

