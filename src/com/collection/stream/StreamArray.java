package com.collection.stream;

import java.util.ArrayList;

public class StreamArray 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		num.add(16);
		
		int min = num.stream()
				     .min(Integer::compareTo)
				     .get();
		
		int max = num.stream()
			     .max(Integer::compareTo)
			     .get();
		
		System.out.println("Minimum value : "+min);
		System.out.println("Maximum value : "+max);
	}

}
