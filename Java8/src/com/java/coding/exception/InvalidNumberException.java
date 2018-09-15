/**
 * 
 */
package com.java.coding.exception;

/**
 * @author Ajay
 *
 */
public class InvalidNumberException extends Exception {

	/**
	 * customer exception class created for InvalidNumberException
	 */
	String errorMessage;	
	
	public InvalidNumberException() {
		super();
	}
	public InvalidNumberException(String message) {
		this.errorMessage=message;
	}
	

}
