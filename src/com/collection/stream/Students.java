package com.collection.stream;

import java.util.ArrayList;

public class Students 
{

	public static void main(String[] args) 
	{
		ArrayList<String> student = new ArrayList<String>();
		
		student.add("Ahmad");
		student.add("Atifa");
		student.add("Aboozar");
		student.add("Tabrez");
		student.add("Neha");
		
		System.out.println("Students : "+student);
		System.out.println("Number of Students : "+student.size());
		System.out.println("First Students : "+student.getFirst());
		System.out.println("Last Students : "+student.getLast());
	}

}
