package ch.theowinter.strategy;

interface WalkBehaviour {
	public void walk();
}

class SlowWalk implements WalkBehaviour{
	@Override
	public void walk() {
		System.out.println("slow walk");
	}
}

class FastWalk implements WalkBehaviour{
	@Override
	public void walk() {
		System.out.println("fast walk");
	}
}
