package com.java8.multithed;

class Mythread implements Runnable {
	
	Integer salCheck=10;
	Integer checkAdd=20;
	
	public void printSum() {
		for(int i=0;i<10;i++) {
		System.out.println("Hello sum::");
		}
		
	}
	public void printHello() {
		for(int i=0;i<10;i++) {
		System.out.println("Hello hEllo::");
		}
	}

	@Override
	public void run() {
		if(salCheck==10) {
			printSum();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			
			if (checkAdd==20) {
				printHello();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
}

public class MultiThredTest {

	public MultiThredTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Mythread one=new Mythread();
		Mythread two=new Mythread();
		//Mythread three=new Mythread();
		
		Thread t1=new Thread(one);
		t1.setName("I");
		Thread t2=new Thread(two);
		t1.setName("II");
		
		t1.start();
		t2.start();
		

	}

}
