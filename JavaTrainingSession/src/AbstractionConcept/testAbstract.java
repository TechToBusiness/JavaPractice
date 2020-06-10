package AbstractionConcept;

public class testAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank hdfc=new HDFCBank();
		
		hdfc.loan();
		hdfc.balance();
		hdfc.credit();
		hdfc.creditScore();
		
		//Dynamoc polymorphism- where parent class object referring to child class
		Bank b=new HDFCBank();
		b.loan();
		b.credit();
		b.balance();
//		b.creditScore();  You can't access child method in dynamic polymorphism
	}

}
