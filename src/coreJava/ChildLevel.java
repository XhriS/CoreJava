package coreJava;

//Function overloading
public class ChildLevel extends ChildClassDemo{
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildLevel cl = new ChildLevel();
		cl.audioSystem();
		cl.getData(2);
		cl.getData("hello");
		cl.getData(2, 3);
	}

}
