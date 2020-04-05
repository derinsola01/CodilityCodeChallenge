package com.derinplayground.codilitycodingchallenge.october2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinAvgTwoSlice {
	
	private static final Logger logger = LogManager.getLogger(MinAvgTwoSlice.class);

	public static void main(String[] args) {
		int[] givenArray = {4,2,2,5,1,5,8};
		int startingIndex = getLowestAverageIndex(givenArray);
		logger.debug("startingIndex is: " + startingIndex);
	}

//	Use maps to solve this problem
	private static int getLowestAverageIndex(int[] givenArray) {
		int minIndex = 0;
		double minNumber = 0.00;
		
		for(int outerIndex = 0; outerIndex < givenArray.length - 1; outerIndex++) {
			for(int innerIndex = outerIndex + 1; innerIndex < givenArray.length; innerIndex++) {
				if (minNumber < ((givenArray[innerIndex] + givenArray[outerIndex])/2) ) {
					minNumber = ((givenArray[innerIndex] + givenArray[outerIndex])/2);
					minIndex = outerIndex;
					logger.debug("minNumber is: " + minNumber);
					logger.debug("minIndex is: " + minIndex);
				}
			}
		}
		return minIndex;
	}

}
