package com.java8.test;

import java.util.Arrays;

class ArrayTypeList {
	
	String[] ar;
	String[] copyar;
	int index;
	String element;
	ArrayTypeList() {
		ar=new String[5];
	}
	public void add(String element) {
		this.element=element;
		if(index<checkSize()) {
			ar[index]=element;
			index++;
		} else {
			copyar=ar;
			ar = Arrays.copyOf(copyar, index*2);
			ar[index]=element;
			copyar=null;
			index++;
		}
	} 
	
	public void delete(String element) {
		Integer index=0;
		for(String ardata:ar) {
			if(ardata.equals(element)) {
				ar[index]=ar[index+1];
				index++;
			}
		}
	}
	public String[] printArray() {
		return ar;
	
	}
	public int checkSize() {
		return ar.length;	
	}
}

public class CustomArrayList {

	public CustomArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {		
		ArrayTypeList atl=new ArrayTypeList();
		atl.add("Ajay");
		atl.add("Vijay");
		atl.add("Kumar");
		atl.add("X");
		atl.add("Y");
		atl.add("Z");
		atl.add("MNP");
		atl.add("GKP");
		for(String arraydt:atl.printArray()) {
			System.out.println(arraydt);
		}
		//deletion logic start
		
		//atl.delete("Y");
		
//		for(String arraydt:atl.printArray()) {
//			System.out.println(arraydt);
//		}
		
		Integer arr[]= {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==4) {
				arr[i]=arr[i+1];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
