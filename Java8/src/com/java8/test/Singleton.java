package com.java8.test;

public class Singleton {
	
	private static Singleton singleton;

	private Singleton() {
		System.out.println("Direct instantiation is not possible");
	}
	public static synchronized Singleton getInstance() {
		if(singleton==null) {
			synchronized(Singleton.class){
				singleton=new Singleton();
			}
		}
		return singleton;
		
	}

}
