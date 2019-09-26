package com.derinplayground.codilitycodingchallenge.september2019;

import junit.framework.TestCase;
import com.derinplayground.codilitycodingchallenge.september2019.PassingCars;

public class PassingCarsTest extends TestCase {
	
    public void testPassingCarsPairs(){
    	int[] array1 = {0, 1, 0, 1, 1, 0, 1, 1};
    	int[] array2 = {0, 1, 0, 1, 1};
        assertTrue(PassingCars.passingCarsPairs(array1) == 11);
        assertTrue(PassingCars.passingCarsPairs(array2) == 5);
    }

}
