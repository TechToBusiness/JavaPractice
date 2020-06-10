package JavaBasics;

public class throwsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		throwsKeyword obj= new throwsKeyword();
		obj.sum();
		
		System.out.println("in main after exception is thrown");
	}
	public void sum() throws ArithmeticException{
		try {
			div(); //throws is used to throw/pass exception from once function to calling source, but it is important to catch the exceptiom at some place
			//else using throws without catching is as good as not writing throws keyword
		}
		catch(ArithmeticException e1)
		{
			
		}
		
		
	}
	public void div() throws ArithmeticException{
		System.out.println(9/0);
	}
}

