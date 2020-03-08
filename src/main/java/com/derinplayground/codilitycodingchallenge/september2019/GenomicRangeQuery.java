package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class GenomicRangeQuery {
	
	private static final Logger logger = LogManager.getLogger(GenomicRangeQuery.class);

	public static void main(String[] args) {
		String givenString = "CAGCCTA";
		int[] lowerboundArray = {2,5,0};
		int[] upperboundArray = {4,5,6};
		int[] minimumNumbers = getMinimumNumbersInRange(givenString, lowerboundArray, upperboundArray);
		logger.debug("minimumNumbers holds:\t" + Arrays.toString(minimumNumbers));
	}

	private static int[] getMinimumNumbersInRange(String givenString, int[] lowerboundArray, int[] upperboundArray) {
		int arrayLength = lowerboundArray.length;
		int[] minimumNumbers = new int[arrayLength];
		char[] charArray = givenString.toCharArray();
		int[] codeArrayInt = new int[charArray.length];
		
		for (int index = 0; index < charArray.length; index++) {
			if (charArray[index] == 'A') {
				codeArrayInt[index] = 1;
			} else if (charArray[index] == 'C') {
				codeArrayInt[index] = 2;
			} else if (charArray[index] == 'G') {
				codeArrayInt[index] = 3;
			} else {
				codeArrayInt[index] = 4;
			}
		}
		
		int lowerboundLargestNum = 0;
		for (int index = 0; index < arrayLength; index++) {
			lowerboundLargestNum = (lowerboundArray[index] > lowerboundLargestNum) 
					? lowerboundArray[index] : lowerboundLargestNum ;
			lowerboundLargestNum = (upperboundArray[index] > lowerboundLargestNum) 
					? upperboundArray[index] : lowerboundLargestNum ;
		}
		
		if (charArray.length >= lowerboundLargestNum) {
			for(int anotherIndex = 0; anotherIndex < arrayLength; anotherIndex++) {
				int lowNum = codeArrayInt[lowerboundArray[anotherIndex]];
				int highNum = codeArrayInt[upperboundArray[anotherIndex]];
				minimumNumbers[anotherIndex] = (lowNum < highNum) ? lowNum : highNum;
			}
		}
		return minimumNumbers;
	}

}



//Integer[] array = new Integer[listOfIndices.size()];
//listOfIndices.toArray(array);
//Random r = new Random();
//int randomNumber = r.nextInt(array);
//return randomNumber;
