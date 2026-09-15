package com.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Challenge 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println("Original List : "+num);
		
		ListIterator<Integer> iterator = num.listIterator();
		
		System.out.println("Print Forward :- ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("Print Backward :- ");
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}
	
		while(iterator.hasNext())
		{
			int n = iterator.next();
			if(n == 30)
			{
				iterator.set(300);
			}
			else if(n== 20)
			{
				iterator.remove();
			}
			
			
		}
		iterator.add(60);
		
		System.out.println("Final List : "+num);
	}

}
