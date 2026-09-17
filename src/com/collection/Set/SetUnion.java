package com.collection.Set;

import java.util.LinkedHashSet;

public class SetUnion 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> setA = new LinkedHashSet<Integer>();
		
		setA.add(10);
		setA.add(20);
		setA.add(30);
		setA.add(40);
		setA.add(50);
		System.out.println("Set A :"+setA);
	   LinkedHashSet<Integer> setB = new LinkedHashSet<Integer>();
	   setB.add(40);
	   setB.add(50);
	   
	   setA.containsAll(setB);
	   
	   System.out.println("Set B :"+setB);
	   System.out.println("Compare sets : "+setA.equals(setB));

	}

}
