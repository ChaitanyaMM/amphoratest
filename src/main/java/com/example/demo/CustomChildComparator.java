package com.example.demo;

import java.util.Comparator;

import com.example.Entities.Child;

public class CustomChildComparator implements Comparator<Child> {

	@Override
	public int compare(Child c1, Child c2) {
		return c1.getAge().compareTo(c2.getAge());  
		
	}
	

}
