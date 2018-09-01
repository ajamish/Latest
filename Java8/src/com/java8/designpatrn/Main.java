/**
 * 
 */
package com.java8.designpatrn;

/**
 * @author Ajay
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection conn=ConnectionFactory.getConnectionDetail("ORACLE,,");
		if(conn==null) {
			System.out.println("No suitable driver found");
		} else {
			String db=conn.getConnection();
			System.out.println(db);
			
		}
		

	}

}
