package ch.theowinter.observer;

public class Main {
	
	public static void main(String[] args){
		TwentyMinutes publisher = new TwentyMinutes();
		publisher.addSubscription(new HansMuster());
		TestMeier testMeier = new TestMeier();
		publisher.addSubscription(testMeier);
		
		publisher.setCurrentNewspaper(new Newspaper("Test Newspaper 1"));
		publisher.removeSubscription(testMeier);
		
		publisher.setCurrentNewspaper(new Newspaper("Test Newspaper 2"));
	}
}
