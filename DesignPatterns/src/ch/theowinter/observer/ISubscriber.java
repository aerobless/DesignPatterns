package ch.theowinter.observer;

interface ISubscriber {
	public void receiveNewspaper(Newspaper newspaper);

}

class HansMuster implements ISubscriber {
	@Override
	public void receiveNewspaper(Newspaper aNewspaper) {
		System.out.println("Hans Muster receiving the newspaper "+aNewspaper.getTitle());
	}
}

class TestMeier implements ISubscriber {
	@Override
	public void receiveNewspaper(Newspaper aNewspaper) {
		System.out.println("Test Meier receiving the newspaper "+aNewspaper.getTitle());
	}
}
