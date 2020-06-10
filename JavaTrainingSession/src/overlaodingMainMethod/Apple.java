package overlaodingMainMethod;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main method of class Apple");
		Ball.main("Apple");
		Ball.main(2, 5);
		Ball.main(args);
	}

}
