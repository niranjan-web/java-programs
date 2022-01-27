package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		Shape obj = new Shape();
		 obj.area(20);
		 obj.area(15,10);
		 obj.area(3.14f, 16);
	}

}
	class Shape
		{
			public void area(int side) 
			{
				 int result = side*side;
				 System.out.println("Area of Square is "+result);
			 }
			
			 public void area(int length, int breadth) 
			{
				 int result = length*breadth;
				 System.out.println("Area of Rectangle is "+result);
			}
			 
			 public void area(double pi, int r)
			{
				 pi=3.14;
				 double result = pi*r*r;
				 System.out.println("Area of Circle is "+result);
			 }
		}
 
 
