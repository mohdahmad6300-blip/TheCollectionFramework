package com.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;


public class NumIterator 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		
	    ListIterator<Integer> numIterator = num.listIterator(num.size());
	    


		while(numIterator.hasPrevious())
		{
			System.out.println( numIterator.previous());
	}
	}
}
