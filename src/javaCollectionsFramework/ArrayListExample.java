package javaCollectionsFramework;

import java.util.ArrayList;

public class ArrayListExample {

	//Accepts Duplicate Values
	//Arrays have fixed size whereas Arraylist can grow dynamically
	//You can access and insert/delete any value in any index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Chris");
		a.add("Java");
		a.add("Java");

		System.out.println(a);
		
		a.add(0, "Student");
		System.out.println(a);
		
		/*a.remove(1); 
		a.remove("Java");
		System.out.println(a);

		a.removeAll(a)*/
		System.out.println(a.get(2));
		//testing
		System.out.println(a.contains("Java"));
		
		System.out.println(a.indexOf("Chris"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());

	}

}
