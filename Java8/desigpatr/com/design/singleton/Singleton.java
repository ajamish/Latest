/**
 * 
 */
package com.design.singleton;

import java.io.Serializable;

/**
 * @author Ajay
 *
 */
public class Singleton {

	/**
	 * @throws Exception 
	 * 
	 */
	private Singleton()  { // Make the constructor private so that no one can create direct object
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}  		  // Object could be created by REFLECTION, throwing exception could prevent it.
	}
	
	private static Singleton singleton;
	
	public static Singleton getInstance() throws Exception {
		
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
	
	// Don't implement the Singleton class with Serializable  interface, if implementing then override below method.
	public Object readResolve() {
		return singleton;
	}
	
	// Don't implement Cloneable interface
	public Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException("Can't clone a Singleton class");
	  }
	
	public static void main(String args[]) throws Exception {
		
		Singleton sign=Singleton.getInstance();
		Singleton sign1=Singleton.getInstance();
		System.out.println("Sign::"+sign+" "+sign1);
	}

}
