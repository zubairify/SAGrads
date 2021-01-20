package com.lti.iteration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		List<String> days = Arrays.asList(week);
		
//		days.forEach(System.out::println);
		
		for (String day : days) 
			System.out.println(day);
		
		System.out.println("-- Set output");
		Set<String> dayset = new HashSet<String>(days);
		dayset.forEach(System.out::println);
		
		System.out.println("-- Sorted array");
		Arrays.sort(week);
		for (String day : week) 
			System.out.println(day);
		
		TreeSet<String> daysort = new TreeSet<String>(dayset);
		System.out.println("-- TreeSet output");
		daysort.forEach(System.out::println);
		
		Map<String, String> daymap = new HashMap<String, String>();
		daymap.put("sun", "Sunday");
		// add all days
		
		Set<String> keys = daymap.keySet();
		for (String day : keys) 
			System.out.println(day + " stands for " + daymap.get(day));
	}
}
