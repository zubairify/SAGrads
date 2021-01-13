import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestAccount {
	private Account acnt;
	
	@Before
	public void setup() {
		acnt = new Account(1000);
	}
	
	@Test
	public void testDeposit() { 
		assertEquals(2000, acnt.deposit(1000), 0);
	}
	
	@Test
	public void testWitdraw() throws BalanceException {
		assertEquals(500, acnt.withdraw(500), 0);
	}
	
	@Test(expected = BalanceException.class)
	public void testException() throws BalanceException {
		acnt.withdraw(5000);
	}
}
