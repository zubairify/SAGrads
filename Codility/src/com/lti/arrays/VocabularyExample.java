package com.lti.arrays;

public class VocabularyExample {

	public static void main(String[] args) {
		String[] vocab = { "is", "are", "am", "of", "an", "a" };
		String quote = "Going to goa";

		// Write a logic to check if the quote is valid or not
		// Quote must contain at least a word from vocab
		boolean flag = false;
		for (String word : vocab) {
			if (quote.contains(word)) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "Valid quote" : "Invalid quote");
	}
}
