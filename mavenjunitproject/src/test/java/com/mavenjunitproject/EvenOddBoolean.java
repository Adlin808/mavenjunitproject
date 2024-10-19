package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EvenOddBoolean {
	
	public static boolean evenOdd(int num) {
		boolean result=false;
		if(num%2==0) {
			result= true;
		}
		return result;
		}
	
	@Test
	public void evenOddTest() {
		
		//System.out.println(ans);
		assertTrue(evenOdd(23));
	}
	
}


