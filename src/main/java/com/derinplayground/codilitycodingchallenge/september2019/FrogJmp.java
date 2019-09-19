package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 *
 */

public class FrogJmp {
	
	private static final Logger logger = LogManager.getLogger(FrogJmp.class);

	public static void main(String[] args) {
		int startingPoint = 10;
		int destinationPoint = 85;
		int moveDistance = 30;
		
		int numberOfMoves = getNumberOfJumps(startingPoint, destinationPoint, moveDistance);
		logger.debug("numberOfMoves holds:\t" + numberOfMoves);
	}

	private static int getNumberOfJumps(int startingPoint, int destinationPoint, int moveDistance) {
		int difference = destinationPoint - startingPoint;
	    int numberOfMoves = difference / moveDistance;
	    if (difference % moveDistance > 0) {
	        numberOfMoves++;
	    }
	    return numberOfMoves;
	}

}
