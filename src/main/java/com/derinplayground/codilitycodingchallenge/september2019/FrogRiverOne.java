package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 *
 */
public class FrogRiverOne {
	
	private static final Logger logger = LogManager.getLogger(FrogJmp.class);

	public static void main(String[] args) {
		int[] timeArray = {1,3,1,4,2,3,5,4};
		int position = 5;
		
		int bestTime = earliestTimeToCompleteJump(position, timeArray);
		logger.debug("bestTime holds:\t" + bestTime);
	}

	private static int earliestTimeToCompleteJump(int position, int[] timeArray) {
		int result = -1;
		int[] newTimeArray = new int[position + 1];
		int tempPosition = 0;
		for (int time = 0; time < timeArray.length; time++) {
			int timeArrayValue = timeArray[time];
			if(newTimeArray[timeArrayValue] == 0) {
				newTimeArray[timeArrayValue] = timeArrayValue;
				tempPosition += 1;
				if (position == tempPosition) {
					return result = time;
				}
			}
		}
		return result;
	}

}
