
public class Account {
	private int acntNo;
	private String holder;
	private double balance;
	
	private static int autogen;
	
	static {	// Static initialiser block - executes @ class loading - Good place to initialise static members 
		System.out.println("Account class loaded...");
		autogen = 1001;
	}
	
	public Account() {
	}

	public Account(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	// Business Logic(BL) Methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) 
			balance -= amount;
		else
			System.out.println("Insufficient balance");
	}
	
	public double getBalance() {
		return balance;
	}
}
