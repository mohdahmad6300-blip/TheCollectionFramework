package com.collection.list;

import java.util.ArrayList;

public class Cities 
{

	public static void main(String[] args) 
	{
		
				ArrayList<String> cities = new ArrayList<String>();
				
				
				cities.add("Shahjahanpur");
				cities.add("Lucknow");
				cities.add("Delhi");
				cities.add("Amroha");
				cities.add("Bareilly");
				cities.add("Amroha");
				
				System.out.println("Before Change.");
				System.out.println("Name Of Cities : "+cities);
				System.out.println();
				
				cities.set(1,"Chandigarh");
				System.out.println("After Change.");
				System.out.println("Name Of Cities : "+cities);
				System.out.println();
				
				System.out.println("1st No. city is : "+cities.get(1));
				System.out.println();
				
				//Check Element Exist.
				System.out.println("Lists Contains Moradabad : "+cities.contains("Moradabad"));
				
				System.out.println("Index of Delhi : "+cities.indexOf("Delhi"));
				System.out.println("Last Index of Amroha : "+cities.lastIndexOf("Amroha"));
				
				cities.clear();
				System.out.println("Name Of Cities : "+cities);
				System.out.println("Is Cities List Empty : "+cities.isEmpty());


	}

}
