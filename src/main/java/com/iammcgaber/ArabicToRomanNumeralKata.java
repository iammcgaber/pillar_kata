package com.iammcgaber;

import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanNumeralKata {

	
	public String romanNumerals(int val) {
		String[] numerals = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String roman = numerals[val];
		return roman;
	}
}
