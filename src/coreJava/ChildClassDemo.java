package coreJava;

import demoPack.ParentClassDemo;

public class ChildClassDemo extends ParentClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo cd = new ChildClassDemo();
		cd.color();
		cd.engine();
		cd.audioSystem();
	}
	
	public void engine()
	{
		System.out.println("new engine");
	}
	
	public void color() {
		System.out.println(color);
	}
	
	public void audioSystem() {
		System.out.println("new audio child");
	}

}
