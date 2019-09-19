package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 *
 */

public class PermCheck {
	
	private static final Logger logger = LogManager.getLogger(PermCheck.class);

	public static void main(String[] args) {
		int[] givenArray = {4, 1, 3, 2};
		int result = performPermCheck(givenArray);
		logger.debug("result holds:\t" + result);
	}

	private static int performPermCheck(int[] givenArray) {
		Set<Integer> givenArraySet = new HashSet<Integer>();
		Set<Integer> testArraySet = new HashSet<Integer>();
	
		for(int index = 0; index < givenArray.length; index++) {
			givenArraySet.add(givenArray[index]);
			testArraySet.add(index + 1);
		}

		for(int currentElement : testArraySet) {
			if(!givenArraySet.contains(currentElement)) {
				return 0;
			}
		}
		
		return 1;
	}

}
