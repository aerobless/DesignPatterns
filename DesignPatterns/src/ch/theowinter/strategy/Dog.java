package ch.theowinter.strategy;

abstract class Dog {
	
	//Default behaviour
	BarkBehaviour barkBehaviour = new LoudBark();
	WalkBehaviour walkBehaviour = new SlowWalk();
	
	public void setBarkBehaviour(BarkBehaviour barkBehaviour) {
		this.barkBehaviour = barkBehaviour;
	}
	
	public void setWalkBehaviour(WalkBehaviour walkBehaviour){
		this.walkBehaviour = walkBehaviour;
	}
	
	public void bark() {
		barkBehaviour.bark();
	}
	
	public void walk(){
		walkBehaviour.walk();
	}
}
