package JavaOopsConcept;

public class LocalVsGlobal {
	String name="tom";
	int age=25; //This is global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=23; //THis is local variable inside main
		LocalVsGlobal lg=new LocalVsGlobal();
		System.out.println(i);
		System.out.println(lg.age);
		System.out.println(lg.age);
		
	}

	public void sum() {
		int i=10,j=20; //THis is local variable inside sum function
		int age=32; 
	}
}
