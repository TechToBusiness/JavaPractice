package FinalFinallyFinalize;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			testMethod();
			test2Method();
			divideFunc();
	}

	public static void testMethod() {
	try{
		System.out.println("inside Finally Method");
		throw new RuntimeException("test");
		
	}
	catch(Exception e)
	{
		System.out.println("inside catch");
	}
	finally {
		System.out.println("inside finally block");
	}
	}
	
	public static void test2Method()	
	{
		try {
			System.out.println("inside try of method 2");
		}
//		catch (Exception e) {
//			System.out.println("inside catch of method 2");
//		}
		finally {
			System.out.println("inside finally of method 2");
		}
		
	}
	
	public static void divideFunc()
	{
		try
		{
			System.out.println("Inside of Divide Func");
			int i=10/0;
		}catch(Exception e)
		{
			System.out.println(e.getMessage() + " error inside Catch of divide Func");
		}
		finally {
			System.out.println("inside finally even after exception");
		}
	}
}
