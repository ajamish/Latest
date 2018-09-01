/**
 * 
 */
package com.ocjs.oops;

/**
 * @author Ajay
 *
 */

interface Device {
	public void doIt();
}

class Electronic implements Device {

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Phone1 extends Electronic {
	
}

abstract class Phone2 extends Electronic {
	
	public void doIt(int x) {
		
	}
	
	class Phone3 extends Electronic implements Device {
		
	}
	
	
}
public class InterfaceTest {

	/**
	 * 
	 */
	public InterfaceTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
