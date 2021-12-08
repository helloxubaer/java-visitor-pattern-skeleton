package com.zubaer.customer.catergory;

import com.zubaer.customer.offer.CustomerVisitor;

public class SuperCustomer extends Customer {

	public SuperCustomer(String name, Category category) {
		super(name, category);
	
	}

	@Override
	public void accept(CustomerVisitor visitor) {
		visitor.visitSuperCustomer(this);

	}

}
