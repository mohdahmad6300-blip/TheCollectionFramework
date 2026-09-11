package com.collection.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Names
{

	public static void main(String[] args) 
	{
		ArrayList<String> student = new ArrayList<>(Arrays.asList(
				"Ahmad","Atifa","Aboozar","Tabrez","Neha"
				));
		
		
		List<String> result = student.stream()
			   .filter(n -> n.startsWith("A"))
			   .map(String :: toUpperCase)
			   .toList();
		
		System.out.println("Result : "+result);
		
		
		
		
	}

}
