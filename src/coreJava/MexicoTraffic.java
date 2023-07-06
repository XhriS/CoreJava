package coreJava;

import demoPack.CentralTraffic;
import demoPack.ContinentTraffic;

public class MexicoTraffic implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new MexicoTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
		
		MexicoTraffic m = new MexicoTraffic();
		m.walkSign();
		
		ContinentTraffic ct = new MexicoTraffic();
		ct.trainSymbol();
	}

	public void walkSign()
	{
		System.out.println("Walk sign");
	}
	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go implementation");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash Yellow  implementation");

		
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		
	}

}
