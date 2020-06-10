package JavaBasics;

public class throwKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main");

		try {
			throw new Exception("Deliberate exception"); // This needs to be handled as this is an exception and compiler
			// knows rest of the code can't be reached
		}catch (Exception e) {
			// TODO: handle exception
		}
		try {
			throw new Error("Deliberate Error"); //This code needs to be handled in try catch as this is deliberate error which needs to be handled or rest of the code can't be reached
		}catch(Error e1)
		{
			
		}
		
		System.out.println("after generating exception");
	}

}
