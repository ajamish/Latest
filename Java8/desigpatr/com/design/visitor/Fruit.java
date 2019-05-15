/**
 * 
 */
package com.design.visitor;

/**
 * @author Ajay
 *
 */
public class Fruit implements ItemVisitableElement {
	
	private Integer pricePerKg;
	private Integer weight;
	private String name;
	
	Fruit(Integer pricePerKg, Integer weight, String name) {
		this.pricePerKg=pricePerKg;
		this.weight=weight;
		this.name=name;
	}

	public Integer getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(Integer pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
