package com.java.demo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List list = new ArrayList();
		
		ArrayList ar = new ArrayList();
		
		
	/*	List list1 = new Vector();
		
		List list2 = new LinkedList();  */
		
		ar.add(2);
		ar.add(3);
		ar.add(2);
		ar.add(5);
		
		System.out.println(ar);
		System.out.println(ar.size());
	}

}
