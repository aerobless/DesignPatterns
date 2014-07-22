package ch.theowinter.state;

public class Girlfriend {
	private IHumanState emotionalState;

	public void setCurrentState(IHumanState state) {
		emotionalState = state;
	}

	public Girlfriend() {
		super();
		setCurrentState(new Neutral(this));
	}
	
	public void talk(){
		emotionalState.talk();
	}
	
	public void kiss(){
		emotionalState.kiss();
	}
	
	public void anger(){
		emotionalState.anger();
	}
}
