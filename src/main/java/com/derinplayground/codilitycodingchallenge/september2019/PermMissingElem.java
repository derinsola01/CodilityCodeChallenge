package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * 
 * Question:
 * 
 * An array A consisting of N different integers is given. 
 * The array contains integers in the range [1..(N + 1)], 
 * which means that exactly one element is missing.
 * Your goal is to find that missing element.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * that, given an array A, returns the value of the missing element.
 * 
 * For example, given array A such that:
 * 
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * 
 * the function should return 4, as it is the missing element.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
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
