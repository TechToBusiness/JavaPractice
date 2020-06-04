package JavaOopsConcept;

public class CallByValueAndReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndReference obj=new CallByValueAndReference();
		int x =10, y=20;
		
		System.out.println(obj.Test(x, y));
		
		System.out.println("And orignal values");
		System.out.println(x);
		System.out.println(y);
		
		obj.p=10;
		obj.q=20;
		System.out.println("Before Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		obj.swap(obj);
		System.out.println("after Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	//Call by value or pass by value, because here overwirting value of a and b inside function will not change value of x and y 
	public int Test(int a, int b)
	{
		a=40; b=50;
		int c;
		c=a+b;
		return c;
	}
	
	//Call by Reference
	public void swap(CallByValueAndReference t)
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}
}
