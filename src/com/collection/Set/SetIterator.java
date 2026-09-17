package com.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterator 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		Iterator<Integer> iterator = num.iterator();
		
		int max = iterator.next();
		
		while(iterator.hasNext())
		{
			int n = iterator.next();
			
			if(n>max)
			{
				max = n;
			}
		}
		
		System.out.println("Maximun Number in the Set is : "+max);
		

	}

}
