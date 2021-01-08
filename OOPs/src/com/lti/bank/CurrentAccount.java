package com.lti.bank;

public class CurrentAccount extends Account {

	public CurrentAccount() {
	}

	public CurrentAccount(String holder) {
		super(holder, MIN_CUR_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance - MIN_CUR_BAL))
			balance -= amount;
		else
			throw new BalanceException("Insufficient balance");
	}
}
