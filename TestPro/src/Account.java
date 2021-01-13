
public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount) throws BalanceException {
		if(amount <= balance)
			balance -= amount;
		else
			throw new BalanceException("Insufficient balance");
		return balance;
	}
}
