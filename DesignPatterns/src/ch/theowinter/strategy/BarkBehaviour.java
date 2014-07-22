package ch.theowinter.strategy;

interface BarkBehaviour {
	public void bark();
}

class QuietBark implements BarkBehaviour {
	@Override
	public void bark() {
		System.out.println("Quiet bark");
	}
}

class LoudBark implements BarkBehaviour {
	@Override
	public void bark() {
		System.out.println("Loud bark");
	}
}