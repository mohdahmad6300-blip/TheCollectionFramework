package com.collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashTest {

    public static void main(String[] args) {

        String str = "programming";

        LinkedHashSet<Character> characters = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }

        System.out.println("Unique Characters: " + characters);
    }
}