package com.lti.prax;

public class WeakNumber {
	public static void main(String[] args) {
		int[] A1 = {5,2,5,3,5,3,6,3,6};
		int[] A2 = {3,4,2,5,3,2,6,5,6};
		int[] A3 = {3,4,2,5,3,2,6,5,6,4};
		System.out.println(solution(A1));
	}

	private static int solution(int[] A) {
		boolean flag = true;
		if(A.length == 0)
			return -1;

		for (int i = 0; i < A.length; i++) {
			flag = true;
			for (int j = 0; j < A.length; j++) {
				if(i==j)
					continue;
				
				if(A[j] == A[i]) {
					flag = false;
					break;
				}
			}
			if(flag)
				return A[i];
		}
		return -1;
	}
}
