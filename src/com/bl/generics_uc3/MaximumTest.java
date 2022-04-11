package com.bl.generics_uc3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MaximumTest {

	@Test
	public void integerTest() {
		assertEquals(802, FindGreatestUC3.findGreatest(702, 779, 802));
	}
	
	@Test
	public void doubleTest() {
		assertEquals(882.22, FindGreatestUC3.findGreatest(740.23, 882.22, 561.11));
	}
	
	@Test
	public void stringTest() {
		assertEquals("vishal", FindGreatestUC3.findGreatest("vishal", "Hi", "swati"));
	}
}
