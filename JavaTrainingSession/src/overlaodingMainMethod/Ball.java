package overlaodingMainMethod;

public class Ball {

	public static void main(String[] args) {
		String s1="java";
		
		
		System.out.println(s1.concat(" is awesome"));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println("but value of s1 is: " + s1);
		
		
		// TODO Auto-generated method stub
		System.out.println("Inside main method of class Ball");
//		Apple.main(args);
	}
	
	public static void main(int a, int b) {
		System.out.println("total sum is: " + (a+b));
	}

	public static void main(String name) {
		System.out.println("Name of the class calling this function is: " + name);
	}
}
  