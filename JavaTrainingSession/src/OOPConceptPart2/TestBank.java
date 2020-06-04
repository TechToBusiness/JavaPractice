package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is also static polymorphism
		HSBCBank hs=new HSBCBank();
		
		//
		hs.minBal();
		hs.maxBal();
		hs.balTransfer();
		hs.educationLoan();
		hs.farmLoan();
		System.out.println(hs.minBal + 200);
		hs.mutualFund();
		//Dynamic/Runtime Polymorphism
		
		System.out.println("Dynamic Polymorphism");
		
		USBank us=new HSBCBank(); //Referring interface object to implementing class
		us.balTransfer();
		us.maxBal();
		us.balTransfer();
		System.out.println(us.minBal+400);
		//us.farmLoan();//not possible
		//us.mutualFund()//Not possible because it is implemented from Brazil bank and not US Bank
	}

}
