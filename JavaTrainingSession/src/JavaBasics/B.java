package JavaBasics;

public class B extends A{
	public B() {
		super(10); //Super keyword is used to call specific constructor of parent class
		//By default (if you dont call Super keyword, then default constructor will be called
		System.out.println("Inside Child Class Constructor");
		
	}
	
	public B(int i, int j) {
		super(i, j);
		System.out.println("Inside parameterized constructor of child class. Value of i & j are: " + i + " & " + j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		B b2=new B(2, 10);
	}

}

//By default Parent class constructors will be called