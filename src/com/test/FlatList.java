package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatList {

	public static void main(String[] args) {
		// Flatten a list of list of strings into a single list using flatMap.
		
		List<Integer> l1=Arrays.asList(1,2,3);
		List<Integer> l2=Arrays.asList(1,2,3);
		List<Integer> l3=Stream.of(l1,l2).flatMap(l->l.stream()).collect(Collectors.toList());
		
		System.out.println(l3);

	}

}
