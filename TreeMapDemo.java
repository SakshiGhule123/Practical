package com.java.demo.collection;

import java.util.TreeMap;

// o/p display in Ascending Order

public class TreeMapDemo {

	public static void main(String[] args) {
		
     TreeMap<Integer,Integer> tr = new TreeMap<Integer ,Integer>();
     
     tr.put(1, null);
     tr.put(5, 22);
     tr.put(3, 22);
     tr.put(3, 36);
     tr.put(4, 1);
     
     System.out.println(tr);
     
TreeMap<String,Integer> tr1 = new TreeMap<String ,Integer>();
     
     tr1.put("One", null);
     tr1.put("Two", 22);
     tr1.put("Three", 22);
     tr1.put("Five", 36);
     tr1.put("Six", 1);
     
     System.out.println(tr1); 
     
     System.out.println(tr.lowerKey(5));   // lower key provide lower than input key if available not then it will print null
     
    // System.out.println(tr.lowerEntry(1));  // lower Entry provide the ( key ,Value ) lower than the input key
    
       System.out.println(tr.lowerEntry(1));
	}

}
