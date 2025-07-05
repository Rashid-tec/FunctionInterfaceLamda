package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListConvertString {
	
	//Convert a list of strings to uppercase using streams
	public static void main(String[] args) {
		List<String> l=Arrays.asList("rashhid  ","khanb  ","vijay");
		l.stream().map(m->m.toUpperCase()).collect(Collectors.toList())
		.forEach(System.out::print);
		
	}
	
	

}
