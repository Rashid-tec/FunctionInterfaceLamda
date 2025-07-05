package com.test;

import java.util.ArrayList;

public class ConcatinateString {

	public static void main(String[] args) {
		// Concatenate all strings in a list with comma separator.
		String str="Rashid/khan/Vijay/bhai";
		String arr[]=str.split("/");
		ArrayList<String> s1=new ArrayList<>();
		for(String s:arr)
		{
			s1.add(s);
		}
        System.out.println(s1);
	}

}
