/**
 * 
 */
package com.design.visitor;

/**
 * @author Ajay
 *
 */
public class Book implements ItemVisitableElement {

	private String name;
	private Integer price;
	private String isbnNumber;
	
	public Book(String name, Integer price, String isbnNumber) {
		
		this.name=name;
		this.price=price;
		this.isbnNumber=isbnNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
