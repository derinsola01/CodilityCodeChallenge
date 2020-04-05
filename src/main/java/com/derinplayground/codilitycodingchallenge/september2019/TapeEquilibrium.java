package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Derin Gbadebo
 */

public class TapeEquilibrium {
	
	private static final Logger logger = LogManager.getLogger(TapeEquilibrium.class);

	public static void main(String[] args) {
		int[] givenArray = {3,1,2,4,3};
		int lowestDiff = findLowestDifferential(givenArray);
		logger.debug("lowestDiff holds:\t" + lowestDiff);
	}

	private static int findLowestDifferential(int[] givenArray) {
		int arrLen = givenArray.length;
		int firstElement = givenArray[0];
		int arraySumLessOne = 0;
		
		for (int outerIndex = 1; outerIndex < arrLen; outerIndex++) {
			arraySumLessOne += givenArray[outerIndex];
		}
		
		int ElementSumDiff = Math.abs(arraySumLessOne - firstElement);
		
		for (int diffIndex = 1; diffIndex < arrLen - 1; diffIndex++) {
			arraySumLessOne -= givenArray[diffIndex];
			firstElement += givenArray[diffIndex];
			int indexDiff = Math.abs(firstElement - arraySumLessOne);
			ElementSumDiff = (ElementSumDiff > indexDiff)
					? indexDiff : ElementSumDiff;
		}
		
		return ElementSumDiff;
	}

}
