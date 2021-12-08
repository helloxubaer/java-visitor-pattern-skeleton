package com.zubaer.customer.catergory;

import com.zubaer.customer.offer.CustomerVisitor;

public class BronzeCustomer extends Customer {

	public BronzeCustomer(String name, Category category) {
		super(name, category);
	
	}

	@Override
	public void accept(CustomerVisitor visitor) {
		visitor.visitBronzeCustomer(this);
	}
	

}
