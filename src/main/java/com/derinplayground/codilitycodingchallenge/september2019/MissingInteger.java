package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MissingInteger {
	
	private static final Logger logger = LogManager.getLogger(MissingInteger.class);

	public static void main(String[] args) {
		int[] arrayOfNumbers = {1, 3, 6, 4, 1, 2};
		int lowestPositive = getLowestPositiveNumber(arrayOfNumbers);
		logger.debug("lowestPositive is:\t" + lowestPositive);
	}

	private static int getLowestPositiveNumber(int[] arrayOfNumbers) {
		int lowestNumber = 0;
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		int lengthArrayOfNumbers = arrayOfNumbers.length;
		for (int index = 0; index < lengthArrayOfNumbers; index++) {
			setOfNumbers.add(arrayOfNumbers[index]);
		}
		for(int anotherIndex = 1; anotherIndex <= lengthArrayOfNumbers + 1; anotherIndex++) {
			if(!setOfNumbers.contains(anotherIndex)) {
				return lowestNumber = anotherIndex;
			}
		}
		return lowestNumber;
	}

}
