package com.java8.genrics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenTest2 {

	public GenTest2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("ajay");
		list.add("Vijay");
		list.add("ajay");
		list.add("Vijay");
		
		Set<String> SetOfObject = new HashSet<String>(); //compiler error -

		//Read more: http://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html#ixzz4wGUuyyiW
		
		for(Object obj:list) {
			String element=(String)obj;
			System.out.println(element);
		}
		
			
//			Iterator itr=list.iterator();
//			while(itr.hasNext()) {
//			if("Vijay".equals(itr.next())) {
//				itr.remove();
//			}
//			}
//			
//			for(Object elm:list) {
//				System.out.println("Object::"+elm);
//			}
		String temp="hello";
		for (int i=0;i<list.size();i++) {
			
			if(list.get(i).equals(temp)) {
				list.remove(i);
			} else {
				temp=list.get(i);
			}
			
		}
		
		for(Object elm:list) {
			System.out.println("Object::"+elm);
		}
		}
		

	}
