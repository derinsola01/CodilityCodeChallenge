package com.derinplayground.codilitycodingchallenge.october2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CellStates {
	
	private static final Logger logger = LogManager.getLogger(CellStates.class);

	public static void main(String[] args) {
//		int[] givenArr = {1,0,0,0,0,1,0,0};
		int[] givenArr = {1,1,1,0,1,1,1,1};
		int days = 2;
		List<Integer> returnedList = getNewStates(givenArr, days);
		logger.debug("returnedList holds:\t" + returnedList);
	}

	private static List<Integer> getNewStates(int[] states, int days) {
		List<Integer> returnList = new ArrayList<Integer>();
		
		if (days > 0) {
			for(int outerIndex = 0; outerIndex < days; outerIndex++) {
				int[] tempArrHolder = Arrays.copyOf(states, states.length);
				for(int innerIndex = 0; innerIndex < states.length; innerIndex++) {
					if((innerIndex - 1) < 0) {
						if ((states[innerIndex + 1] == 0)) {
							tempArrHolder[innerIndex] = 0;
						} else {
							tempArrHolder[innerIndex] = 1;
						}
					} else if((innerIndex + 1) == states.length) {
						if ((states[innerIndex - 1] == 0)) {
							tempArrHolder[innerIndex] = 0;
						} else {
							tempArrHolder[innerIndex] = 1;
						}
					} else if (((states[innerIndex - 1] == 1) &&  (states[innerIndex + 1] == 1)) ||
							((states[innerIndex - 1] == 0) &&  (states[innerIndex + 1] == 0))) {
						tempArrHolder[innerIndex] = 0;
					} else if (((states[innerIndex - 1] == 0) &&  (states[innerIndex + 1] == 1)) ||
							((states[innerIndex - 1] == 1) &&  (states[innerIndex + 1] == 0))) {
						tempArrHolder[innerIndex] = 1;
					}
				}
				states = tempArrHolder;
			}
			
			for(int ij = 0; ij < states.length; ij++) {
				returnList.add(states[ij]);
			}
			
		} else {
			for(int index = 0; index < states.length; index++) {
				returnList.add(states[index]);
			}
		}

		return returnList;
	}

}
