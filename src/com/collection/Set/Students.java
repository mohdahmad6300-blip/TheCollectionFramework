package com.collection.Set;

import java.util.HashSet;

public class Students 
{

	public static void main(String[] args) 
	{
		HashSet<String> names = new HashSet<String>();
		
		names.add("Ahmad");
		names.add("Atifa");
		names.add("Aboozar");
		names.add("Tabrez");
		names.add("Neha");
		names.add("Aboozar"); //Duplicates not Allowed.
		
		names.remove("Neha");
		
		names.clear();
		System.out.println("Students : "+names);
		System.out.println("Is there is Ahmad in the Set : "+names.contains("Ahmad"));
		System.out.println("Size of the Set : "+names.size());
		System.out.println("Is set is Empty : "+names.isEmpty());
	}

}
