package JavaBasics;

public class ConstructorConcept {
//	Hidden constru	ctor is always there in the class body
	
	int age;
	String name;
	//Default Constructors
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	//Parameterized Constructor
	public ConstructorConcept(int i) {
		System.out.println("Value of i" + i);
		
	}
	
	//Parameterized Constructor with 2 parameters
	public ConstructorConcept(int i,int j) {
		
		System.out.println("Value of I and j" + i + "   " + j);
	}
	
	public ConstructorConcept(int age,String name) {
		
		this.name=name; //this.name is class variable, = name is constructor variable
		this.age=age;
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println("this proves that this keyword can be used to access class variables from within a constructor");
	}
	
	public void printValues(int age, String name) {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println("above values are for class variables are assigned during constructor initialization");
		this.age=age;
		this.name=name;
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println("this proves that this keyword can be used to access class variables from within a function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ConstructorConcept cc=new ConstructorConcept(); 
	ConstructorConcept cc1= new ConstructorConcept(10);
	ConstructorConcept cc2=new ConstructorConcept(10, 20);
	ConstructorConcept cc3=new ConstructorConcept(20, "tarun");
	
	cc3.printValues(50, "tarun");
	//
	}

}
