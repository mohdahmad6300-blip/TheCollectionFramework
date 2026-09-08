package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(30);
		num.add(50);
		num.add(80);
		num.add(40);
		num.add(100);
		
		// With Using Collection.
		int max = Collections.max(num);
		int min = Collections.min(num);
	
		
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);

	}

}
