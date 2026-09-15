package com.collection.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BrowserPages 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack<String> pages = new Stack<String>();
		
		pages.push("Youtube");
		pages.push("FaceBook");
		pages.push("Instagram");
		pages.push("Whatsapp");
		pages.push("GitHub");

		System.out.println("Browser History : "+pages);
		System.out.println("..........................");

		
		char c;
		do
		{
			 if (pages.empty()) 
			   {
	                System.out.println("No more pages to go back.");
	                break;
	            }
			 
			System.out.println("Back Button Pressed.");
			System.out.println(pages.pop()+" Removed");
			
			System.out.println("Remaining Pages : " + pages);
			
			System.out.println("Do you want to press Back Button .");
			System.out.print("Press Y/y : ");
			 c = sc.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');

		System.out.println("Pages Available : "+pages);
		
		sc.close();
	}

}
