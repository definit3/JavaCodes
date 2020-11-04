package com.polymorphism;

public class Humans extends Animals {
	public Humans(boolean mammal, String nationality) {
		super(mammal);
		this.nationality = nationality;
	}

	private String nationality;

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		String s=super.toString();
		return s+ "Humans haha [nationality=" + nationality + "]";
	}
	
}
