package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Dominator {
	
	private static final Logger logger = LogManager.getLogger(Dominator.class);

	public static void main(String[] args) {
//		int[] givenArray = {3,2,3,4,3,3,3,-1};
//		int[] givenArray = {3,2,3,4,-1};
		int[] givenArray = {1,2,1};
//		int[] givenArray = {3,4,6,9,6,6,2,3,4,-1,6,6,6,6,6,6,6,1,6,5};
		int result = getDominator(givenArray);
		logger.debug("The dominating number is at index: " + result);
	}

	private static int getDominator(int[] givenArray) {
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		for(int index = 0; index < givenArray.length; index++) {
			setOfNumbers.add(givenArray[index]);
		}
		
		List<Integer> numberCount = new ArrayList<Integer>();
		int[] newSetOfNumbers = new int[setOfNumbers.size()];
		int tempIndex = 0;
		for(int number : setOfNumbers) {
			int count = 0;
			List<Integer> listOfIndices = new ArrayList<Integer>();
			newSetOfNumbers[tempIndex] = number;
			for(int innerIndex = 0; innerIndex < givenArray.length; innerIndex++) {
				if (givenArray[innerIndex] == number) {
					count += 1;
					listOfIndices.add(innerIndex);
				}
			}
			if (count > (givenArray.length/2)) {
				return listOfIndices.get(0);
			}
			numberCount.add(count);
			tempIndex += 1;
		}
		
		return -1;
	}

}
