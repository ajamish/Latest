/**
 * 
 */
package com.java.coding.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Ajay
 *
 */

public class DuplicateCountInString {
	
	private static String str;
	private static Scanner scanner;
	private static Map<Character,Integer> map=new HashMap<Character, Integer>();
	private static Integer StringOccur=1;

	/**
	 * 
	 */
	public DuplicateCountInString() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input the string::");
		scanner=new Scanner(System.in);
		str=scanner.nextLine();
		char[] chr=str.toCharArray();
		for(char ch:chr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, StringOccur);
			}
		}
		System.out.println("contents of the Map are::"+map);
		System.out.println("Duplicate counts are below:::");
		Iterator<Character> itr=map.keySet().iterator();
		while (itr.hasNext()) {
			char element=(char) itr.next();
			if(map.get(element)>1) {
				System.out.println(element+":"+map.get(element));
			}
			
		}
		
	}
}
