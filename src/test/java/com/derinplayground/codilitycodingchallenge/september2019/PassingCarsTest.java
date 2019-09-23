package com.derinplayground.codilitycodingchallenge.september2019;

import junit.framework.TestCase;

public class PassingCarsTest extends TestCase {
	
    public void testApp(){
    	int[] array1 = {0, 1, 0, 1, 1, 0, 1, 1};
    	int[] array2 = {0, 1, 0, 1, 1};
        assertTrue( true );
        assertTrue(PassingCars.passingCarsPairs(array1) == 11);
        assertTrue(PassingCars.passingCarsPairs(array2) == 5);
    }

}
