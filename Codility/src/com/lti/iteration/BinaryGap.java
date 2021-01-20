package com.lti.iteration;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solution(908));
	}
	
	public int solution(int N) {
		int gap = 0;
		
		if(N <= 1)
			return 0;
		
		char[] binaries = Integer.toBinaryString(N).toCharArray();
		System.out.println(binaries);
		
		int temp = 0;
		
		for (int i = 0; i < binaries.length; i++) {
			if(binaries[i] == '0') {
				temp ++;
				continue;
			} else if(binaries[i] == '1') {
				if(temp > gap)
					gap = temp;
				temp = 0;
			}
		}
		
		return gap;
	}
}
