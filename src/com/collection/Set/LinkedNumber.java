package com.collection.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedNumber 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		
		int[] arr = {10,20,10,20,30,40,30};
		
		for(int i : arr)
		{
			num.add(i);
		}
		
		System.out.println("Original : "+Arrays.toString(arr));
		System.out.println("Remove Duplicates : "+num);
		

	}

}
