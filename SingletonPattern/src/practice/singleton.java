 package practice;

public class singleton {
//singleton classes are classes where only single object (or isntance) of class can be created
//How to design singleton class:
	//1. Make constructor as private
	//2. Write a publuc static method that has return type of object of this singleton class (also know as LAZY INITIALIZATION
	
	private static singleton singleton_instance=null;
	
	public String str;
	
	private singleton() {
		System.out.println("Inside private constructor of singleton class");
		str ="Using singleton class pattern";
	}
	
	public static singleton getInstance() {
		if (singleton_instance==null) 
			singleton_instance=new singleton();
		return singleton_instance;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleton s=singleton.getInstance();
		singleton x=singleton.getInstance();
		singleton y=singleton.getInstance();
		
		x.str=x.str.toUpperCase();
		
		System.out.println(s.str);
		System.out.println(x.str);
		System.out.println(y.str);
		
		
		y.str=y.str.toLowerCase();
		
		System.out.println(s.str);
		System.out.println(x.str);
		System.out.println(y.str);
		
	}

}
