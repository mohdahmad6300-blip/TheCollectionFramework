package com.collection.Set;

import java.util.List;

import java.util.stream.Collectors;
import java.util.LinkedHashSet;

public class SetStream 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		
       List<Integer> list = num.stream()
    		   			.collect(Collectors.toList());
       
       System.out.println(list);
      
	}

}
