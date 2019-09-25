package com.derinplayground.codilitycodingchallenge.september2019;

import junit.framework.TestCase;
import com.derinplayground.codilitycodingchallenge.september2019.PassingCars;

public class PassingCarsTest extends TestCase {
	
	private static PassingCars passingCars;
	
    public void testPassingCarsPairs(){
    	int[] array1 = {0, 1, 0, 1, 1, 0, 1, 1};
    	int[] array2 = {0, 1, 0, 1, 1};
        assertTrue(passingCars.passingCarsPairs(array1) == 11);
        assertTrue(passingCars.passingCarsPairs(array2) == 5);
    }

}
