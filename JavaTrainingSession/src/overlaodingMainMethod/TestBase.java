package overlaodingMainMethod;

public class TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Orignal Main method");
		main(2,5);
		main(2);
		main("test");
		
	}

	public static void main(int A, int B) {
		System.out.println("Inside main method with 2 parameters");
	}
	
	public static void main(int A) {
		System.out.println("inside main method with 1 argument");
	}
	
	public static void main(String content ) {
		System.out.println("This is content: " + content);
	}
}
