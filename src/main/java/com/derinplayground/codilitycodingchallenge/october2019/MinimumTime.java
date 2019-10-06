package com.derinplayground.codilitycodingchallenge.october2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MinimumTime {
	
	private static final Logger logger = LogManager.getLogger(MinimumTime.class);

	public static void main(String[] args) {
		List<Integer> givenArray = new ArrayList<Integer>();
		givenArray.add(4);
		givenArray.add(8);
		givenArray.add(6);
		givenArray.add(12);
		int arrLen = 4;
		int minTime = minimumTime(arrLen, givenArray);
		logger.debug("minTime is: " + minTime);
	}
	
	private static int minimumTime(int numOfSubFiles, List<Integer> files)
    {
		Collections.sort(files);
		int sumOfElements = files.get(0);
		int minTime = 0;
		if (numOfSubFiles == 0) {
			minTime = 0;
		}
		if(numOfSubFiles == 1) {
			minTime += sumOfElements;
		} else if (numOfSubFiles > 1) {
			for(int index = 1; index < files.size(); index++) {
				sumOfElements = sumOfElements + files.get(index);
				minTime += sumOfElements;
			}
		}
		return minTime;
    }

}
