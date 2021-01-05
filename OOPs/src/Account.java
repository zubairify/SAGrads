
// Generalised Bank account class
public abstract class Account {
	private int acntNo;
	private String holder;
	protected double balance;
	
	// Constants 
	public static final int INIT_ACNT_NO = 1001;
	public static final double MIN_SAV_BAL = 1000;
	public static final double MIN_CUR_BAL = 5000;
	
	private static int autogen;
	
	static {	// Static initialiser block - executes @ class loading - Good place to initialise static members 
		System.out.println("Account class loaded...");
		autogen = INIT_ACNT_NO;
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
	
	public abstract void withdraw(double amount);
	
	public double getBalance() {
		return balance;
	}
}
