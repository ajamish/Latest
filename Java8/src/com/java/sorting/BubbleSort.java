/**
 * 
 */
package com.java.sorting;

/**
 * @author Ajay
 *
 */
public class BubbleSort {

	/**
	 * 
	 */
	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}
	
	static int[] bubbleSort(int[] A) {
		
		int size=A.length;
		int temp;
		int noOfSwap=0;
		
		for(int k=0;k<size;k++) {
			
			for(int i=0;i<size-k-1;i++) {
				if(A[i]>A[i+1]) {
					noOfSwap++;
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
				
			}
		}
		
		System.out.println("No of swap::"+noOfSwap);
		
		return A;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,2,0,5,3};
		
		int A[]=bubbleSort(array);
		for(int i=0;i<A.length;i++) {
			System.out.println(" "+A[i]);
		}
	}
}
