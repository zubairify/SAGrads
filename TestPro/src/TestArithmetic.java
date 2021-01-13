import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestArithmetic {

	@Test
	public void testSum() {
		int sum = 10 + 3;
		assertEquals(15, sum);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		int res = 2/0;
	}
	
	@Ignore("Method not ready")
	@Test
	public void testNotReady() {
		System.out.println("Not ready");
	}
}
