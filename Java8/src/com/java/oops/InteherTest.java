/**
 * 
 */
package com.java.oops;

/**
 * @author Ajay
 *
 */

class A {
	private void showName() {
		System.out.println("Hi i A");
	}
}

class B extends A {
	public void showName() {
		System.out.println("Hi i B");
	}
}

public class InteherTest {

	/**
	 * 
	 */
	public InteherTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		//a.showName();

	}

}
