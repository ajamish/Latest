/**
 * 
 */
package com.conpool.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.conpool.exce.MaxConnectionException;
import com.conpool.model.Property;
import com.conpool.reader.PropertyReader;

/**
 * @author Ajay
 *
 */
public class ConnectonPool {
	private Connection conn;
	private Property property;
	private PropertyReader propReader;
	private static List<Connection> list=new ArrayList<Connection>();
		
	/**
	 * Core class for creating the connection poll
	 * Initial limit would be 5 connection, it may be increased as per business requirements
	 */
	public ConnectonPool() {
		propReader=new PropertyReader();
		try {
			property=propReader.loadProperties();
			list.add(getConnection());
			list.add(getConnection());
			list.add(getConnection());
			list.add(getConnection());
			list.add(getConnection());
		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found::");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException connection pool::");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		System.out.println("driver name::"+property.getDriver());
		Class.forName(property.getDriver());
		conn=DriverManager.getConnection(property.getUrl(),property.getUser(),property.getPass());
		return conn;
	}
	public List<Connection> getConnctionFromPool() throws MaxConnectionException, ClassNotFoundException, SQLException {
		if(list.size()>0) {
			list.remove(list.size()-1);
		} else {
			throw new MaxConnectionException("maximum conenction issue: wait for some time to get connections released");
		}
		return list;
		
	}
	public void closeConnection() {
		try {
			list.add(getConnection());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
