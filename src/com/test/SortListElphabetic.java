package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListElphabetic {

	public static void main(String[] args) {
		// Sort a list of strings in reverse alphabetical order using lambda.
		
		List<Character> list=Arrays.asList('d','b','a','c');
		//Collections.sort(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);

	}

}
