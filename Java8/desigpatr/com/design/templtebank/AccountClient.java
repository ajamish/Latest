/**
 * 
 */
package com.design.templtebank;

/**
 * @author Ajay
 *
 */
public class AccountClient extends AccountTemplate {
	
	private int rope=1;
	protected boolean outside;
	

	/**
	 * 
	 */
	public AccountClient() {
		//p1
	   //rope=5;
		
		super();
		//this(4);
		
		outside=true;
		
	}
	public AccountClient(int rope) {
		this.rope=outside ?rope:rope+1;
	}
	
	public boolean getDetail() {
		if(2>0) {
			return true;
		} else if(4<-1) {
			return true;
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println(new AccountClient().rope);
	//System.out.println(new AccountClient(6).rope);	
			
	}
}
	

