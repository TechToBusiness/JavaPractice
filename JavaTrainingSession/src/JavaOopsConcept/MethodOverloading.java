package JavaOopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo= new MethodOverloading();
		mo.doSum();
		mo.doSum(1,2);
		mo.doSum(1,2);
		mo.doSum(1,2,0);
	}
	public void doSum()
	{
		System.out.println("no argument no return");
		
	}
	
//	public int doSum()
//	{
//		System.out.println("no argument no return");
//		return 1;
//	}
	
	public void doSum(int a, int b)
	{
		System.out.println("Two argument no return");
		
	}
	
	public void doSum(int a, double b)
	{
		System.out.println("Two argument one float no return");
		
	}
	
	
	public int doSum(int a, int b, int c)
	{
		c=a+b;
		
		System.out.println("One argument one return");
		System.out.println(c);
		return c;
		
	}
}
