package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
		
		//STATIC POLYMORPHISM
		b.carStart(); //Overridden Method
		
		b.carStop(); // Parent Class Method
		
		b.carTheftSafety(); // Child class method
		
		System.out.println("NOw accessing methods from parent class");
		
		Car c=new Car();
		
		c.carStart();
		c.carStop();
		c.refuel();
		
		System.out.println("now doing dynamic or run time polymorphism");
		
		Car c1=new BMW();
		c1.carStart();
		c1.carStop();
		c1.refuel();
		//Here c1 is a parent class object referring to child class. 
		//C1 can access all child class functions which are available in parent class + parent class specific methods
		//But C1 will not be able to access functions which are specific to child class only
		//This is called DYNAMIC OR RUNTME polymorphism
		
		System.out.println("Now accessing Grandparent Class :-) method");
		c.vehicleType();
		c1.vehicleType();
		
	}

}
