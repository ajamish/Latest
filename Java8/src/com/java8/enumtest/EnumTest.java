/**
 * 
 */
package com.java8.enumtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajay
 *
 */
public class EnumTest {

	/**
	 * 
	 */
	public EnumTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Days day=Days.FRIDAY;
		List list=new ArrayList();
		list.add(day);
		
		Days s=(Days) list.get(0);
		System.out.println(s+" "+list.get(0));
		
			
		}

	}

