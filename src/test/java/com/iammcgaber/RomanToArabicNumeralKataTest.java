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
	
	@Test
	public void enter_V_returns_5() {
		//Act
		output = kata.arabicNumerals("V");
		
		//Assert
		Assert.assertEquals(5, output);
	}
	
	@Test
	public void enter_X_returns_10() {
		//Act
		output = kata.arabicNumerals("X");
		
		//Assert
		Assert.assertEquals(10, output);
	}
	
	@Test
	public void enter_XII_returns_12() {
		//Act
		output = kata.arabicNumerals("XII");
		
		//Assert
		Assert.assertEquals(12, output);
	}
	
	@Test
	public void enter_XXII_returns_22() {
		//Act
		output = kata.arabicNumerals("XXII");
		
		//Assert
		Assert.assertEquals(22, output);
	}
	
}
