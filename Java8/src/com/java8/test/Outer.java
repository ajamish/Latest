package com.java8.test;

public class Outer {
	interface MemI {
		public void foo();
	}
	
	static class Inner implements MemI {

		@Override
		public void foo() {
			System.out.println("In outer Inner foo method");			
		}
			
	}

	public static void main(String[] args) {
		Outer.Inner i=new Outer.Inner();
		i.foo();

	}

}
