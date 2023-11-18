package com.lab.program;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        // Find numbers less than 7
        TreeSet<Integer> numbersLessThan7 = new TreeSet<>(treeSet.headSet(7));

        // Display the numbers less than 7
        System.out.println("Numbers less than 7: " + numbersLessThan7);
    }
}
