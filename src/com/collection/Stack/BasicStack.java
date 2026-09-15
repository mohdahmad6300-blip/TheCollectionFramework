package com.collection.Stack;

import java.util.Stack;

public class BasicStack 
{

	public static void main(String[] args) 
	{
		Stack<Integer> num = new Stack<Integer>();
		
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		
		System.out.println(num);
		System.out.println(num.peek());
		num.pop();
		System.out.println(num);
	}

}
