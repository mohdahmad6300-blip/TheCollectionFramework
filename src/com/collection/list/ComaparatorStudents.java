package com.collection.list;

public class ComaparatorStudents 
{
	public String name;
	public int marks;
	public int age;
	public ComaparatorStudents(String name , int marks ,int age)
	{
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return name + " - " + marks + " - Age : " + age;
	}
}
