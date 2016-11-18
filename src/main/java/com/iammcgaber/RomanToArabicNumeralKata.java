package com.iammcgaber;

public class RomanToArabicNumeralKata {
	public int arabicNumerals(String roman) {
		if(roman.equals("I")) {
			return 1;
		}
		else if (roman.equals("V")) {
			return 5;
		}
		else {
			return 10;
		}
		
	}
	
}
