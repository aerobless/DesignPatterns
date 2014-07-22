package ch.theowinter.abstractFactory;

interface AbstractGenerator {
	public IPlant createPlant();
	public IAnimal createAnimal();
	public ILandscape createLandscape();	
}

class PolarGenerator implements AbstractGenerator{

	@Override
	public IPlant createPlant() {
		return new Shrubbery();
	}

	@Override
	public IAnimal createAnimal() {
		return new Icebear();
	}

	@Override
	public ILandscape createLandscape() {
		return new Snow();
	}
}

class DesertGenerator implements AbstractGenerator{

	@Override
	public IPlant createPlant() {
		return new Cactus();
	}

	@Override
	public IAnimal createAnimal() {
		return new Camel();
	}

	@Override
	public ILandscape createLandscape() {
		return new Sand();
	}
}

class RainforestGenerator implements AbstractGenerator{

	@Override
	public IPlant createPlant() {
		return new Tree();
	}

	@Override
	public IAnimal createAnimal() {
		return new Elephant();
	}

	@Override
	public ILandscape createLandscape() {
		return new Grass();
	}
}