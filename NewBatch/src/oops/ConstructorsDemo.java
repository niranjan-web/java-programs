//constructor demo program
package oops;

public class ConstructorsDemo {

	public static void main(String[] args) {
		Area obj = new Area(2,4);
		Area obj1 = new Area(3.14,6);
		Area obj2 = new Area(2);
		
	}
}
class Area {
	
	private int a;
	 private int l;
	 private int b;
	 private double pi;
	 private int r;


	Area(int a) 
	{
		 this.a =a;
	 int area= a*a;
	 System.out.println("AREA OF SQUARE:");
	 System.out.println("side of the square is "+a);
	 System.out.println("and area of the square is "+area); 
	 System.out.println();
	 }
	
	
	 Area(int l,int b) 
	{
		 this.l =l;
		 this.b =b;
	 int area = l*b;
	 System.out.println("AREA OF RECTANGLE:");
	 System.out.println("length of the rectangle "+l);
	 System.out.println("breadth of the rectangle "+b);
	 System.out.println("and the area of the rectangle is "+area); 
	 System.out.println();

	 }
	
	
	 Area(double pi, int r) 
	{
		 this.pi = pi;
		 this.r = r;
	 double area = pi*r*r;
	 System.out.println("AREA OF CIRCLE:");
	 System.out.println("radius of the Circle "+r);
	 System.out.println("and area of the Circle is "+area);
	 System.out.println();

	 }
	}
