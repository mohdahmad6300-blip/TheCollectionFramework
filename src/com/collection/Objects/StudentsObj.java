package com.collection.Objects;

import java.util.ArrayList;
import java.util.Collections;

import com.collection.list.StudentsCom;

public class StudentsObj 
{

	public static void main(String[] args) 
	{
		ArrayList<StudentsCom> students = new ArrayList<StudentsCom>();
		
		students.add(new StudentsCom("Ahmad", 95));
		students.add(new StudentsCom("Aboozar", 90));
		students.add(new StudentsCom("Atifa", 75));
		students.add(new StudentsCom("Tabrez", 80));
		students.add(new StudentsCom("Neha", 65));
		
		System.out.println(" : Sort By Name : ");
		System.out.println(students);
		
		Collections.sort(students);
		
		System.out.println(students);
	}

}
