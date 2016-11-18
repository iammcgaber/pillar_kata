package com.iammcgaber;

import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanNumeralKata {

	
	public String romanNumerals(int val) {
		String roman;
		String[] singles = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] doubles = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		if (val < 10) {
			roman = singles[val];
		}
		else {
			String stringValue = Integer.toString(val);
			roman = doubles[Integer.parseInt(stringValue.substring(0, 1))];
			roman = roman + singles[Integer.parseInt(stringValue.substring(1))];
		}
		
		return roman;
	}
}
