package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PassingCars {
	
	private static final Logger logger = LogManager.getLogger(PassingCars.class);

	public static void main(String[] args) {
		int[] givenArray = {0, 1, 0, 1, 1, 0, 1, 1};
		int numOfPairs = passingCarsPairs(givenArray);
		logger.debug("numOfPairs is: "+ numOfPairs);
	}

	public static int passingCarsPairs(int[] givenArray) {
		int result = 0;
		int tempIncrements = 0;
		for (int index = 0; index < givenArray.length; index++) {
			if (givenArray[index] == 0) {
				tempIncrements += 1;
			} else {
				result += tempIncrements;
			}
			
			if (result > 1000000000) {
				return result = -1;
			}
		}	
		
		
		
		return result;
	}

}
