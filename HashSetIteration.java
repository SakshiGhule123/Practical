package com.lab.program;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Create an iterator to iterate through the HashSet
        Iterator<String> iterator = hashSet.iterator();

        // Use a while loop to iterate through the elements
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
