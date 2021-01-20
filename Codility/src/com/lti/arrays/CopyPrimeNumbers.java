package com.lti.arrays;

import java.util.Arrays;

public class CopyPrimeNumbers {

	public static void main(String[] args) {
		// Store first 10 prime numbers into this array
		int[] prime = new int[10];
		
		// Logic here
		int num = 2;
		int idx = 0;
		boolean flag = true;
		while(idx < 10) {
			for(int c=2; c<num; c++) {
				if(num % c == 0) {
					flag = false;
					break;
				}
			}
			if(flag) prime[idx ++] = num;
			num++;
			flag = true;
		}
		System.out.println(Arrays.toString(prime));
	}
}
