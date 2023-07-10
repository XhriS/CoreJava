package javaCollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0, "Hello");
		hm.put(1, "Good Bye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		
		System.out.println(hm.get(2));
		
		hm.remove(2);
		
		Set sn = hm.entrySet();
		Iterator i = sn.iterator();
		
		while(i.hasNext())
		{
			//We need to separate key from entry value. We cast i to tell it that this is a Map data
			//structure so it can separate key from value.
			Map.Entry mp = (Map.Entry)i.next(); 
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("Hola", "Hello");
		System.out.println(hm2.get("Hola"));
		
	}

}
