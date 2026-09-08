package com.collection.list;

import java.util.ArrayList;

public class Students 
{

	public static void main(String[] args) 
	{
		//Create ArrayList
		ArrayList<String> student = new ArrayList<String>();
		
		//Add Names Of Students.
		student.add("Ahmad");
		student.add("Atifa");
		student.add("Aboozar");
		student.add("Tabrez");
		
		//Display ArrayList.
		System.out.println("Name Of Students : "+student);
		
		//Size of List.
		System.out.println("Numbers of Students : "+student.size());

	}

}
