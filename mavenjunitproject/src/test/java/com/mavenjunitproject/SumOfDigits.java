package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfDigits {
	public static int sum(int n) {
		int sum=0;
		int d=0;
		while(n!=0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}
	@Test
	public void sumTest() {
		assertEquals(15,sum(456));
	}
	

}
