package wrapperClassImmutableConcept;

public class wrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=10;
		Integer j=10;
	
		System.out.println(i.toString() + " is a number");
		System.out.println(i.getClass());
		
		
		String s1="test";
		String s2="test";
		
		System.out.println(s1.concat("java"));
		
		System.out.println(s1);
		System.out.println(s2);
		
		// Integer and string above used are wrapper classes and are immutable. Hence any action performed on them will not change their value
		
		
//Now if you debug these above variables and observes their values, their Id for Integer i and j   & for string s1 and s2 is same)
		
		//in below code since we are now assigning s1 with a new value, a new object will be created and hence will have a different value
		
		s1="test1";
		
		System.out.println("value of s1 is " + s1);
		
		
		
		
	}

}
