package com.lti.time;

public class TimeComplexity {

	public static void main(String[] args) {
		String[] fruits = {"Apple","Banana","Cherry","Kiwi","Orange","Grapes"};
		
		// Check whether Apple exist - O(1) 
		// Check whether Cherry exist - length/2 -> O(log n)
		// Check whether Orange exist - O(n)
		// Find any fruit using O(log n)
		
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals("Apple")) {
				System.out.println("Pisition: " + i);
				break;
			}
		}
		
		// fruits.length/2 middle element
		// From there move in both directions
	}
}
