package com.java8.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class TestClass {
  @SuppressWarnings("null")
  public static int Solution(int[] A) {
	 Arrays.sort(A);
	  if(A==null) {
		  return 0;
	  } 
	  
	  for (int i=0;i<A.length;i++) {
		  if(A[i]!=A[i+1]-1) {
			  return A[i]+1;
		  }
	  }
	  
	return 0;
	  
  }
  
public static void main(String args[] ) throws Exception {
	
	int A[]= {1,2,4,6,0};
	int result=Solution(A);
	System.out.println("The smallest no in array=="+result);
	
  }
}