package com.lti.arrays;

public class OddOccurrences {

	public static void main(String[] args) {
		int[] a1 = {9,3,9,3,9,7,9};
		int[] a2 = {4,2,5,2,5,6,4};
		int[] a3 = {8,7,8,1,7,1};
		
		OddOccurrences oc = new OddOccurrences();
		System.out.println(oc.solution(a1));
		System.out.println(oc.solution(a2));
		System.out.println(oc.solution(a3));
	}
	
	public int solution(int[] A) {
		int odd = 0;
		
		for (int n : A) 
			odd ^= n;	// odd = odd ^ n; XOR (Exclusive or) operator 
		
		return odd;
	}
}
