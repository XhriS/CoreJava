package javaCollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		hs.add("INDIA");
		
		System.out.println(hs);
		
		//hs.remove("USA");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next()); //1st index 
		}
	}

}
