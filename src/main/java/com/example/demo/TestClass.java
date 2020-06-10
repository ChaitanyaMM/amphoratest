package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.Entities.Child;
import com.example.Entities.Parent;
import com.example.Entities.Person;
import com.fasterxml.jackson.core.JsonProcessingException;

public class TestClass {

	private static Person personFamilyObject() {
		Parent grandParent = new Parent();
		grandParent.setName("grandParent");
		grandParent.setAge(100);

		Parent parent = new Parent();
		parent.setName("parent");
		parent.setAge(40);

		List<Child> childs = new ArrayList<>();

		Child child1 = new Child();
		child1.setName("X");
		child1.setAge(5);

		Child child2 = new Child();
		child2.setName("Y");
		child2.setAge(2);

		childs.add(child1);
		childs.add(child2);

		Person person = new Person();
		person.setName("chaitanya");
		person.setAge(26);
		person.setChilds(childs);
		person.setParent(parent);
		person.setGrandParent(grandParent);

		return person;
	}

	
	// sorting
	public static void sortByAge(Person person) throws JsonProcessingException {
		
		Collections.sort(person.getChilds(),new CustomChildComparator());
		
		 //for parents sorting 
		//Collections.sort(Arrays.asList(p),new CustomerComparator());

		 

		System.out.println("After sorting : " + person);

	}

	public static void main(String[] args) throws JsonProcessingException {
		Person person = personFamilyObject();

		System.out.println("before sorting : " + person);

		sortByAge(person);

	}

}
