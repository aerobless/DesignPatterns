package ch.theowinter.strategy;

public class Main {

	public static void main(String[] args) {
		Husky husky = new Husky();
		husky.bark();
		husky.setBarkBehaviour(new LoudBark());
		husky.bark();
	}
}
