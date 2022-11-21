
public class Vehicle {
	int speed;
	int fuel;
	int mileage;
	
	Vehicle(int speed, int fuel, int mileage)
	{
		this.speed = speed;
		this.fuel = fuel;
		this.mileage = mileage;
		
	}
	
	
	public static void main(String[] args)
	{
		Vehicle obj = new Vehicle(40,20,60);
		Car car = new Car(2,100);
		Bike bike = new Bike(100);
		Car car1 = new Car();
		Car car2 = new Car();
		
		/*
		 * System.out.println(car.gear); System.out.println(car.odometer);
		 */
		System.out.println(car1.odometer);
		System.out.println(car1.gear);

	
		
	}
}






