package com.java8.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map=new HashMap();
		map.put(1, "raj");
		map.put(2, "ajay");
		map.put(3, "raj");
		map.put(4, "mohan");
		
		Set set=map.entrySet();
		
		for(Object key: map.keySet()) {
			System.out.println("Key is "+key +" and value is::"+map.get(key));
			
		}
		//System.out.println(set);

	}

}
