package com.java.demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> evenNumber=new HashSet<Integer>();
		
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("HasSet" + evenNumber);
		
		HashSet<Integer> numbers=new HashSet<Integer>();
		
		//bulk entry
		// Union of Set
		
		numbers.addAll(evenNumber);
		numbers.add(5);
		
		System.out.println("New HashSet" +numbers);
		
		//travrese
		
		Iterator<Integer> it=numbers.iterator();
		System.out.println("HasSet Using Iterator");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			System.out.println(", ");
		}
		// remove
		boolean values1=numbers.remove(5);
		
		System.out.println("Is 5 removes " +values1);
		
		//all data removed 
		boolean values2=numbers.removeAll(numbers);
		System.out.println("Is all elements are removes " +values2);
		
		
		HashSet<Integer> oddNumber=new HashSet<Integer>();
		
		oddNumber.add(1);
		oddNumber.add(3);
		oddNumber.add(5);
		
		HashSet<Integer> evenNumber1=new HashSet<Integer>();
		// add data
		evenNumber1.add(2);
		evenNumber1.add(4);
		System.out.println("HasSet" + evenNumber1);
		
		HashSet<Integer> primeNumber=new HashSet<Integer>();
		primeNumber.add(2);
		primeNumber.add(3);
		oddNumber.add(5);
		
		System.out.println("HasSet" + primeNumber);
		//Difference of Sets
		primeNumber.removeAll(oddNumber);
		System.out.println(primeNumber);
		//intersection of sets
		evenNumber1.retainAll(primeNumber);
		System.out.println("The Intersection is " +evenNumber1);
	}

}
