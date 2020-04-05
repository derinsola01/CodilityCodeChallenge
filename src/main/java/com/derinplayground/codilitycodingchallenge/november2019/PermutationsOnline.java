package com.derinplayground.codilitycodingchallenge.november2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PermutationsOnline {
	
	private static Logger logger = LogManager.getLogger(PermutationsOnline.class);

	public static void main(String args[]) { 
	 	permutation("12345"); 
	 } 

	 /* * A method exposed to client to calculate permutation of String in Java. */ 

	 public static void permutation(String input){ 
	 	permutation("", input); 
	 } 

	 /* * Recursive method which actually prints all permutations * of given String, but since we are passing an empty String * as current permutation to start with, * I have made this method private and didn't exposed it to client. */ 

	 private static void permutation(String perm, String word) { 
	 	if (word.isEmpty()) { 
	 		logger.debug(perm + word);
	 		System.err.println("Derin");
	 	} else { 
	 		for (int i = 0; i < word.length(); i++) { 
	 			permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
	 		} 
	 	} 
	 } 

}