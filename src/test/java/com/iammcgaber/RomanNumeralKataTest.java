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

}
