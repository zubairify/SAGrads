
public class SavingsAccount extends Account {

	public SavingsAccount() {
	}

	public SavingsAccount(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= (balance - MIN_SAV_BAL))
			balance -= amount;
		else
			System.out.println("Insufficient balance");
	}
}
