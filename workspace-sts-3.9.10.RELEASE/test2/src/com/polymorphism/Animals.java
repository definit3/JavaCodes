package com.polymorphism;

public class Animals {
	boolean mammal;
	
	public Animals()
	{
		this.mammal=true;
	}
	
	@Override
	public String toString() {
		return "Animals [mammal=" + mammal + "]";
	}

	public Animals(boolean mammal) {
		super();
		this.mammal = mammal;
	}

	public boolean isMammal() {
		return mammal;
	}

	public void setMammal(boolean mammal) {
		this.mammal = mammal;
	}
	
}
