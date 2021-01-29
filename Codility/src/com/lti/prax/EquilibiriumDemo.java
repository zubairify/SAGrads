package com.lti.prax;

public class EquilibiriumDemo {
	public static void main(String[] args) {
		int[] A = {-1,3,-4,5,1,-6,2,1};
		int[] A2 = {9,4,1,5,1,3,4};
		System.out.println(solution(A2));
	}

	private static int solution(int[] A) {
		if(A.length == 0)
			return -1;
		
		for (int i = 0; i < A.length; i++) {
			int sumLeft = 0;
			int sumRight = 0;
			int n = 0;
			
			for (int j = 0; j < A.length; j++) 
				if(n < A[j])
					n = A[j];
			
			for (int j = 0; j < i; j++) 
				sumLeft += A[j];
			
			for (int j = i+1; j < A.length; j++) 
				sumRight += A[j];
			
			if(sumLeft == sumRight)
				return i;
		}
		return -1;
	}
}
