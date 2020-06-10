package AbstractionConcept;

public abstract class Bank {
	public abstract void loan();//No methood body and keyword avstarct needs to be used 
	
	public void credit() {
		System.out.println("insode credit method");
	}
	
	public void balance()
	{
		System.out.println("Inside Balance method");
	}

	//Above setup is called PARTIAL ABSTRACTION
}
