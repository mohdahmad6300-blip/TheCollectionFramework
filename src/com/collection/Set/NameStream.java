package com.collection.Set;
import java.util.HashSet;
import java.util.Set;

public class NameStream 
{

    public static void main(String[] args) 
    {

        Set<String> names = new HashSet<>();

        names.add("Ahmad");
        names.add("Aboozar");
        names.add("Atifa");
        names.add("Tabrez");
        names.add("Neha");

        
        names.stream()
                
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
} 