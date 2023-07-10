package coreJava;

public class SuperKeywordChildDemo extends SuperKeywordParentDemo{

	//String name = "Anastasiya";
	
	public SuperKeywordChildDemo() {
		super(); //This should always be the first line in the child constructor
		System.out.println("Child Class Constructor");
	}
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeywordChildDemo cd = new SuperKeywordChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
