package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Derin Gbadebo
 *
 */
public class CodilityLongestBinaryGap {
	
	private static final Logger logger = LogManager.getLogger(CodilityLongestBinaryGap.class);

	public static void main(String[] args) {
		int num = 9;
		int gap = getBinaryGap(num);
		logger.debug("gap holds:\t" + gap);
	}
	
	private static int getBinaryGap(int numArr) {
		String number = Integer.toBinaryString(numArr);
		char[] numCharArr = String.valueOf(number).toCharArray();
		int tempGap = 0;
		int gap = 0;
		for(int i = 0; i < numCharArr.length; i++) {
			if (numCharArr[i] == '0') {
				tempGap += 1;
			} else {
				gap = (tempGap > gap) ? tempGap : gap;
				tempGap = 0;
			}
		}
		return gap;
	}

}
