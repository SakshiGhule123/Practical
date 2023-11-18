package com.lab.program;

import java.util.HashMap;
import java.util.Map;

public class MapSizeExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value mappings to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        // Get the size (number of key-value mappings) of the map
        int size = map.size();

        System.out.println("Number of key-value mappings in the map: " + size);
    }
}

