package com.java8.designpatrn;

public class ConnectionFactory {

	public ConnectionFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnectionDetail(String database) {
		
		if(database.equalsIgnoreCase("oracle")) {
		return new OracleImpl();
		}
		
		else if(database.equalsIgnoreCase("mysql")) {
			return new MySqlImpl();
			}
		
		else {
		return null;
		}
		
	}

}
