package oops;

public class MethodOverriding {

	public static void main(String[] args) {
		Car obj1 = new Car(); 
		Car1 obj2 = new Car1();
		Car2 obj3 = new Car2(); 
		
		obj1.frontWheelDrive(); 
		//obj2.AllWheelDrive(); 
		obj3.backWheelDrive(); 
		
	}
}
class Vehicle
{
	public void driveType()
		{
		 System.out.println("three differents vehicle drive types... ");
		}
	 
	public void allWheelDrive() 
	{
		 System.out.println("it drives all wheels...");
	}
}
	class Car extends Vehicle 
	{
		
		 public void frontWheelDrive() 
		 { 
			 super.driveType();
			 System.out.println("it drives front wheels...");
		 
		 }
	}
	class Car1 extends Vehicle 
	{
		 public void AllWheelDrive() 
		 { 
		 }
	}
	class Car2 extends Vehicle 
	{
		 public void backWheelDrive() 
		 { 
			 super.allWheelDrive();
		     System.out.println("it drives back wheels...");
		 
		 }
	}
	
	
	 
	