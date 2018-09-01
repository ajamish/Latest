package com.java8.test;

public class Foo {

	int x=10;
	public Foo() {
		System.out.println("foo");
	}
	
	class Bar {
		Bar() {
			System.out.println("bar");	
		}
		
	public void go() {
		System.out.println("hi");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Foo().new Bar().go();

	}

}
