/**
 * 
 */
package com.design.visitor;

/**
 * @author Ajay
 * 
 * 
 * Visitor design pattern is one of the behavioral design patterns. 
 * It is used when we have to perform an operation on a group of similar kind of Objects.
 * With the help of visitor pattern, we can move the operational logic from the objects
 * to another class
 */

public interface ShoppingCartVisitor {
	
	public int visit(Book book);
	public int visit(Fruit fruit);

}
