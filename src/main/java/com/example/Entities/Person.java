package com.example.Entities;

import java.util.ArrayList;
import java.util.List;


//a person could have multiple children
// immediate parent
// person immediate parents could have their immediate parents
public class Person {

	private String name;
	private Integer age;
	private List<Child> childs = new ArrayList<>();
	private Parent Parent;
	private Parent grandParent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Child> getChilds() {
		return childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public Parent getParent() {
		return Parent;
	}

	public void setParent(Parent parent) {
		Parent = parent;
	}

	public Parent getGrandParent() {
		return grandParent;
	}

	public void setGrandParent(Parent grandParent) {
		this.grandParent = grandParent;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", childs=" + childs + ", Parent=" + Parent + ", grandParent="
				+ grandParent + "]";
	}

}
