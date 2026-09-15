package com.collection.list;

public class StudentsCom implements Comparable<StudentsCom> 
{
	public String name;
	public int marks;
	
	public StudentsCom(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(StudentsCom o) {

		return this.name.toUpperCase().compareTo(o.name.toUpperCase()) ;
	}
	
	@Override
	public String toString()
	{
		return name + " - " + marks;
		
	}
	
}
