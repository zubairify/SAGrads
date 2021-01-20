package com.lti.iteration;

public class HalfPyramidExample {

	public static void main(String[] args) {
		printHalfPyramid(6);
	}

	private static void printHalfPyramid(int n) {
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
}
