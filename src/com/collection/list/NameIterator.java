package com.collection.list;

import java.util.ListIterator;
import java.util.LinkedList;

public class NameIterator 
{

	public static void main(String[] args) 
	{
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Ahmad");
		name.add("Atifa");
		name.add("Aboozar");
		name.add("Tabrez");
		name.add("Neha");
		
		ListIterator<String> iterator = name.listIterator();
		
		while(iterator.hasNext())
		{
			String names = iterator.next();
			
			if(names == "Tabrez")
			{
				iterator.add("Anees");
			}
		}		

		System.out.println("Final List : "+name);
	}

}
