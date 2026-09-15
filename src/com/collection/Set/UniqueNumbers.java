package com.collection.Set;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 Numbers : ");
		
		HashSet<Integer> num = new HashSet<Integer>();
		
		for(int i=1; i<=10; i++)
		{
			System.out.print("Enter Number "+i+" : ");
			int n = sc.nextInt();
			
			num.add(n);
		}
		
		System.out.println("Unique Numbers : "+num);

		sc.close();
	}

}
