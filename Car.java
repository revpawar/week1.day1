package week1.day1;

public class Car {
	
	void applyBreak()
	{
	System.out.println("apply break");	
	}
	
	void applyGear()
	{
		System.out.println("apply gear");
	}
	
	void switchonAC()
	{
		System.out.println("switchonAC");
	}
	void applyAccelerate()
	{
		System.out.println("apply accelerate");
	}
}

 class NewCar
{

	public static void main(String[] args) {
		
		Car car=new Car();
		car.applyBreak();
		car.applyGear();
		car.switchonAC();
		car.applyAccelerate();
		
	}
}

