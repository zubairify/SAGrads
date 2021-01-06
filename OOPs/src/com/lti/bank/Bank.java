package com.lti.bank;

public interface Bank {
	void deposit(double amount);
	void withdraw(double amount);
	void summary();
	double getBalance();
	
	int INIT_ACNT_NO = 1001;
	double MIN_SAV_BAL = 1000;
	double MIN_CUR_BAL = 5000;
}
