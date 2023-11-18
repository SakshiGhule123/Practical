package com.lab.program;

import java.util.LinkedList;

public class LinkedListOccurrences {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Apple");
        linkedList.add("Grapes");
        linkedList.add("Apple");

        // Element to find occurrences of
        String target = "Apple";

        // Find the first occurrence
        int firstIndex = linkedList.indexOf(target);

        // Find the last occurrence
        int lastIndex = linkedList.lastIndexOf(target);

        System.out.println("Linked List: " + linkedList);
        System.out.println("First occurrence of \"" + target + "\" is at index: " + firstIndex);
        System.out.println("Last occurrence of \"" + target + "\" is at index: " + lastIndex);
    }
}

