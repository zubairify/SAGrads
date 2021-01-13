import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.System.out;

import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLifeCycle {
	private Vector<String> basket;

	@BeforeClass	// Runs only once for the whole test class - Before all methods of class
	public static void oneTimeSetup() {
		out.println("Before Class - One time setup");
	}
	
	@AfterClass	// Runs only once for the whole test class - After all methods of class
	public static void oneTimeTearDown() {
		out.println("After Class - One time tear down");
	}
	
	@Before	// Runs before every test case
	public void setup() {
		basket = new Vector<String>();
		out.println("Before - setup");
	}
	
	@After	// Runs after every test case
	public void tearDown() {
		basket = null;
		System.out.println("After - tear down");
	}
	
	@Test
	public void testEmptyBasket() {
		assertTrue(basket.isEmpty());
		System.out.println("Test - Testing empty basket");
	}
	
	@Test
	public void testOneItemBasket() {
		basket.add("Apple");
		assertEquals(1, basket.size());
		System.out.println("Test - Testing one item basket");
	}
}
