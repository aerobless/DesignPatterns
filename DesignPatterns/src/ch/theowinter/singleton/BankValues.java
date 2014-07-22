package ch.theowinter.singleton;

public class BankValues {
	
	private BankValues() {	
	}
	
	private static BankValues uniqueBankValues = new BankValues();

	//global method to get the instance
	public static BankValues getInstance() {
		return uniqueBankValues;
	}

	private double accountInterest = 0.0;
	private int accountExpenses = 10;
	private int accountTransactionVolume = 1000;
	private int accountDispositionCredit = -500;
	
	public void setAccountExpenses(int accountExpenses) {
		if (accountExpenses > 0 && accountExpenses < 50){
			this.accountExpenses = accountExpenses;
			System.out.println("done, new Expenses: "+accountExpenses);
		}
	}

	public void setAccountInterest(int accountInterest) {
		if (accountInterest > 0 && accountInterest > 4){
			this.accountInterest = accountInterest;
			System.out.println("done, new Interest: "+accountInterest);
		}
	}

	/**
	 * @return the accountInterest
	 */
	public final double getAccountInterest() {
		return accountInterest;
	}

	/**
	 * @return the accountExpenses
	 */
	public final int getAccountExpenses() {
		return accountExpenses;
	}

	/**
	 * @return the accountTransactionVolume
	 */
	public final int getAccountTransactionVolume() {
		return accountTransactionVolume;
	}

	/**
	 * @return the accountDispositionCredit
	 */
	public final int getAccountDispositionCredit() {
		return accountDispositionCredit;
	}
}
