package com.iammcgaber;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToArabicNumeralKataTest {
	RomanToArabicNumeralKata kata;
	int output;
	
	@Before
	public void create_new_object() {
		kata = new RomanToArabicNumeralKata();
	}
	
	@Test
	public void test_that_kata_object_is_not_null() {
		//Arrange
		
		
		//Act
		
		
		//Assert
		Assert.assertNotNull(kata);
	}
	
	@Test
	public void enter_I_returns_1() {
		//Act
		output = kata.arabicNumerals("I");
		
		//Assert
		Assert.assertEquals(1, output);
	}
	
	
}
