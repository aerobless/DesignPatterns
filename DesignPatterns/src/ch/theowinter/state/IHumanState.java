package ch.theowinter.state;

interface IHumanState {
	
	public void talk();
	public void kiss();
	public void anger();

}

class Neutral implements IHumanState{
	private Girlfriend girlfriend;

	Neutral(Girlfriend aGirlfriend) {
		super();
		girlfriend = aGirlfriend;
	}

	@Override
	public void talk() {
		System.out.println("neutral, no change");
	}

	@Override
	public void kiss() {
		System.out.println("neutral, positive change");
		girlfriend.setCurrentState(new Happy(girlfriend));
	}

	@Override
	public void anger() {
		System.out.println("neutral, no change");
	}
}

class Angry implements IHumanState{
	private Girlfriend girlfriend;

	Angry(Girlfriend aGirlfriend) {
		super();
		girlfriend = aGirlfriend;
	}
	
	@Override
	public void talk() {
		System.out.println("angry, no change");
	}

	@Override
	public void kiss() {
		System.out.println("angry, positive change");
		girlfriend.setCurrentState(new Neutral(girlfriend));
	}

	@Override
	public void anger() {
		System.out.println("angry, negative change");
	}
}

class Happy implements IHumanState{
	private Girlfriend girlfriend;

	Happy(Girlfriend aGirlfriend) {
		super();
		girlfriend = aGirlfriend;
	}

	@Override
	public void talk() {
		System.out.println("happy, no change");
	}

	@Override
	public void kiss() {
		System.out.println("happy, no change");
	}

	@Override
	public void anger() {
		System.out.println("angry, no change");
		girlfriend.setCurrentState(new Angry(girlfriend));
	}
}