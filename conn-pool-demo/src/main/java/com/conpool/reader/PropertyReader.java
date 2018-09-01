/**
 * 
 */
package com.conpool.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.conpool.model.Property;

/**
 * @author Ajay
 *
 */
public class PropertyReader {
	
	private Properties prop = new Properties();
	private InputStream input = null;
	private Property property=null;

	public PropertyReader() {
		
	}
	
	public Property loadProperties() throws FileNotFoundException,IOException {
		//this.getClass().getClassLoader().getResourceAsStream("images/image.png");
		//input = new FileInputStream("application.properties");
		input=this.getClass().getClassLoader().getResourceAsStream("application.properties");
		property=new Property();
		// load a properties file
		prop.load(input);
		property.setDriver(prop.getProperty("driver"));
		property.setUrl(prop.getProperty("url"));
		property.setUser(prop.getProperty("user"));
		property.setPass(prop.getProperty("pass"));
		return property;
	}
	
	public Property populateProperties() {
		property.setDriver(prop.getProperty("driver"));
		property.setUrl(prop.getProperty("url"));
		property.setUser(prop.getProperty("user"));
		property.setPass(prop.getProperty("pass"));
		return property;
	}

}
