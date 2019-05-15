/**
 * 
 */
package com.design.observer;

/**
 * @author Ajay
 *
 */
public class CurrentScoreObserver implements Observer {
	
	private int run;
	private int wicket;
	private float over;

	@Override
	public void update(int run, int wicket, float over) {
		
		this.run=run;
		this.over=over;
		this.wicket=wicket;
		displayCurrScore();
		
	}
	public void displayCurrScore() {
		
		System.out.println("***** Current Score is:::"+"Run::"+run+": Wicket::"+wicket+":: Over:"+over);
	}

}
