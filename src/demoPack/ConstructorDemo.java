package demoPack;

public class ConstructorDemo {

	//Default
	public ConstructorDemo()
	{
		System.out.println("I am in the constructor");
	}
	
	public ConstructorDemo(int a, int b)
	{
		System.out.println("I am in the parametirized constructor");
	}
	
	public ConstructorDemo(String a)
	{
		System.out.println("Hello " +a);
	}
	
	public void getData()
	{
		System.out.println("I am the method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(4,5);
		ConstructorDemo cd3 = new ConstructorDemo("Chris");
		
		

	}

}
