package com.design.template;

public abstract class AbstractTemplate {
	
	public final void templateMethod() {
		
		doSomething();
		performTask1();
		performTask2();
		performTask3();
	}
	
	protected abstract void doSomething();
	protected abstract void performTask1();
	protected abstract void performTask2();
	protected abstract void performTask3();
}
