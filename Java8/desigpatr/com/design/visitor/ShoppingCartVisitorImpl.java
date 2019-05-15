/**
 * 
 */
package com.design.visitor;

/**
 * @author Ajay
 *
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		Integer cost=0;
		cost = book.getPrice();
		if (cost > 50) {
			
			cost = book.getPrice() - 5;
		}
		
		System.out.println("Book Isbn::"+book.getIsbnNumber()+" "+"cost::"+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		
		Integer cost=0;
		cost=fruit.getPricePerKg()* fruit.getWeight();
		
		if(fruit.getWeight()>10) {
			cost=cost-10;
		}
		
		System.out.println("Fruit Name::"+fruit.getName()+" "+"cost::"+cost);
		
		return cost;
	}

}
