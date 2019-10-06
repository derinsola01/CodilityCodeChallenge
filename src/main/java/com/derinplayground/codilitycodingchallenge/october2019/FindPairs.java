package com.derinplayground.codilitycodingchallenge.october2019;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FindPairs {
	
	private static final Logger logger = LogManager.getLogger(FindPairs.class);

	public static void main(String[] args) {
		int deviceCapacity = 10;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		List<Integer> list5 = new ArrayList<Integer>();
		List<Integer> list6 = new ArrayList<Integer>();
		List<Integer> list7 = new ArrayList<Integer>();
		List<Integer> list8 = new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list2.add(2);
//		list2.add(4);
//		list3.add(3);
//		list3.add(6);
//		list4.add(1);
//		list4.add(2);
		
		
		list1.add(1);
		list1.add(3);
		list2.add(2);
		list2.add(5);
		list3.add(3);
		list3.add(7);
		list4.add(4);
		list4.add(10);
		list5.add(1);
		list5.add(2);
		list6.add(2);
		list6.add(3);
		list7.add(3);
		list7.add(4);
		list8.add(4);
		list8.add(5);
		
//		list1.add(2);
//		list1.add(4);
//		list2.add(3);
//		list2.add(14);
//		list3.add(2);
//		list3.add(10);
//		list4.add(3);
//		list4.add(14);
		List<List<Integer>> foregroundAppList = new ArrayList<List<Integer>>();
		
//		foregroundAppList.add(list1);
//		foregroundAppList.add(list2);
//		foregroundAppList.add(list3);
		
		foregroundAppList.add(list1);
		foregroundAppList.add(list2);
		foregroundAppList.add(list3);
		foregroundAppList.add(list4);
		
//		foregroundAppList.add(list1);
//		foregroundAppList.add(list2);
		List<List<Integer>> backgroundAppList = new ArrayList<List<Integer>>();
		
//		backgroundAppList.add(list4);
		
		backgroundAppList.add(list5);
		backgroundAppList.add(list6);
		backgroundAppList.add(list7);
		backgroundAppList.add(list8);
		
//		backgroundAppList.add(list3);
//		backgroundAppList.add(list4);
		List<List<Integer>> result = optimalUtilization(deviceCapacity, foregroundAppList, backgroundAppList);
		logger.debug("result now holds:\t" + result);

	}
	
	public static List<List<Integer>> optimalUtilization(
            int deviceCapacity, 
            List<List<Integer>> foregroundAppList,
            List<List<Integer>> backgroundAppList){
		
		List<List<Integer>> returnList = new ArrayList<List<Integer>>();
		for(List<Integer> outerList : foregroundAppList) {
			for (List<Integer> innerList : backgroundAppList) {
				List<Integer> tempListHolder = new ArrayList<Integer>();
				
				
				if((outerList.get(1) + innerList.get(1)) == deviceCapacity || (((outerList.get(1) + innerList.get(1)) == deviceCapacity - 1)
						&& (backgroundAppList.size() == 1) )) {
					tempListHolder.add(outerList.get(0));
					tempListHolder.add(innerList.get(0));
					returnList.add(tempListHolder);
				}
			}
			
		}
		
		if(returnList.size() == 0) {
			List<Integer> noCorrellation = new ArrayList<Integer>();
			returnList.add(noCorrellation);
		}
		
		return returnList;
	}

}
