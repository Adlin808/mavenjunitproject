package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOdd {
	String ans="";
	public void evenOdd(int num) {
		if(num%2==0) {
			ans="even";
			//return "even";
		}
		else {
			ans="odd";
			//return "odd";
		}
	}
	@Test
	public void evenOddTest() {
		evenOdd(4);
		System.out.println(ans);
		assertEquals("even",ans);
	}

}
