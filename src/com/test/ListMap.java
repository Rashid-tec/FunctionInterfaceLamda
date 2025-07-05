package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {

	public static void main(String[] args) {
		// Convert a List<String> to a Map<String, Integer> (string to length).
       List<String> l=Arrays.asList("Rashid","Nasir","Aasif","Rashid","Nasir");
       Map<String,Integer> map=new HashMap<>();
      for(String s:l)
      {
    	  if(map.containsKey(s))
    	  {
    		 map.put(s, map.get(s)+1) ;
    	  }
    	  else {
    		  map.put(s, 1);
    	  }
    	  //map.put(s, s.length());
      }
      System.out.println(map);
	
	}

}
