package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{ //Is a relationship
	
	public void minBal() {
		System.out.println("minimum bal function");
	}

	public void maxBal() {
		System.out.println("Maximum Bal function");
		}
	
	
	public void balTransfer() {
		System.out.println("Bal transfer function");
	}
	
	public void educationLoan() {
		System.out.println("education loan");
	}
	
	public void farmLoan() {
		System.out.println("Farm loan");
	}
	
	public void mutualFund() {
		System.out.println("Mutual Fund");
	}
}
