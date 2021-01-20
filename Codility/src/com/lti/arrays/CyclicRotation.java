package com.lti.arrays;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		int[] cycle1 = cr.solution(new int[] { 7, 2, 8, 3, 5 }, 2);
		int[] cycle2 = cr.solution(new int[] { 7, 2, 8, 3, 5 }, 3);

		System.out.println(Arrays.toString(cycle1));
		System.out.println(Arrays.toString(cycle2));
	}

	public int[] solution(int[] A, int K) {
		int[] result = new int[A.length];

		for (int i = 0; i < result.length; i++) {
			result[(i + K) % A.length] = A[i];
		}

		return result;
	}
}
