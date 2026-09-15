package com.collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashTest 
{

    public static void main(String[] args) 
    {

        LinkedHashSet<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("SQL");
        languages.add("Java"); // Duplicate

        System.out.println("LinkedHashSet: " + languages);
        System.out.println();
        System.out.println("I observes that LinkedHashSet Also not Allowed Duplicates\nBut the insertion order is Preserved.");
    }
}