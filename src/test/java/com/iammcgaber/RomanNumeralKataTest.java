package com.iammcgaber;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralKataTest {
	ArabicToRomanNumeralKata kata;
	
	@Before
	public void create_new_object() {
		kata = new ArabicToRomanNumeralKata();
	}
	
	@Test
	public void see_kata_object_is_not_null() {
		Assert.assertNotNull(kata);
	}
	
	@Test
	public void takes_1_returns_I() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(1);
		
		//Assert
		Assert.assertEquals("I", output);
	}
	
	@Test
	public void takes_5_returns_V() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(5);
		
		//Assert
		Assert.assertEquals("V", output);
	}
	
	@Test
	public void takes_2_returns_II() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(2);
		
		//Assert
		Assert.assertEquals("II", output);
	}
	
	@Test
	public void takes_7_returns_VII() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(7);
		
		//Assert
		Assert.assertEquals("VII", output);
	}
	
	//At this point, everything under 10 should pass.  The next tests will go beyond that.

	
	@Test
	public void takes_11_returns_XI() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(11);
		
		//Assert
		Assert.assertEquals("XI", output);
	}
	
	@Test
	public void takes_18_returns_XVIII() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(18);
		
		//Assert
		Assert.assertEquals("XVIII", output);
	}
	
	@Test
	public void takes_21_returns_XXI() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(21);
		
		//Assert
		Assert.assertEquals("XXI", output);
	}
	
	@Test
	public void takes_99_returns_XCIX() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(99);
		
		//Assert
		Assert.assertEquals("XCIX", output);
	}
	
	@Test
	public void takes_100_returns_C() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(100);
		
		//Assert
		Assert.assertEquals("C", output);
	}
	
	@Test
	public void takes_101_returns_CI() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(101);
		
		//Assert
		Assert.assertEquals("CI", output);
	}
	
	@Test
	public void takes_734_returns_DCCXXXIV() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(734);
		
		//Assert
		Assert.assertEquals("DCCXXXIV", output);
	}
	
	@Test
	public void takes_777_returns_DCCLXXVII() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(777);
		
		//Assert
		Assert.assertEquals("DCCLXXVII", output);
	}
	
	@Test
	public void takes_999_returns_CMXCIX() {
		//Arrange
		
		
		//Act
		String output = kata.romanNumerals(999);
		
		//Assert
		Assert.assertEquals("CMXCIX", output);
	}
	
}
