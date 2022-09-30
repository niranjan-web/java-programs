
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.speed();
		
	}
}

class Vehicle
{
	void speed()
	{
		System.out.println("speeding");
	}
}

class Bike extends Vehicle
{
	void speed()
	{
		System.out.println("60km/hr");
	}
}
class Car extends Vehicle
{
	void speed()
	{
		System.out.println("100km/hr");
	}
}