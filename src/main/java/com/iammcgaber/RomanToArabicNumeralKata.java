package com.iammcgaber;

import java.util.Map;
import java.util.TreeMap;

public class RomanToArabicNumeralKata {
	public int arabicNumerals(String roman) {
		int converted = 0;
		int value;
		
		Map<String, Integer> numeralValue = new TreeMap<String, Integer>();
		numeralValue.put("", 0);
		numeralValue.put("I", 1);
		numeralValue.put("V", 5);
		numeralValue.put("X", 10);
		numeralValue.put("L", 50);
		numeralValue.put("C", 100);
		numeralValue.put("D", 500);
		numeralValue.put("M", 1000);
		
		String[] broken = roman.split("");
		
		for (int i = 0; i < broken.length; i++) {
			value = numeralValue.get(broken[i]);
			if (i > 0 && value > numeralValue.get(broken[i-1])) {
				converted += value - (numeralValue.get(broken[i-1]) * 2);
			}
			else {
				converted += value;
			}
		}
		
		return converted;
	}
	
}
