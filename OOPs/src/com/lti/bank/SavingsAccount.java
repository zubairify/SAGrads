package com.lti.bank;

public class SavingsAccount extends Account {

	public SavingsAccount() {
	}

	public SavingsAccount(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance - MIN_SAV_BAL))
			balance -= amount;
		else
			throw (new BalanceException("Insufficient balance"));
	}
}
