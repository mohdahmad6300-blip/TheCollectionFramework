package com.collection.stream;
import java.util.LinkedList;
import java.util.Queue;

public class StudentQueue 
{

	public static void main(String[] args) 
	{
		Queue<String> stud = new LinkedList<>();
		
		stud.add("Ahmad");
		stud.offer("Atifa");
		
		System.out.println("Names : "+stud);
		
		System.out.println(stud.peek());
		
		stud.poll();
		System.out.println("Names : "+stud);
	}

}
