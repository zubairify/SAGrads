import org.junit.Test;

public class TestPerformance {

	@Test(timeout = 1000)
	public void testTime() {
//		while(true);
		for(int i=1; i<=100; i++);
	}
}
