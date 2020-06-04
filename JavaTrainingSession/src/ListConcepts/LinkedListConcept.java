package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llc=new LinkedList<String>();
		
		//Operation 1 - ADD
		llc.add("test");
		llc.add("QTP");
		llc.add("Selenium");
		llc.add("RFT");
		
		System.out.println("Contents of LinkedList: " + llc );
		
		//Operation 2: Adding at first & last node
		
		llc.addFirst("Tarun");
		llc.addLast("is learning automation");
		
		System.out.println("Contents of Linked List are :" + llc);
		
		//Operation: Getting Values:
		System.out.println(llc.get(0));
		
		System.out.println(llc.get(1));
		
		llc.set(0, "New Automation"); // This will replace with item at 0th index
		
		System.out.println(llc);
		//llc.get(0);
		
		
		llc.remove(2);
		
		System.out.println(llc);
		
		//using loops
		
		for(int i=0; i<llc.size();i++)
		{
			System.out.println(llc.get(i));
		}
		
		
		//Advance for loop
		System.out.println("By using advance for loop");
		for(String str:llc)
		{System.out.println(str);
		}
		
	System.out.println("now using iterator");
	
	Iterator<String> it=llc.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	System.out.println("Now using while loop");
	int num=0;
	while(llc.size()>num)
	{
		System.out.println(llc.get(num));
		num++;
	}
	}

}
