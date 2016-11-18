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
}
