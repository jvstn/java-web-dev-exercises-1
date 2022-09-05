package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Chpt3Studio {
	public static void main(String[] args) {
		String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
						"So if you move all the terms over to one side, you can put the quadratics into a " +
						"form that can be factored allowing that side of the equation to equal zero. " +
						"Once you’ve done that, it’s pretty straightforward from there.";
		char[] letters = phrase.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<>();
		for (char letter : letters) {
			if (charMap.containsKey(letter)) {
				int oldValue = charMap.get(letter);
				charMap.replace(letter, oldValue + 1);
			} else {
				charMap.put(letter, 1);
			}
		}

		System.out.println(charMap.toString());
	}
}
