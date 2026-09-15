package com.collection.Objects;

import java.util.ArrayList;
import java.util.Comparator;

import com.collection.list.ComaparatorStudents;

public class StudentObj 
{

	public static void main(String[] args) 
	{
		ArrayList<ComaparatorStudents> students = new ArrayList<ComaparatorStudents>();
		
		students.add(new ComaparatorStudents("Ahmad", 98,21));
		students.add(new ComaparatorStudents("Aboozar", 90,10));
		students.add(new ComaparatorStudents("Atifa", 80,17));
		students.add(new ComaparatorStudents("Tabrez",88,26));
		students.add(new ComaparatorStudents("Neha", 99,28));
		
		System.out.println("Before Sorting : -");
		System.out.println(students);
		
		Comparator<ComaparatorStudents> marksComparator =
				(s1,s2) -> Integer.compare(s1.marks,s2.marks);
				
				Comparator<ComaparatorStudents> marksComparatorDesc =
						(s1,s2) -> Integer.compare(s2.marks,s1.marks);			
				
		Comparator<ComaparatorStudents> byName =
				(s1,s2) -> s1.name.compareTo(s2.name);		
				
				Comparator<ComaparatorStudents> byAge =
						(s1,s2) -> Integer.compare(s1.age,s2.age);
						
	      students.sort(marksComparator);
	      
	      System.out.println(" Sorting By Marks : -");
		  System.out.println(students);
			
			System.out.println(" Sorting By Name : -");
		    students.sort(byName);
		    System.out.println(students);
		    
		    System.out.println(" Sorting By Age : -");
		    students.sort(byAge);
		    System.out.println(students);
		    
		    System.out.println("Sort By Marks In Descending Order : ");
		    students.sort(marksComparatorDesc);
		    System.out.println(students);
		    
	}

}
