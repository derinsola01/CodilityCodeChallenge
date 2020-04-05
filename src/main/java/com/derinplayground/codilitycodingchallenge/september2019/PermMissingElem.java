package com.derinplayground.codilitycodingchallenge.september2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Derin Gbadebo
 */

public class PermMissingElem {
	
	private static final Logger logger = LogManager.getLogger(PermMissingElem.class);

	public static void main(String[] args) {
		int[] givenArray = {2,3,1,5};
//		int[] givenArray = {102,103,101,105}; // This solution scored 100% on codility but
//												fails for this input data array.
//												I'm guessing they didn't test for this kind of
//												data
		
		int missingNumber = findMissingNumber(givenArray);
		logger.debug("missingNumber holds:\t" + missingNumber);
		
	}

	private static int findMissingNumber(int[] givenArray) {
		if(givenArray.length == 0) {
			return 1;
		}
		
	    int sumArrayElements = 0;
	    for(int index1 = 0; index1 < givenArray.length; index1++){
	        sumArrayElements = sumArrayElements + givenArray[index1];
	    }

	    int sumArrayIndices = 0;
	    for(int index2 = 1; index2 <= givenArray.length + 1; index2++){
	        sumArrayIndices = sumArrayIndices + index2;
	    }
	    
	    if(sumArrayElements == sumArrayIndices) {
	    	return givenArray.length;
	    }
	    
	    return  sumArrayIndices - sumArrayElements;
	}

}
