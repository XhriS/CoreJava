package coreJava;

public class StaticVariable {
//Instance Variables
	String name;
	String address;
	int i1 = 0;
	
	//Class variables
	static String city; 
	static int i;
	
	//block
	static {
		city = "Texas";
		i=0;
	}

	
	StaticVariable(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		i1++;
		System.out.println(i1);
		System.out.println(i);
		

	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	public static void getCity() //Class Methods - Do not rely on class objects
	{
		System.out.println(city);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable obj = new StaticVariable("Chris", "Austin");
		StaticVariable obj2 = new StaticVariable("Ana", "Austin");
		obj.getAddress();
		obj2.getAddress();
		StaticVariable.getCity(); //Executes static methods - Do not rely on class objects to initiate
							      //They are object independent
		StaticVariable.i = 4;
		obj.address = "XYZ"; //Non-Static variable. Can be called using a class object
	}

}
