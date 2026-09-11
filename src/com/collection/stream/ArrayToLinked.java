package com.collection.stream;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayToLinked 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrayNum = new ArrayList<Integer>();
		
		arrayNum.add(10);
		arrayNum.add(20);
		arrayNum.add(30);
		arrayNum.add(40);
		arrayNum.add(50);
		
		LinkedList<Integer> linkedNum = new LinkedList<Integer>(arrayNum);
		
		System.out.println("ArrayList  : "+arrayNum);
		System.out.println("LinkedList : "+linkedNum);

	}

}
