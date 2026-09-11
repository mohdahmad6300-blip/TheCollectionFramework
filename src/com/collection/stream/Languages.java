package com.collection.stream;

import java.util.ArrayList;

public class Languages 
{

	public static void main(String[] args) 
	{
		ArrayList<String> languages = new ArrayList<String>();
		
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("Python");
		languages.add("Java");
		
		System.out.println("1st : "+languages);
		
		languages.set(2, "JavaScript");
		
		System.out.println("2nd : "+languages);
		
		languages.remove(1);
		
		System.out.println("3rd : "+languages);

	}

}
