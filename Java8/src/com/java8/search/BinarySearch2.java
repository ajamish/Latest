/**
 * 
 */
package com.java8.search;

class  BinarySearch2 {
	public static int binarySearch(int a[], int element) {
		int first=0;
		int last=a.length-1;
		System.out.println("Last::"+last);
		int mid=calculateMid(first, last);
		if(mid==element) {
			return mid;
		}
		while(first<=last) {
		
		if(element<a[mid]) {
			mid=mid-1;
		}
		else {
			mid=mid+1;
		}
		if(a[mid]==element) {
			return mid;
		}
	}
		return -1;
	}
	
	public static int calculateMid(int first, int last) {
		return first+last/2;
		
	}
	
	public static void main(String args[]) {
		int a[]= {10,20,30,40,50,60,70,80};
		
		int element=70;
		
		int locElement=binarySearch(a, element);
		if(locElement==-1) {
			System.out.println("NO Element found inside the array");
		} else {
			System.out.println("*** Number found, the location of the number is::"+locElement);
		}
	}
}
