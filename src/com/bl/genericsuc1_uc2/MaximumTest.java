
package com.bl.genericsuc1_uc2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

	@Test
	// Test Case for the Integer where max_Value at First Position
	public void integerAtFirstPosition() {
		MaximumValue log = new MaximumValue();
		int actualResult = log.findMax(16, 15, 10);
		System.out.println("First Position is: " + actualResult);
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	// Test Case for the Integer where max_Value at second Position
	public void integerAtSecondPosition() {
		MaximumValue log = new MaximumValue();
		int actualResult = log.findMax(10, 15, 11);
		System.out.println("Second Position is: " + actualResult);
		int expectedResult = 15;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the Integer where max_Value at Third Position
	@Test
	public void integerAtThirdPosition() {
		MaximumValue log = new MaximumValue();
		int actualResult = log.findMax(11, 10, 12);
		System.out.println("Third Position is: " + actualResult);
		int expectedResult = 12;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the float where max_Value at First Position
	@Test
	public void floatAtFirstPosition() {
		MaximumValue log = new MaximumValue();
		float actualResult = log.findMax(11.2f, 10.3f, 9.4f);
		float expectedResult = 11.2f;
		assertEquals(expectedResult, actualResult);
	}

	// Test Case for the float where max_Value at second Position
	@Test
	public void given3FloatValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		MaximumValue log = new MaximumValue();
		float actualResult = log.findMax(11.2f, 12.3f, 9.4f);
		float expectedResult = 12.3f;
		assertEquals(expectedResult, actualResult);
	}

	// Test Case for the float where max_Value at third Position
	@Test
	public void given3FloatValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
		MaximumValue log = new MaximumValue();
		float actualResult = log.findMax(11.2f, 10.3f, 99.4f);
		float expectedResult = 99.4f;
		assertEquals(expectedResult, actualResult);
	}

	// Test Case for the String where max_Value at First Position
	@Test
	public void stringAtFirstPosition() {
		MaximumValue log = new MaximumValue();
		String actualResult = log.findMax("Banana", "Peach", "Apple");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the String where max_Value at Second Position
	@Test
	public void stringAtSecondPosition() {
		MaximumValue log = new MaximumValue();
		String actualResult = log.findMax("Banana", "Peach", "Apple");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

	//  Test Case for the String where max_Value at third Position
	@Test
	public void stringAtThirdPosition() {
		MaximumValue log = new MaximumValue();
		String actualResult = log.findMax("Banana", "Apple", "Peach");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

}
