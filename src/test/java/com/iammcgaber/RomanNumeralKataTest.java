package com.iammcgaber;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralKataTest {
	RomanNumeralKata kata;
	
	@Before
	public void create_new_object() {
		kata = new RomanNumeralKata();
	}
	
	@Test
	public void see_kata_object_is_not_null() {
		Assert.assertNotNull(kata);
	}

}
