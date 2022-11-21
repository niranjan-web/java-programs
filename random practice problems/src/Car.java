
public class Car extends Vehicle{
	
	int gear;
	int odometer;
	
	Car()
	{
		super(20,30,40);
	}
	
	
	Car(int gear, int odometer)
	{
		super(2,3,4);
		this.gear = gear;
		this.odometer = odometer;
	}

}
