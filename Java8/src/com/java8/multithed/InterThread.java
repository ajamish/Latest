/**
 * 
 */
package com.java8.multithed;

/**
 * @author Ajay
 *
 */

class Q {
	int num;
	boolean dataSet=false;
	public synchronized void put(int num) {
		while(dataSet) {
			try { wait(); } catch(InterruptedException ie) {System.out.println(ie); };
		}
		System.out.println("Put Number::"+num);
		this.num=num;
		dataSet=true;
		notify();
	} 
	public synchronized void get() {
		while(!dataSet) {
			try { wait(); } catch(InterruptedException  ie) { };
		}
		System.out.println("Get Number::"+num);
		dataSet=false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		Thread t=new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try { Thread.sleep(1000);} catch(Exception e) { };		
	}
	
}
}

class Consumer implements Runnable {
	
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		Thread t=new Thread (this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
			try { Thread.sleep(1000);} catch(Exception e) { };
		}
		
	}
	
}



public class InterThread {

	/**
	 * 
	 */
	public InterThread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

	}

}
