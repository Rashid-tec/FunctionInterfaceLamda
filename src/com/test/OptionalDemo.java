package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(null);
		l.add(3);
		l.add(5);
		l.add(null);
		System.out.println(l);
		  List<Integer>t1=l.stream().filter(m->m!=null).collect(Collectors.toList());
	      System.out.println(t1);
	}

}
