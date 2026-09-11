package com.collection.stream;

import java.util.LinkedList;

public class FilterLinked 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		num.add(12);
		num.add(11);
		num.add(13);
		num.add(16);
		num.add(15);
		num.add(14);
		
		
		num.stream()
		   .map(n->n*10)
		   .forEach(System.out::println);

	}

}
