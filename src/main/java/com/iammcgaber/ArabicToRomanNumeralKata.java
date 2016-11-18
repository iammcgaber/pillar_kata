package com.iammcgaber;

import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanNumeralKata {

	
	public String romanNumerals(int val) {
		String converted = "";
		int counter = 0;
		List<String[]> numeralList = new ArrayList<String[]>();
		numeralList.add(new String[0]);
		numeralList.add(new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"});
		numeralList.add(new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"});
		numeralList.add(new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"});
		numeralList.add(new String[]{"", "M", "MM", "MMM", "MMMM"});
		
		String stringified = Integer.toString(val);
		String[] broken = stringified.split("");
		
		
		
		for (int i = broken.length; i > 0; i--) {
			String[] pieceArray = numeralList.get(i);
			int letterNumber = Integer.parseInt(broken[counter]);
			converted += pieceArray[letterNumber];
			counter++;
		}
		
		return converted;
	}
}
