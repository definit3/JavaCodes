package com.polymorphism;

public class Student extends Humans {

	private String name;
	public Student(boolean mammal, String nationality,String name) {
		super(mammal, nationality);
		this.name=name;
	}
	@Override
	public String toString() {
		String s=super.toString();
		return s+"Student [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
