package com.derinplayground.codilitycodingchallenge.september2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MakeUnique {
	
	private static final Logger logger = LogManager.getLogger(MakeUnique.class);

	public static void main(String[] args) {
//		String S = "aaaabbbb";
		String S = "ccaaffddecee";
		int minCharToBeDeleted = solution(S);
		logger.debug("minCharToBeDeleted holds: " + minCharToBeDeleted);
	}

	private static int solution(String S) {
		int minCharsToBeDeleted = 0;
		
		List<Character> characterList = new ArrayList<Character>();
        for (char charValue : S.toCharArray()) {
        	characterList.add(charValue);
        }
        
		Set<Character> characterSet = new HashSet<Character>();
		for (int index = 0; index < S.length(); index++) {
			characterSet.add(characterList.get(index));
		}
		
        Map<Character, Integer> characterOccurrences = new HashMap<Character, Integer>();
        
        for(Character charElem : characterSet) {
        	int occurrences = Collections.frequency(characterList, charElem);
        	characterOccurrences.put(charElem, occurrences);
			
		}
        logger.debug("characterSet holds: " + characterSet);
        logger.debug("characterList holds: " + characterList);
        
        for (Map.Entry<Character, Integer> entry : characterOccurrences.entrySet())  
        	logger.debug("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		
		if(characterSet.size() <= 1) {
			return minCharsToBeDeleted;
		} else {
			
			logger.debug("do something else here");
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
