//abstract demo program
package oops;
public class AbstractDemo {

	public static void main(String[] args) {
		Teacher obj = new Teacher();
		Student obj1 =new Student();
		obj.method();
		obj1.message();
//		String name =obj.getName("niranjan");
//		System.out.println(name);
//		String name1 =obj.setName("hello niranjan");
//		System.out.println(name1);
		
		Member[] m = new Member[4];
		m[0] = new Teacher();
		m[1] = new Teacher();
		m[2] = new Student();
		m[3] = new Student();
		
		for(Member m1: m) {
			m1.message();
		}
}
}

abstract class Member{
	
		public String name;
		abstract void message();
		public void method() {
			System.out.println("this is in the abstract class normal method!");
			}
//		String getName(String name) {
//			return name;
//	}
//		String setName(String name1) {
//			return name1;
//		}
}

class Student extends Member{
	String name ="niranjan";
	public void message() {
		System.out.println("this is student class....");
	}
}
class Teacher extends Member{
	
	public void message() {
		System.out.println("this is teacher class....");
	}
	
}
	
