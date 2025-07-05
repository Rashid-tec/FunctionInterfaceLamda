package com.test;

import java.util.Optional;

public class OptinalClass {
	public static void main(String[] args) {
		int arr[]= {1,2,3,0,0};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		
		int n=10/2;
		Optional pot=Optional.ofNullable(n) ;
		if(!pot.isPresent())
		{
			System.out.println("value hai");
		}
		else {
			System.out.println("value = "+n);
		}
	}
	
	

}
