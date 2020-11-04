package com.polymorphism;

public class Main {
	public static void main(String[] args)
	{
		Animals a=new Animals(true);
		System.out.println(a);
		
		
		Animals h=new Humans(true,"indian");
		System.out.println(h);
		
		Animals s=new Student(true,"indian","vivek");
		System.out.println(s);
		
		Humans human1= new Student(true,"indian","vivekraj");
		Student student1=(Student)human1;
		System.out.println(student1);
	}
}
