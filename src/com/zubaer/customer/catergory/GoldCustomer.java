package com.zubaer.customer.catergory;

import com.zubaer.customer.offer.CustomerVisitor;

public class GoldCustomer extends Customer {

	public GoldCustomer(String name, Category category) {
		super(name, category);
		
	}

	@Override
	public void accept(CustomerVisitor visitor) {
		visitor.visitGoldCustomer(this);

	}

}
