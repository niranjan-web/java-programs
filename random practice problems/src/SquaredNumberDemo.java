
public class SquaredNumberDemo {
	 public static void main(String[] args) {
		 method(20);
		
	}
	 public static void method(int num)
	 {
		 int a=0,b=1,c=0;
		 
		 	while(c>0)
		 	{
		 		c = a + b;
		 		a = b;
		 		b = c;
		 		System.out.println(c);
		 		method(num-1);
		 	}	
	 }
}
