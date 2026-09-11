package com.collection.stream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class SortLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> numbers = new LinkedList<>(
                Arrays.asList(50, 10,10,40, 40, 20, 30)
        );

        
        List<Integer> result = numbers.stream()
                .map(n->n*2)
                .toList();

        System.out.println("Original List : "+numbers);
        System.out.println("   Result     : "+result);
        

	}

}
