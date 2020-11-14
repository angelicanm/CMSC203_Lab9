package lab9;

public class SavingsAccount extends BankAccount {

	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount (String name, double initialBalance) {
		super(name, initialBalance);
		
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		double amount = super.getBalance() * (rate/12);
		super.deposit(amount);
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount (SavingsAccount oldAccount, double initialBalance) {
		super(oldAccount, initialBalance);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
}
