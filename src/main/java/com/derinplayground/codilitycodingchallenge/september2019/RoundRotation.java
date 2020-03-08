package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author Derin Gbadebo
 * 
 * Question:
 * 1) Given two words, find if second word is the round rotation of first word.
 * For example: abc, cab
 * return 1
 * since cab is round rotation of ab.
 * 
 * Example2: ab, a.
 * return -1
 * since aa is not round rotation for aa
 *
 */

public class RoundRotation {

	private static Logger logger = LogManager.getLogger(RoundRotation.class);
	
	public static void main(String[] args) {
		String givenString = "abc";
		String expectedString = "abc";
		int rotationResult = getRotationResult(givenString, expectedString);
		logger.debug("rotationResult is: " + rotationResult);
		
	}

	private static int getRotationResult(String givenString, String expectedString) {
		int numOfRotations = 10;
		char[] charArray = givenString.toCharArray();
		int charArrayLoopLength = charArray.length;
		if (charArrayLoopLength <= 1) {
			return 1;
		} else {
			char[] finalArr = new char[charArrayLoopLength];
			for (int index = 0; index < charArrayLoopLength; index++) {
				int tempPos = ((index % charArrayLoopLength) + numOfRotations);
				int position = (tempPos < charArrayLoopLength) ? tempPos : tempPos % charArrayLoopLength;
				finalArr[position] = charArray[index];
			}
			
			String finalString = new String(finalArr);
			logger.debug("finalString is: " + finalString);
			int returnResult = (expectedString.equals(finalString)) ? 1 : -1;
			
			return returnResult;
		}
	}

}
