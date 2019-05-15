/**
 * 
 */
package com.design.observer;

import java.util.ArrayList;

/**
 * @author Ajay
 *
 */
public class CricketData implements Subject {

	ArrayList<Observer> observerList;

	float over;
	int run;
	int wicket;

	/**
	 * This is the main data layer where client will interact to
	 */
	public CricketData() {
		observerList = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);

	}

	@Override
	public void unregisterObserver(Observer observer) {
		observerList.remove(observerList.indexOf(observer));
	}
	
	private int getLatestRun() {
		return 10;
	}
	private int getLatestWicket() {
		return 20;
	}
	private float getLatestOver() {
		return (float) 10.2;
	}
	
	public void dataChange() {
		this.run=getLatestRun();
		this.wicket=getLatestWicket();
		this.over=getLatestOver();
		notifyAllObservers();
	}

	@Override
	public void notifyAllObservers() {

		for (Observer observers : observerList) {

			observers.update(run, wicket, over);
		}
	}
}
