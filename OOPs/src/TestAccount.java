
public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account("Polo", 5000);
		a1.summary();
		
		a1.deposit(2000);
		System.out.println("Balance: " + a1.getBalance());
		
		a1.withdraw(3000);
		System.out.println("Balance: " + a1.getBalance());
		
		a1.withdraw(5000);
	}
}
