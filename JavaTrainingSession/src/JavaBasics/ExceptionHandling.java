 package JavaBasics;

public class ExceptionHandling {
	int a =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Uncaught exception
		try {
			int i=9/0;
			System.out.println(i);
		}catch(Exception e)
		{
			e.printStackTrace(); //for printing the stack trace on the console
			System.out.println(e.getMessage());
		}
		System.out.println("After catch block of arithmatic exception");
		
		//caught exception
//		Thread.sleep(2000);
		
		ExceptionHandling obj=new ExceptionHandling();
		
		System.out.println(obj.a);
		obj=null; //cancelling the object reference
		try {
			System.out.println(obj.a); //will throw exception as obj is not having any reference to object
		}catch(Exception e1)
		{
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		
	}

}
