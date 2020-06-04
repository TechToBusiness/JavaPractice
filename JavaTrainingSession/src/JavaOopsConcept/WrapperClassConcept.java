package JavaOopsConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age="25";
		System.out.println("Age is: " + (age+ 10));
		
		System.out.println("Age is: " + (Integer.parseInt(age) + 10));
		
		
		String weight="25.6";
		System.out.println("Age is: " + weight + 10.1);
		
		System.out.println("Age is: " + (Double.parseDouble(weight) + 10.4));
		
		
		//string to boolean
		
		String flag="true";
		System.out.println("output is :" + flag);
		System.out.println("output is :" + Boolean.parseBoolean(flag));
	}

}
