/**
 * 
 */
package com.design.observer;

/**
 * @author Ajay
 *
 */
public class AverageScoreObserver implements Observer {
	
	private int run;
	private int wicket;
	private float over;

	@Override
	public void update(int run, int wicket, float over) {
		
		this.run=run;
		this.over=over;
		this.wicket=wicket;
		displayAvgScore();
		
	}
	public void displayAvgScore() {
		
		System.out.println("***** Average Score is:::"+"Run::"+run+": Wicket::"+wicket+":: Over:"+over);
	}

}
