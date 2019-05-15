/**
 * 
 */
package com.design.templtebank;

/**
 * @author Ajay
 *
 */
public class AccountTemplate extends AbstractAccountTemplate {

	/**
	 * 
	 */
	protected static Integer empNo=12345;
	

	@Override
	public void validateAllDocs() {
		System.out.println("All Docs are validated::");
		
	}

	@Override
	public Integer checkCibilScore() {
		System.out.println("CIBIL score is legitimate::");
		return null;
	}

	@Override
	public boolean policeClearanceOK() {
		System.out.println("Police Clearnce is OK::");
		return false;
	}
}
