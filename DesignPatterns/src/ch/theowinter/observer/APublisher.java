package ch.theowinter.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class APublisher {
	private List<ISubscriber> subscriberList = new ArrayList<ISubscriber>();
	
	public void addSubscription(ISubscriber iSubscriber){
		subscriberList.add(iSubscriber);
	}
	
	public void removeSubscription(ISubscriber iSubscriber){
		subscriberList.remove(iSubscriber);
	}
	
	protected void distributeNewspaper(Newspaper newspaper){
		for (ISubscriber iSubscriber : subscriberList){
			iSubscriber.receiveNewspaper(newspaper);
		}
	}
}

class TwentyMinutes extends APublisher {
	
	private Newspaper currentNewspaper;
	
	public void setCurrentNewspaper(Newspaper newspaper){
		currentNewspaper = newspaper;
		distributeNewspaper(newspaper);
	}
	
	public Newspaper getCurrentNewspaper(){
		return currentNewspaper;
	}
}