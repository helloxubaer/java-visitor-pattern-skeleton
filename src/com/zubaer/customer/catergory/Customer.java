package com.zubaer.customer.catergory;

import com.zubaer.customer.offer.CustomerVisitor;

public abstract class Customer {
	private String name;
	private Category category;
	public Customer(String name, Category category) {
		this.name = name;
		this.category = category;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", category=" + category + "]";
	}
	
	// accept visitor object
	public abstract void accept(CustomerVisitor visitor);

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}
	
}
