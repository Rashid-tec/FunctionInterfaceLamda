package com.test;

import java.util.Arrays;
import java.util.List;

public class CountStringWithA {

	public static void main(String[] args) {
		//Count how many strings start with “A” in a list using Java 8.
		
		List<String> list=Arrays.asList("Aho","Rash","kumar","ABC","AShow");
		Integer it=(int) list.stream().filter(m->m.startsWith("A")).count();
		System.out.println(it);
	
	}

}
