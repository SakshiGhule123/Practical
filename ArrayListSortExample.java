package com.lab.program;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Display the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
    }
}
