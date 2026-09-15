package com.collection.Set;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : arr) {

           
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicate Numbers:");

        for (int number : duplicates) {
            System.out.println(number);
        }
    }
}
