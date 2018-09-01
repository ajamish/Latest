package com.java8.generics;

import java.util.ArrayList;
import java.util.List;

class WildDemo {
	public void sum(List<? extends Number> list) {
		
		Object obj=list.get(0);
		System.out.println(obj);
	}
}


public class WildCardTest {

	public WildCardTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WildDemo dem=new WildDemo();
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		dem.sum(list);
		
		List<String> list1=new ArrayList<>();
		list1.add("ajay");
		list1.add("raj");
		//dem.sum(list1);

	}

}
