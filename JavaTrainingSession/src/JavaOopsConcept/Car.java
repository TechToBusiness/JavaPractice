package JavaOopsConcept;

public class Car {
		public int wheels;
		public String carName;
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a= new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.wheels=4;
		a.carName="BMW";
		
		b.wheels=2;
		b.carName="bajaj";
		
		c.wheels=6;
		c.carName="audi";

		System.out.println("Before Assigning");
		System.out.println(a.wheels);
		System.out.println(a.carName);
		
		System.out.println(b.wheels);
		System.out.println(b.carName);
		
		System.out.println(c.wheels);
		System.out.println(c.carName);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("After Assigning");
		System.out.println(a.wheels);
		System.out.println(a.carName);
		
		System.out.println(b.wheels);
		System.out.println(b.carName);
		
		System.out.println(c.wheels);
		System.out.println(c.carName);

		a.carName="Chetak";
		System.out.println(a.carName);
		c.carName="Chutak";
		System.out.println(a.carName);
		
		
		}

}

