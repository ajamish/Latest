/**
 * 
 */
package com.design.observer;

/**
 * @author Ajay
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CurrentScoreObserver currScoreObserver=new CurrentScoreObserver();
		AverageScoreObserver avgScoreObserver=new AverageScoreObserver(); 
		CricketData cricketData=new CricketData();
		
		/* call below method when there is any data change at Publisher system */
		cricketData.dataChange();
		/* call below method when there is any data change at Publisher system */
		
		cricketData.registerObserver(currScoreObserver);
		cricketData.registerObserver(avgScoreObserver);
		cricketData.unregisterObserver(avgScoreObserver);
		cricketData.notifyAllObservers();
		
		

	}

}
