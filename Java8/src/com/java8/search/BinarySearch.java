/**
 * 
 */
package com.java8.search;

/**
 * @author Ajay
 * The Internal implementation of Binary Search.
 *
 */
public class BinarySearch {

	/**
	 * 
	 */
	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}
	
	public static int binarySearch(int a[], int start, int end, int element) {
		int mid;
		
		while (start<=end) {
			mid=start+end/2;
			if(a[mid]==element) {
				System.out.println("element is found:: element location is::->"+mid);
				return mid;
			} else if(element<a[mid]) {
				end=mid-1;	
			} else {
				start=mid+1;
			}
		}
		
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		int end=a.length;
		
		int result=binarySearch(a,0,end,20);
		if(result==-1) {
			System.out.println("No element found::");
		} else {
			System.out.println("element found and the element location is:::"+result);
		}

	}

}
