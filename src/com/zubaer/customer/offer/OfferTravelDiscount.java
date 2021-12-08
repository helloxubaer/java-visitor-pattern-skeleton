package com.zubaer.customer.offer;

import com.zubaer.customer.catergory.BronzeCustomer;
import com.zubaer.customer.catergory.GoldCustomer;
import com.zubaer.customer.catergory.SilverCustomer;
import com.zubaer.customer.catergory.SuperCustomer;

public class OfferTravelDiscount implements CustomerVisitor {

	@Override
	public void visitBronzeCustomer(BronzeCustomer bronzeCustomer) {
		System.out.println("New implementation for BRONZE class with a visitor");

	}

	@Override
	public void visitSilverCustomer(SilverCustomer silverCustomer) {
		System.out.println("New implementation for SILVER class with a visitor");

	}

	@Override
	public void visitGoldCustomer(GoldCustomer goldCustomer) {
		System.out.println("New implementation for GOLD class with a visitor");

	}

	@Override
	public void visitSuperCustomer(SuperCustomer superCustomer) {
		System.out.println("New implementation for SUPER_CUSTOMER class with a visitor");

	}

}
