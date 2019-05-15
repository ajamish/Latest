/**
 * 
 */
package com.design.visitor;

/**
 * @author Ajay
 *
 */
public class ShoppingCartClient {

	/**
	 * 
	 */
	public ShoppingCartClient() {
		// TODO Auto-generated constructor stub
	}
	
	public static Integer calculatePrice(ItemVisitableElement[] items) {
		
		ShoppingCartVisitor shoppingVisitor=new ShoppingCartVisitorImpl();
		
		int sum=0;
		
		for(ItemVisitableElement item: items) {
			sum=sum+item.accept(shoppingVisitor);
		}
		return sum;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ItemVisitableElement[] items=new ItemVisitableElement[] {new Book("Java",2000, "10012001"),new Book("Java",2000, "10012002"), new Fruit(4000, 10, "Apple") };
		
		int totalCost=calculatePrice(items);
		
		System.out.println("TotalCost::"+totalCost);
		

	}

}
