package com.java.demo.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(5);
		t.add(5);
		t.add(5);   // Accessing order maintaing
		
		System.out.println(t);
		
		TreeSet<String> tSet = new TreeSet<String>();
		
		tSet.add("Sakshi");
		tSet.add("Payal");
		tSet.add("Punam");
		//tSet.add(null); //not allow
		
		System.out.println(tSet);
}
}
