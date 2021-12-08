package com.zubaer.customer.catergory;

import com.zubaer.customer.offer.CustomerVisitor;

public class SilverCustomer extends Customer {

	public SilverCustomer(String name, Category category) {
		super(name,category);
	}
	
	@Override
	public void accept(CustomerVisitor visitor) {
		visitor.visitSilverCustomer(this);

	}

}
