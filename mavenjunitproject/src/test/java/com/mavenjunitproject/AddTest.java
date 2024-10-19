package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AddTest {
	static int add(int a,int b) {
		return a+b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int div(int a,int b) {
		return a/b;
	}
	String s1="hello";
	String s2="hello";
	@Test
	public void stringMatch() {
		assertSame(s1,s2);
	}
	@Test
	public void testAdd() {
		assertEquals(4,add(2,2));
	}
	@Test
	public void testMul() {
		assertEquals(14,mul(7,2));
	}
	@Test
	public void testSub() {
		assertEquals(4,sub(6,2));
	}
	@Test
	public void testDiv() {
		assertEquals(4,div(16,4));
	}

}