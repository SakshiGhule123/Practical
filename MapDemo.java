package com.java.demo.collection;

import java.util.HashMap;
 import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
       Map<Integer ,String > map = new HashMap<Integer , String>();
       
       map.put(11 , "Sakshi");
       map.put(1, null);
       map.put(2, "Punam");
       map.put(5, "Payal");
       map.put(4 , "Vidya");
       
       System.out.println(map);
       
       String value = map.get(1);
       System.out.println(value);
       
       System.out.println(map.keySet());
       
       System.out.println(map.values());
	}

}
