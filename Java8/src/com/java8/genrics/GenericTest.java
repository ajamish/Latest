package com.java8.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public GenericTest() {
		// TODO Auto-generated constructor stub
	}
	static <E> void printArray(E []s) {
		
		for (E elem:s) {
		System.out.println(elem);
		}
	}

	public static void main(String[] args) {
		
		String[] countries= {"India","Pak","China"};
		Integer numbers[]= {10,20,30,40};
		printArray(countries);
		printArray(numbers);
	}

}
