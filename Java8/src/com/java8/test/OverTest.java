/**
 * 
 */
package com.java8.test;

/**
 * @author Ajay
 *
 */

class One {
	
	public Object processReq() {
		return "hello";
	}
	
}
class Two extends One {
	
	public String processReq() {
		return "HhH";
	}
}
public class OverTest {

	/**
	 * 
	 */
	public OverTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One one=new Two();
		System.out.println(one.processReq());

	}

}
