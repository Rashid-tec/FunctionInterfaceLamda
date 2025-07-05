package com.test;

import java.util.Arrays;
import java.util.List;

public class ListType {

	public static void main(String[] args) {
		List<Integer> l=List.of(1,2,3,4);
		//l.remove(2);//java.lang.UnsupportedOperationException
		
		
		System.out.println(l);
		List<Integer> l1=Arrays.asList(null,1,2,3);
		//l1.add(4);//java.lang.UnsupportedOperationException
		//l1.set(0, 8);
		//l1.remove(0);//java.lang.UnsupportedOperationException
		System.out.println(l1);

	}

}
