package com.collection.Set;

import java.util.TreeSet;

public class TreeSetTest 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> num = new TreeSet<Integer>();
		num.add(50);
		num.add(30);
		num.add(40);
		num.add(10);
		num.add(20);
		

		System.out.println("TreeSet : "+num);
		
		System.out.println("Poll first : "+num.pollFirst());
		System.out.println("Poll Last : "+num.pollLast());
	}

}
