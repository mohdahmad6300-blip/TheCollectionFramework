package com.collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList 
{

    public static void main(String[] args) {

       
        ArrayList<String> students = new ArrayList<>(
                Arrays.asList(
                        "Aman",
                        "Rahul",
                        "Ankit",
                        "Mohit",
                        "Arjun",
                        "Karan",
                        "Aakash"
                ));

        
        System.out.println("All Students:");
        students.stream()
                .forEach(System.out::println);


        
        System.out.println("\nStudents Starting With A:");
        students.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);


        
        System.out.println("\nUppercase Names:");
        students.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        
        System.out.println("\nSorted Names:");
        students.stream()
                .sorted()
                .forEach(System.out::println);


        
        long count = students.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("\nCount of Students Starting With A: " + count);


        
        List<String> namesStartingWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println(
                "New List of Students Starting With A: "
                        + namesStartingWithA
        );
    }
}