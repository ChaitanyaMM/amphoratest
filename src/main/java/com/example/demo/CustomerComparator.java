package com.example.demo;

import java.util.Comparator;

import com.example.Entities.Person;

public class CustomerComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getParent().getAge().compareTo(p2.getGrandParent().getAge());

	}

}
