//interface demo program
package oops;
public class InterfaceEx {

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		obj.method2();
		obj.method1();
		System.out.println(obj.method3(9, 10));
	}

}

interface Inf1{
	   public void method1();
	}
	interface Inf2 extends Inf1 {
	   public void method2();
	}
	
	class Demo implements Inf2{
	   
	    public void method1(){
		System.out.println("this is method1");
	    }
	    public void method2(){
		System.out.println("this is method2");
	    }
	    public static void main(String args[]){
		
	    }
	}
	class Demo1 extends Demo {
		
		int num;
		int num1;
		int num2;
		
		public int method3(int num1,int num2) {
			return num1 +num2;
		}
		
	}
	class Demo2 implements Inf1{

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	