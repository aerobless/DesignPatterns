package ch.theowinter.singleton;

public class Main {

	public static void main(String[] args) {
		BankValues bankValues = BankValues.getInstance();
		bankValues.setAccountExpenses(10);
		bankValues.setAccountInterest(-20);
		bankValues.setAccountInterest(30);
	}
}
