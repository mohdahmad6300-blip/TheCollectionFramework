package com.collection.Vector;

import java.util.Iterator;
import java.util.Vector;

public class Names 
{

	public static void main(String[] args) 
	{
		Vector<String> names = new Vector<String>();
		
		names.add("Ahmad");
		names.add("Aboozar");
		names.add("Atifa");
		names.add("Tabrez");
		names.add("Neha");
		
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		
	}

}
