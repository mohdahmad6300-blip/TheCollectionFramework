package com.collection.Set;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 30, 50};


        Set<Integer> uniqueNumbers = new HashSet<>();

    
        for (int number : arr) {
            uniqueNumbers.add(number);
        }

     
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After Removing Duplicates: " + uniqueNumbers);
    }
}