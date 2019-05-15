/**
 * 
 */
package com.design.templtebank;

/**
 * @author Ajay
 *
 */
public abstract class AbstractAccountTemplate {

	/**
	 * 
	 */
	public AbstractAccountTemplate() {
		// TODO Auto-generated constructor stub
	}
	
	public final void openAccount(Boolean bool) {
		validateAllDocs();
		checkCibilScore();
		policeClearanceOK();
		
	}
	public abstract void validateAllDocs();
	public abstract Integer checkCibilScore();
	public abstract boolean policeClearanceOK();
}
