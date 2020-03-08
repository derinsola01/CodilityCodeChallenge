package com.derinplayground.codilitycodingchallenge.november2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class RutherniumChallenge2019 {

	private static final Logger logger = LogManager.getLogger(RutherniumChallenge2019.class);

	public static void main(String[] args) {
//		int[] A = {1, 1, 3, 4, 3, 3, 4}; 
//		int[] A = {1, 3, 3, 2};
		int[] A = {4, 5, 5, 4, 2, 2, 4, 4};
		int K = 4;
		int maxNum = getMaximum(A, K);
		logger.debug("maxNum now is: " + maxNum);
	}

	private static int getMaximum(int[] A, int K) {
		int returnNum = 0;
		Map<Integer, Integer> agesAndCount = new HashMap<Integer, Integer>();
		List<Integer> keyList = new ArrayList<Integer>();
		List<Integer> valueList = new ArrayList<Integer>();
		for (int index = 0; index < A.length; index++) {
			if(agesAndCount.containsKey(A[index])) {
				agesAndCount.put(A[index], agesAndCount.get(A[index]) + 1);
			} else {
				agesAndCount.put(A[index], 1);
			}
		}
		
		int max = Collections.max(agesAndCount.values());
		int min = Collections.min(agesAndCount.values());
		int maxKey = 0;
		int minKey = 0;
		
		for(Map.Entry<Integer, Integer> entry : agesAndCount.entrySet()) {	
			keyList.add(entry.getKey());
			valueList.add(entry.getValue());
			if (entry.getValue() == max) {
				maxKey = entry.getKey();
			} else if (entry.getValue() == min) {
				minKey = entry.getKey();
			}
		}
		
		int maxIndex = keyList.indexOf(maxKey);
		int minIndex = keyList.indexOf(minKey);
		if(K == valueList.get(minIndex)) {
			return returnNum = max + valueList.get(minIndex);
		} else if (K < valueList.get(minIndex)) {
			return returnNum = valueList.get(minIndex);
		}
		else if (K > valueList.get(minIndex) && K <= valueList.get(maxIndex)) {
			int tempCounter = 0;
			int tempResult = 0;
			for(int index = 0; index < valueList.size(); index++) {
				if (index == maxIndex) {
					continue;
				} else {
					tempCounter += valueList.get(index);
					if (K == tempCounter) {
						tempResult += tempCounter;
						logger.debug("tempResult is: " + tempResult);
						logger.debug("tempCounter is: " + tempCounter);
					}
				}
			}
			int holder = (tempResult == 0) ? valueList.get(minIndex) : max + tempResult;
			logger.debug("holder is: " + holder);
			logger.debug("tempResult is: " + tempResult);
			return returnNum = holder;
		} else if (K >= valueList.get(maxIndex)) {
			return returnNum = A.length;
		}
		
		return returnNum;
	}

}
