package com.lti.iteration;

public class FactorialExample {
	
	public static void main(String[] args) {
		long factorial = getFactorial(9);
		System.out.println(factorial);
	}

	private static long getFactorial(int n) {
		long fact = 1;
		for (int c=1; c<=n; c++) 
			fact = fact * c;
			
		return fact;
	}
}
