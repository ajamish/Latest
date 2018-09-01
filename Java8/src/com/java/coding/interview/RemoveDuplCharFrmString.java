/**
 * 
 */
package com.java.coding.interview;

/**
 * @author Ajay
 *
 */
public class RemoveDuplCharFrmString {

	/**
	 * 
	 */
	StringBuffer sb;
	public RemoveDuplCharFrmString() {
		sb=new StringBuffer();
	}
	
	public void removeDuplicateChars(String str) {
		
		for(int i=0;i<str.length();i++) {
			
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				sb.append(str.charAt(i));
			} else {
				continue;
			}
		}
		
		System.out.println("String with no duplicate chars is:::"+sb.toString());
		
	}
	
	public static void main(String args[]) {
		
		RemoveDuplCharFrmString duplStr=new RemoveDuplCharFrmString();
		duplStr.removeDuplicateChars("abcdck");
		
	}

}
