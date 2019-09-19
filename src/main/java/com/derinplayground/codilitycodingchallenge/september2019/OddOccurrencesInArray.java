package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 *
 */

public class OddOccurrencesInArray {
	
	private static final Logger logger = LogManager.getLogger(OddOccurrencesInArray.class);

	public static void main(String[] args) {
		int[] givenArr = {9,3,9,3,9,7,9};
		int unpairedNum = solution(givenArr);
		logger.debug("unpairedNum holds:\t" + unpairedNum);
		
	}

	private static int solution(int[] givenArr) {
		if (givenArr.length == 1) {
			return givenArr[0];
		}
		Arrays.sort(givenArr);
		for(int i = 0; i < givenArr.length; i+=2) {
			if ((i + 1) == givenArr.length) {
				return givenArr[i];
			} else if (givenArr[i] != givenArr[i + 1]) {
				return givenArr[i];
			}
		}
		return 0;
	}

}
