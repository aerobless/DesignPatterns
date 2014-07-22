package ch.theowinter.abstractFactory;

public class Main {

	public static void main(String[] args) {
		AbstractGenerator generator = new PolarGenerator();
		
		IPlant plant = generator.createPlant();
		IAnimal animal = generator.createAnimal();
		ILandscape landscape = generator.createLandscape();
	}
}
