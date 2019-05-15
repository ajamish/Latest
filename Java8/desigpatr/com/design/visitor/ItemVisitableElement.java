/**
 * 
 */
package com.design.visitor;

/**
 * @author Ajay
 *
 */
public interface ItemVisitableElement {
	
	public int accept(ShoppingCartVisitor visitor);

}
