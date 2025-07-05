package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		// Given a list of integers, return a list with only even numbers.

		List<Integer> list=Arrays.asList(1,2,3,4,54,17);
		List<Integer> even=new ArrayList<>();
		List<Integer> odd=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==0)
			{
				even.add(list.get(i));
			}
			else {
				odd.add(list.get(i));
			}
			
		}
		System.out.println(even);
		System.out.println(odd);
		List<Integer>l=list.stream().filter(f->f%2==0).collect(Collectors.toList());
		System.out.println(l);
	
	}

}
