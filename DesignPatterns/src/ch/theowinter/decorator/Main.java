package ch.theowinter.decorator;

public class Main {
	public static void main(String[] args) {
		IDish dish = new Salad(new Pommes(new WienerSchnitzel()));
		dish.printDescription();
		System.out.println("Total price in CHF: "+dish.getPrice());
	}
}
