package ch.theowinter.decorator;

interface IDish {
	public int getPrice();
	public void printDescription();
}

class Garnelen implements IDish{

	@Override
	public int getPrice() {
		return 20;
	}

	@Override
	public void printDescription() {
		System.out.println("I am a Garnele. Garnele is very tasty.");
	}
	
}

class WienerSchnitzel implements IDish{

	@Override
	public int getPrice() {
		return 25;
	}

	@Override
	public void printDescription() {
		System.out.println("I am a WienerSchnitzel. WienerSchnitzel is very tasty.");
	}
	
}