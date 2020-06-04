package FinalFinallyFinalize;

public class FinalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Final is used to defined constant values i.e  once declared final, value cannot be changed
//Used to prevent inheritance, i.e. if a class is declared as final, it cannot have child class or no class can implement it
//Used to precent method overriding as well, i.e. once a function is declared as final in parent class, its child class cannot have same function		
		final int i=10;
		//i=20; //Uncomment to see error
		
		System.out.println(i);
	}

}
