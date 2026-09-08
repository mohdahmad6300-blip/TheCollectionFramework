package com.collection.list;

import java.util.ArrayList;

public class ListLoop 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int i=1; i<=10; i++)
			num.add(i);
		
		//Traverse using for loop.
		for(int i=1; i<=num.size(); i++)
			System.out.println(i);

		System.out.println();		
		
		//Using Foreach loop.
		for(int x : num)
			System.out.println(x);
		
		//Print only Even Numbers.
		System.out.println("Only Even Numbers in List.");
		for(int i=1; i<=num.size(); i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
		
		
		for(int i=1; i<=num.size(); i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of All Numbers : "+sum);
			
	}

}
