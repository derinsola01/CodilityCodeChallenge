package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MakeUnique {
	
	private static final Logger logger = LogManager.getLogger(MakeUnique.class);

	public static void main(String[] args) {
//		String S = "aaaabbbb";
//		String S = "eeee";
		String S = "ccaaffddecee";
//		String S = "example";
		int minCharToBeDeleted = solution(S);
		logger.debug("minCharToBeDeleted holds: " + minCharToBeDeleted);
	}

	private static int solution(String S) {
		int minCharsToBeDeleted = 0;
		
		List<Character> characterList = new ArrayList<Character>();
        for (char charValue : S.toCharArray()) {
        	characterList.add(charValue);
        }
        
        TreeSet<Character> characterSet = new TreeSet<Character>();
		for (int index = 0; index < S.length(); index++) {
			characterSet.add(characterList.get(index));
		}
		
        List<Integer> elemOccurrences = new ArrayList<Integer>();
        for(Character charElem : characterSet) {
        	int occurrences = Collections.frequency(characterList, charElem);
        	elemOccurrences.add(occurrences);
			
		}
        
        Set<Integer> foundList = new HashSet<Integer>();
		if(characterSet.size() <= 1) {
			return minCharsToBeDeleted;
		} else {
			for (int index = 0; index < elemOccurrences.size(); index++) {
				int listElementForSearch = elemOccurrences.get(index);
				if (elemOccurrences.contains(listElementForSearch)) {
					int occurrences = Collections.frequency(elemOccurrences, listElementForSearch);
					if ((occurrences >= 1) && !foundList.contains(listElementForSearch)) {
						foundList.add(listElementForSearch);
					} else if ((occurrences >= 1) && foundList.contains(listElementForSearch)) {
						int tempElem = listElementForSearch - 1;
						if (!foundList.contains(tempElem)) {
							minCharsToBeDeleted += 1;
							foundList.add(tempElem);
						}
						else {
							minCharsToBeDeleted += listElementForSearch;
						}
					}
					
				}
			}
		}
		return minCharsToBeDeleted;
	}

}



//select distinct tg.name as name, count(tc.group_name) as all_test_cases, count(tc.status = 'OK') as passed_test_cases, tg.test_value*count(tc.group_name) as total_value
//from test_groups tg
//left outer join test_cases tc 
//on tc.group_name = tg.name
//group by tg.name, tg.test_value
//order by total_value desc, name asc
