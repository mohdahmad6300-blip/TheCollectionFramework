package com.collection.stream;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class StreamNames 
{

	public static void main(String[] args) 
	{
		List<String> names = new ArrayList<String>(Arrays.asList("Ahmad","Aboozar","Tabrez","Atifa","Neha"));
		
		names.stream()
			 .map(String :: toUpperCase)
			 .forEach(System.out::println);

		
	}

}
