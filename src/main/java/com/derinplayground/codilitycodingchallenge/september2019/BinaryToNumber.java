package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class BinaryToNumber {
	
	private static final Logger logger = LogManager.getLogger(BinaryToNumber.class);

	public static void main(String[] args) {
		String S = "011100";
		int numOfSteps = solution(S);
		logger.debug("numOfSteps is: " + numOfSteps);
	}

	private static int solution(String s) {
		int number = Integer.parseInt(s,2);
		int stepCount = 0;
		for (int countDown = number; countDown > 0 ;) {
			if(countDown % 2 == 0) {
				countDown /= 2;
			} else {
				countDown -= 1;
			}
			
			stepCount += 1;
		}
		return stepCount;
	}

}
