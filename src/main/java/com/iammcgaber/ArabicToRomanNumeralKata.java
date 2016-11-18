package com.iammcgaber;

import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanNumeralKata {

	
	public String romanNumerals(int val) {
		String roman = "";
		if(val == 1) {
			roman = "I";
		}
		else {
			roman = "V";
		}
		return roman;
	}
}
