/**
 * 
 */
package com.conpool.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.conpool.exce.MaxConnectionException;
import com.conpool.model.Property;
import com.conpool.reader.PropertyReader;
import com.conpool.service.ConnectonPool;

/**
 * @author Ajay
 *
 */
public class ConnPoolMain {

	/**
	 * 
	 */
	public ConnPoolMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConnectonPool connPool=new ConnectonPool();
		try {
			List<Connection> connection0=(List<Connection>) connPool.getConnctionFromPool();
			List<Connection> connection1=(List<Connection>) connPool.getConnctionFromPool();
			List<Connection> connection2=(List<Connection>) connPool.getConnctionFromPool();
			List<Connection> connection3=(List<Connection>) connPool.getConnctionFromPool();
			List<Connection> connection4=(List<Connection>) connPool.getConnctionFromPool();
			//List<Connection> connection5=(List<Connection>) connPool.getConnctionFromPool();
			//List<Connection> connection6=(List<Connection>) connPool.getConnctionFromPool();
			connPool.closeConnection();
			System.out.println("Connection::"+connection3);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found::"+e);
			e.printStackTrace();
		} catch (MaxConnectionException e) {
			System.out.println("Max conection isssue::"+e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL Exception::"+e);
			e.printStackTrace();
		}
		
	}

}
