package ch.theowinter.decorator;

public abstract class ASideDish implements IDish{
	protected IDish dish;
	
	public ASideDish(IDish dish){
		this.dish = dish;
	}
}

class Pommes extends ASideDish{
	/**
	 * Creates a new instance of this class.
	 *
	 * @param aDish
	 */
	public Pommes(IDish aDish) {
		super(aDish);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return 5+dish.getPrice();
	}

	@Override
	public void printDescription() {
		dish.printDescription();
		System.out.println("Pommes are very tasty.");
	}
}

class Salad extends ASideDish{
	/**
	 * Creates a new instance of this class.
	 *
	 * @param aDish
	 */
	public Salad(IDish aDish) {
		super(aDish);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return 7+dish.getPrice();
	}

	@Override
	public void printDescription() {
		dish.printDescription();
		System.out.println("Salad is very tasty.");
	}
}

class Soup extends ASideDish{
	/**
	 * Creates a new instance of this class.
	 *
	 * @param aDish
	 */
	public Soup(IDish aDish) {
		super(aDish);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return 9+dish.getPrice();
	}

	@Override
	public void printDescription() {
		dish.printDescription();
		System.out.println("Soup is very tasty.");
	}
}