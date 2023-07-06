package demoPack;

public abstract class ParentAirCraft {
	public void engine() {
		System.out.println("Follow airline guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow safwety guidelines");
	}
	
	public abstract void bodyColor();
}
