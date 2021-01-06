import com.lti.bank.Bank;
import com.lti.bank.CurrentAccount;
import com.lti.bank.SavingsAccount;

public class TestAccount {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("Mike");
		sa.summary();
		
		sa.withdraw(1000);
		System.out.println("Balance: " + sa.getBalance());
		
		CurrentAccount ca = new CurrentAccount("Kelly");
		ca.summary();
		
		Bank a = ca;
		a.summary();
	
		a = sa;
		a.summary();
		a.withdraw(1000);
	}
}
