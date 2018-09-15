/**
 * 
 */
package com.java.coding.interview;

import com.java.coding.exception.InvalidNumberException;

/**
 * @author Ajay
 * Lily wants to play game with Int and their reversals, we defined reversed(x) to the
 * reversal of all the digits in X, ex: reversed(123)=321, reversed(120)=21
 * Logon wants to go with lilly on Movie on the days she considered to be bautiful
 * she consider a day beutiful if the absolute difference between x a reversed(x) is 
 * divisible by k, given i,j and k count the no of beautiful days when both can go to moovie.
 * 
 *  Ex: sample input 20,23, 6
 *  	sample output 2
 *  Logic. 20-rev(20) i.e 18/6=3 Yes
 *         21-12/6=1.5 NO
 *         22-22/6=infinite YES, because 0/6=0 a whole no
 *         23-32/6=1.5
 *
 */
public class BeautifulDaysAtMovies {

	/**
	 * reverseFunction created
	 * @throws InvalidNumberException 
	 */
	static int countBeutiDay=0;
	
	private static Integer Result(int i,int j,int k) throws InvalidNumberException {
		while (i<=j) {
			int absValue=Math.abs(i-reverseValue(i));
			if(absValue%k==0) {
				countBeutiDay++;
			}
			i++;
		}
		return countBeutiDay;
	}
	
	private static int reverseValue(Integer value) throws InvalidNumberException {
		Integer result=0;
		Integer reminder;
		if(value<0) throw new InvalidNumberException("Invalid Number");
		
		while(value>0) {
			reminder=value%10;
			result=result*10+reminder;
			value=value/10;
		}
	
		return result;
	}
	public BeautifulDaysAtMovies() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int result=Result(20,23,6);
			System.out.println("No of beautifuul days::"+result);
		} catch (InvalidNumberException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception::"+e);
			e.printStackTrace();
		}
		

	}

}
