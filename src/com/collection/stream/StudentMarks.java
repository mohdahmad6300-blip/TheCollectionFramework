package com.collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMarks {

    public static void main(String[] args) {

        
        ArrayList<Integer> marks = new ArrayList<>(
                Arrays.asList(45, 78, 32, 90, 65, 88, 25, 70)
        );

        
        System.out.println("Marks Greater Than 50:");

        marks.stream()
                .filter(mark -> mark > 50)
                .forEach(System.out::println);


        
        long count = marks.stream()
                .filter(mark -> mark > 50)
                .count();

        System.out.println("\nStudents Scored Greater Than 50: " + count);


        
        int highest = marks.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("Highest Marks: " + highest);


        
        int lowest = marks.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Lowest Marks: " + lowest);


        
        List<Integer> sortedMarks = marks.stream()
                .sorted()
                .toList();

        System.out.println("Sorted Marks: " + sortedMarks);


        
        List<Integer> passedMarks = marks.stream()
                .filter(mark -> mark > 50)
                .toList();

        System.out.println("Marks Greater Than 50 List: " + passedMarks);
    }
}