/**
 * 
 */
package com.java8.multithed;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajay
 *
 */

class NewThread implements Runnable {
	
	static List list=new ArrayList();

	@Override
	public void run() {
		
		System.out.println("Entered into new Thread");
		list.add("D");
	}
	
}

public class ConcurrentMultiThread {

	/**
	 * 
	 */
	public ConcurrentMultiThread() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) throws InterruptedException {
		
		NewThread.list.add("A");
		NewThread.list.add("B");
		NewThread.list.add("C");
		
		Thread t1=new Thread(new NewThread());
		Thread t2=new Thread(new NewThread());
		Thread t3=new Thread(new NewThread());
		Thread t4=new Thread(new NewThread());
		t1.start();
		t2.start();
		
		System.out.println("List::"+NewThread.list);
		for(Object list:NewThread.list) {
			
			String list1=(String)list;
			
			System.out.println(list1);
		}
		t3.start();
		t4.start();
	}
}
