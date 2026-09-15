package com.collection.Vector;

import java.util.Stack;

public class ABCD 
{

	public static void main(String[] args)
{
		Stack<String> elem = new Stack<String>();
		
		elem.push("A");
		elem.push("B");
		elem.push("C");
		elem.push("D");
		elem.push("E");
		
		System.out.println("Original Stack : "+elem);
		
		System.out.println("B is at Position "+elem.search("B"));
		 while (!elem.empty()) {
	            System.out.println(elem.pop()+" popped ");
	        }
		
		System.out.println("Final Stack : "+elem);

	}

}
