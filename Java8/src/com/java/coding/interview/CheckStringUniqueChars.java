/**
 * 
 */
package com.java.coding.interview;

/**
 * @author Ajay
 *
 */
public class CheckStringUniqueChars {

	/**
	 * 
	 */
	public CheckStringUniqueChars() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isUniqueChars(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
		int val = str.charAt(i);
		if (char_set[val])
			return false;
		char_set[val] = true;
		}
		return true;
		}
	
	public static void main(String args[]) {
		CheckStringUniqueChars nw=new CheckStringUniqueChars();
		boolean bool=nw.isUniqueChars("ajamy");
		System.out.println(bool);
	}
}

