package com.collection.Objects;



import java.util.HashSet;

import com.collection.Set.Students;

public class StudentsObj 
{

	public static void main(String[] args) 
	{
		HashSet<Students> Students = new HashSet<Students>();
		
		Students.add(new Students(1,"Ahmad"));
		Students.add(new Students(2,"Aboozar"));
		Students.add(new Students(3,"Atifa"));
		Students.add(new Students(4,"Tabrez"));
		Students.add(new Students(5,"Neha"));
		

		
		System.out.println(Students);
	}

}
