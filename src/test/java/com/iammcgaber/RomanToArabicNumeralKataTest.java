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
	
	@Test
	public void enter_XXXIX_returns_39() {
		//Act
		output = kata.arabicNumerals("XXXIX");
		
		//Assert
		Assert.assertEquals(39, output);
	}
	
	//At this point we can convert anything up to 39.
	
	@Test
	public void enter_XL_returns_40() {
		//Act
		output = kata.arabicNumerals("XL");
		
		//Assert
		Assert.assertEquals(40, output);
	}
	
	@Test
	public void enter_L_returns_50() {
		//Act
		output = kata.arabicNumerals("L");
		
		//Assert
		Assert.assertEquals(50, output);
	}
	
	@Test
	public void enter_C_returns_100() {
		//Act
		output = kata.arabicNumerals("C");
		
		//Assert
		Assert.assertEquals(100, output);
	}
	
	@Test
	public void enter_M_returns_1000() {
		//Act
		output = kata.arabicNumerals("M");
		
		//Assert
		Assert.assertEquals(1000, output);
	}
	
	@Test
	public void enter_MCCXXXIV_returns_1234() {
		//Act
		output = kata.arabicNumerals("MCCXXXIV");
		
		//Assert
		Assert.assertEquals(1234, output);
	}
	
	@Test
	public void enter_MCCCXIII_returns_1313() {
		//Act
		output = kata.arabicNumerals("MCCCXIII");
		
		//Assert
		Assert.assertEquals(1313, output);
	}
	
	@Test
	public void enter_MMMMCMXCIX_returns_4999() {
		//Act
		output = kata.arabicNumerals("MMMMCMXCIX");
		
		//Assert
		Assert.assertEquals(4999, output);
	}
	
	@Test
	public void enter_empty_string_returns_zero() {
		//Act
		output = kata.arabicNumerals("");
		
		//Assert
		Assert.assertEquals(0, output);
	}
	
	//At this point any number up to 4999 can be converted successfully.
	
}
