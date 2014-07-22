package ch.theowinter.factory;

abstract class Software {
	public void packing(){
		System.out.println("packaging");
	}
	public void labeling(){
		System.out.println("labeling");
	}
	public abstract void start();
}

class Word extends Software {
	public void start() {
		System.out.println("Word is running");
	}
}

class Excel extends Software {
	public void start() {
		System.out.println("Excel is running");
	}
}

class Pages extends Software {
	public void start() {
		System.out.println("Pages is running");
	}
}

class Numbers extends Software {
	public void start() {
		System.out.println("Numbers is running");
	}
}