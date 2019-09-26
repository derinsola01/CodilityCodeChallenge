package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author Derin Gbadebo
 *
 */

public class MaxCounters {
	
	private static final Logger logger = LogManager.getLogger(MaxCounters.class);

	public static void main(String[] args) {
		int[] arrList = {3, 4, 4, 6, 1, 4, 4};
		int arrSize = 5;
		int[] newArr = getIndexCount(arrSize, arrList);
		logger.debug("newArr after loop holds: " + Arrays.toString(newArr));
	}

	private static int[] getIndexCount(int arrSize, int[] arrList) {
		int[] newArr = new int[arrSize];
		int maxNum = 0;
		for (int index = 0; index < arrList.length; index++) {
			if(arrList[index] <= arrSize) {
				newArr[arrList[index] - 1] += 1;
				if (newArr[arrList[index] - 1] > maxNum) {
					maxNum = newArr[arrList[index] - 1];
				}
			} else {
				Arrays.fill(newArr, maxNum);
			}
		}
		return newArr;
	}

}
