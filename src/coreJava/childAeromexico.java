package coreJava;

import demoPack.ParentAirCraft;

public class childAeromexico extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childAeromexico c = new childAeromexico();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red Color on the body");
	}

}
