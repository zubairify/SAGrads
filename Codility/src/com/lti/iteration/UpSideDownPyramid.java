package com.lti.iteration;

public class UpSideDownPyramid {

	public static void main(String[] args) {
		// Logic to display 4 levels up side down pyramid of *
		int n = 5;
		for (int r = n; r >= 1; r--) {
			for (int c = n; c > r; c--)
				System.out.print("  ");

			for (int c = 1; c <= ((2 * r) - 1); c++)
				System.out.print("* ");

			System.out.println();
		}
	}
}
