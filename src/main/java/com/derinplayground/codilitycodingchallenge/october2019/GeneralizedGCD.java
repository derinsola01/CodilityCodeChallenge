package com.derinplayground.codilitycodingchallenge.october2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeneralizedGCD {
	
	private static final Logger logger = LogManager.getLogger(GeneralizedGCD.class);

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
//		int[] arr = {2,4,6,8,10};
		int num = 5;
		int gcd = getGcdGreedyAlgorithm(num, arr);
		int gcdRecur = getGcdRecursion(num, arr);
		logger.debug("gcd is: " + gcd);
		logger.debug("gcdRecur is: " + gcdRecur);
	}

	private static int getGcdRecursion(int num, int[] arr) {
		int gcd = 0;
		if (arr.length > 0) {
			gcd = arr[0];
			logger.debug("gcd now is: " + gcd);
			for(int index = 1; index < num; index++) {
				gcd = eulerGcdFormula(arr[index], gcd);
			}
		}
		return gcd;
	}

	private static int eulerGcdFormula(int i, int gcd) {
		if (i == 0) {
			return gcd;
		}
		
		return eulerGcdFormula((gcd % i), i);
	}

	private static int getGcdGreedyAlgorithm(int num, int[] arr) {
		int returnNum = 0;
        for(int outerIndex = 1; outerIndex <= num; outerIndex++){
        	int count = 0;
            for(int index = 0; index < arr.length; index++){
                if(arr[index] % outerIndex == 0){
                    count += 1;
                }
            }
            logger.debug("count holds: " + count);
            if (count == num){
                returnNum = (returnNum > outerIndex) ? returnNum : outerIndex;
            }
        }
        return returnNum;
	}

}
