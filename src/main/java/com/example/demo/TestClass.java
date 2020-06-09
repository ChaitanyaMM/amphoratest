package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.Entities.Family;
import com.example.Entities.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestClass {

	private static Person personFamilyObject() {
		Family grandParent = new Family();
		grandParent.setId("1");
		grandParent.setName("grandParent");
		grandParent.setAge("70");

		Family parent = new Family();
		parent.setId("1");
		parent.setName("parent");
		parent.setAge("50");

		List<Family> childs = new ArrayList<>();

		Family child1 = new Family();
		child1.setId("1");
		child1.setName("X");
		child1.setAge("5");

		Family child2 = new Family();
		child2.setId("2");
		child2.setName("Y");
		child2.setAge("2");

		childs.add(child1);
		childs.add(child2);

		Person person = new Person();
		person.setId("1");
		person.setName("chaitanya");
		person.setAge("26");
		person.setChilds(childs);
		person.setParent(parent);
		person.setGrandParent(grandParent);

		return person;
	}

	
	public static void sortByAge(Person person) {
		
		
		
		
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		Person person = personFamilyObject();

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(person);

		System.out.println("person family" + jsonString);

	}

}
