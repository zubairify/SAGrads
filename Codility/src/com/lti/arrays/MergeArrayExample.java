package com.lti.arrays;

import java.util.Arrays;

public class MergeArrayExample {

	public static void main(String[] args) {
		int[] first = { 3, 6, 8, 1 };
		int[] second = { 2, 4, 7, 9, 5 };
		// Merge second array into first
		first = mergeArray(first, second);

		System.out.println(Arrays.toString(first));
	}

	private static int[] mergeArray(int[] first, int[] second) {
		// Logic to merge second array into first array
		int flen = first.length; // 4
		int slen = second.length; // 5

		int[] result = new int[first.length + second.length];
		// logic to copy elements of first and second into result array
//		for (int i = 0; i < first.length; i++) 
//			result[i] = first[i];
//		
//		for (int i = 0; i < second.length; i++) 
//			result[flen + i] = second[i];

		// Optimised solution compare to above code
		for (int i = 0; i < (flen > slen ? flen : slen); i++) {
			if (i < flen)
				result[i] = first[i];
			if (i < slen)
				result[i + flen] = second[i];
		}
		return result;
	}
}
