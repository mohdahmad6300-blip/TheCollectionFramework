package com.collection.list;

import java.util.ArrayList;

public class MinMax 
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
		
		// Without Using Collection.
		int max = num.get(0);
		int min = num.get(0);
		
		for(int n : num)
		{
			if(n>max)
			{
				max = n;
			}
		}
		
		for(int n : num)
		{
			if(n<min)
			{
				min = n;
			}
		}
		
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
		

		
		
	}

}
