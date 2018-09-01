package com.dbc.bank;

class Overload {
	void method(double d, int i)
	{
		System.out.println("1");
	}
	void method(int i, byte d){
		System.out.println("2");
	}
	void method(String s1, String s2){
		System.out.println("3");
	}

}

class Unbox {
	public static void main(String args[]) {
		Overload over=new Overload();
		over.method(0,0);
	}
}