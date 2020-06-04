package ListConcepts;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>(); //k is key v is value
		
		ht.put(1, "test");
		System.out.println(ht.size());
		
		ht.put(1, "best");
		
		System.out.println(ht.get(1));
		
		ht.putIfAbsent(1, "test");
		System.out.println(ht.get(1));
		
		ht.remove(2);
		
		
		
		
		
		
		
		
		
	}

}
