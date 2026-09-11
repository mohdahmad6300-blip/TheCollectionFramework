package com.collection.stream;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class EvenNumbers 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> num = new LinkedList<Integer>(
				Arrays.asList(11,12,13,14,15,16
						));
		
		List<Integer> even = num.stream()
				       .filter(n->n%2==0)
				       .toList();
		long count = num.stream()
			       .filter(n->n%2==0)
			       .count();
		
		int min = num.stream()
				  .filter(n->n%2==0)
			      .min(Integer :: compareTo)
			      .get();
		
		int max = num.stream()
				   .filter(n->n%2==0)
			       .max(Integer :: compareTo)
			       .get();
		
		
		System.out.println("Even Numbers : "+even);
		System.out.println("How Many     : "+count);
		System.out.println("Minimun even : "+min);
		System.out.println("Maximum even : "+max);

	}

}
