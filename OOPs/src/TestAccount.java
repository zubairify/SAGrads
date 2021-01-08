import com.lti.bank.BalanceException;
import com.lti.bank.SavingsAccount;

public class TestAccount {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("Mike");
		
		try {
			sa.withdraw(1000);
		} catch (BalanceException e) {
			// e.printStackTrace(); -> For developers to trouble shoot the problem
			// System.out.println(e);	-> For logging to audit the system
			System.out.println(e.getMessage());	// For end users, just a message
		}
	}
}
