package com.iammcgaber;

import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanNumeralKata {

	
	public String romanNumerals(int val) {
		String roman;
		String stringValue;
		String[] singles = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] doubles = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] tripples = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] quadruples = new String[]{"", "M", "MM", "MMM", "MMMM"};
		if (val < 10) {
			roman = singles[val];
		}
		else if (val < 100) {
			stringValue = Integer.toString(val);
			roman = doubles[Integer.parseInt(stringValue.substring(0, 1))];
			roman = roman + singles[Integer.parseInt(stringValue.substring(1))];
		}
		else if (val < 1000) {
			stringValue = Integer.toString(val);
			roman = tripples[Integer.parseInt(stringValue.substring(0, 1))];
			roman = roman + doubles[Integer.parseInt(stringValue.substring(1, 2))];
			roman = roman + singles[Integer.parseInt(stringValue.substring(2))];
		}
		else {
			stringValue = Integer.toString(val);
			roman = quadruples[Integer.parseInt(stringValue.substring(0, 1))];
			roman = roman + tripples[Integer.parseInt(stringValue.substring(1, 2))];
			roman = roman + doubles[Integer.parseInt(stringValue.substring(2, 3))];
			roman = roman + singles[Integer.parseInt(stringValue.substring(3))];
		}
		
		return roman;
	}
}
