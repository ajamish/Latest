package com.java8.generics;

class GenArray<T> {
	
	T[] t;

	public T[] getT() {
		return t;
	}

	public void setT(T[] t) {
		this.t = t;
	}
	
	public T[] sort(T[] t) {
		for(int i=0;i<10;i++) {
						
		}
		return t;
		
	}
	
}

public class GenArrayDemo {

	public GenArrayDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenArray<String> gen=new GenArray<>();
		//gen.setT("Ajay");
		//System.out.println("String Value::"+gen.getT());

	}

}
