package com.java8.hasmaptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.setEmpid(100);
		emp1.setEmpname("ajay");
		emp2.setEmpid(200);
		emp2.setEmpname("sanjay");
		emp3.setEmpid(300);
		emp3.setEmpname("ranjay");
		
		Map map=new HashMap();
		
		map.put(emp1, "Pune");
		map.put(emp2, "GKP");
		map.put(emp3, "Village");
		
		System.out.println("Inserted into Map::"+map.size());
		
		Set keys=map.keySet();
		Iterator itr=keys.iterator();
		
		Employee key;
		String value;
		while (itr.hasNext()) {
		key=(Employee) itr.next();
		
		value=(String)map.get(key);
		
		System.out.println(key.getEmpname() +" - "+value);
	}
	}

}
