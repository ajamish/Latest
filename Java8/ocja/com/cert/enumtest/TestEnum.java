package com.cert.enumtest;

enum Animals {
	
	DOG("woof"), CAT("MEOO"), FISH("burble");
	String sound;
	
	Animals(String s) {
		System.out.println("Animals constructor got called");
		sound=s;
	}
}
	
	public class TestEnum {
		static Animals a;
		public static void main(String args[]) {
			System.out.println(a.DOG.sound+" "+a.FISH.sound);
		}
	}
