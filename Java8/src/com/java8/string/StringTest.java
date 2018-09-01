/**
 * 
 */
package com.java8.string;

/**
 * @author Ajay
 *
 */
public class StringTest {

	/**
	 * 
	 */
	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s="Hyaderabad";
		String[] s1=s.split("d");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		
		for (int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println("Duplicate found and duplcate is::"+s.charAt(i));
				}
			}
			
			
		}

	}

}
