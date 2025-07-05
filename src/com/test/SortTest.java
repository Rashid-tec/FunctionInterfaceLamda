package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {
		//Sort a list of employees by name, then by salary.
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1,"Rashid",500));
		emp.add(new Employee(2,"shabana",800));
		emp.add(new Employee(4,"Dipansu",200));
		emp.add(new Employee(3,"toly",100));
		
		List<Employee> sorted = emp.stream()
	            .sorted(Comparator.comparing(Employee::getName)
	                              .thenComparing(Employee::getSlalry))
	            .collect(Collectors.toList());

	        // Print sorted list
	        sorted.forEach(System.out::println);
	        
	        List<Employee> sorted1= emp.stream()
	        	    .sorted(Comparator.comparing(Employee::getName))
	        	    .collect(Collectors.toList());
	        sorted1.forEach(System.out::println);
	        
	        //Get top 3 highest paid employees.
	       List<Employee> s= emp.stream().sorted((e1,e2)->Double.compare(e2.getSlalry(), e1.getSlalry()))
	    		   .limit(3).collect(Collectors.toList());
	       System.out.println("top salsary"+s);
	       
	    }
	}
	


