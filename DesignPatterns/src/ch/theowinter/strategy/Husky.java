package ch.theowinter.strategy;

public class Husky extends Dog{
	
	private BarkBehaviour barkBehaviour = new QuietBark();
	private WalkBehaviour walkBehaviour = new SlowWalk();
	
	public void bark(){
		barkBehaviour.bark();
	}
	
	public void walk(){
		walkBehaviour.walk();
	}
	
	public void setBarkBehaviour(BarkBehaviour barkBehaviour){
		this.barkBehaviour = barkBehaviour;
	}
	
	public void setWalkBehaviour(WalkBehaviour walkBehaviour){
		this.walkBehaviour = walkBehaviour;
	}
}
