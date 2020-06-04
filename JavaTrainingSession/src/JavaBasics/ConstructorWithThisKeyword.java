package JavaBasics;

public class ConstructorWithThisKeyword {
	int age;
	String name;
	
	public ConstructorWithThisKeyword(String FN, int years)
	{
		this.name=FN; //This keyword is used to initialize class variables
		this.age=years;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword cwt=new ConstructorWithThisKeyword("Tarun", 34);
		System.out.println(cwt.name);
		System.out.println(cwt.age);
	}

}
