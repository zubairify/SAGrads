package com.lti.bank;

public class CurrentAccount extends Account {

	public CurrentAccount() {
	}

	public CurrentAccount(String holder) {
		super(holder, MIN_CUR_BAL);
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= (balance - MIN_CUR_BAL))
			balance -= amount;
		else
			System.out.println("Insufficient balance");
	}
}
