package coreJava;

public class ThisKeywordDemo {

	int a = 2;
	
	public void getData() {
		int a = 3;
		System.out.println(a);
		
		//This refers to current object - Object scope lies in class level
		System.out.println(this.a);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemo td = new ThisKeywordDemo();
		td.getData();
	}

}
