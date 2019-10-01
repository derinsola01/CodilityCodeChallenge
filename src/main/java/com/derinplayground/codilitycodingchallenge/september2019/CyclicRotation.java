package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author Derin Gbadebo
 *
 */
public class CyclicRotation {
	
	private static final Logger logger = LogManager.getLogger(CyclicRotation.class);

	public static void main(String[] args) {
//		int[] givenArr = {3, 8, 9, 7, 6};  
		int[] givenArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; 
//		int[] givenArr = {1, 2, 3, 4, 5}; 
		int numOfRotations = 10 - 3;
		int[] finalArr = rotateTheArray(givenArr, numOfRotations);
		logger.debug("finalArr holds:\t" + Arrays.toString(finalArr));
	}

	private static int[] rotateTheArray(int[] givenArr, int numOfRotations) {
		int len = givenArr.length;
		int[] finalArr = new int[len];
		for (int index = 0; index < len; index++) {
			int tempPos = ((index % len) + numOfRotations);
			int position = (tempPos < len) ? tempPos : tempPos % len;
			finalArr[position] = givenArr[index];
		}
		return finalArr;
	}

}
