package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableInteger 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(50,10,30,20,40));
		
		System.out.println("Before sort : "+num);
		
		System.out.println();
		Collections.sort(num);
		
		System.out.println("After sort : "+num);

	}

}
