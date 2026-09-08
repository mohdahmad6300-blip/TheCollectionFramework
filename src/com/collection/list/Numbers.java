package com.collection.list;

import java.util.ArrayList;

public class Numbers 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
	
		System.out.println("Numbers : "+num);
		
		//Add 1 At index 0 and 50 at the end.
		num.add(0,1);
		num.add(50);
		System.out.println("Numbers : "+num);
		
		num.remove(3);
		
		System.out.println("Numbers : "+num);
		
	}

}
