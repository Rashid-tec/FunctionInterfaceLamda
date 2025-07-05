package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull {

	public static void main(String[] args) {
		//Filter a list to remove null or empty strings using stream.
		
		List<String> l= Arrays.asList("a","b","",null," ",null,"Rashid","d","d","m");
		
		List<String>list=l.stream().filter(s->s!=null && !s.trim().isEmpty()
				&& !s.equals("Rashid"))
		.collect(Collectors.toList());
		System.out.println(list);
		

	}

}
