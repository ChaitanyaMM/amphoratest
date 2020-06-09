package com.example.Entities;

import java.util.List;

public class Person {

	private String id;
	private String name;
	private String age;
	private List<Family> childs;
	private Family Parent;
	private Family grandParent;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<Family> getChilds() {
		return childs;
	}

	public void setChilds(List<Family> childs) {
		this.childs = childs;
	}

	public Family getParent() {
		return Parent;
	}

	public void setParent(Family parent) {
		Parent = parent;
	}

	public Family getGrandParent() {
		return grandParent;
	}

	public void setGrandParent(Family grandParent) {
		this.grandParent = grandParent;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", childs=" + childs + ", Parent=" + Parent
				+ ", grandParent=" + grandParent + "]";
	}
	
	
	
	
	

}
