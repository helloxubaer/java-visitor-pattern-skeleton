package com.zubaer.customer.offer;

import com.zubaer.customer.catergory.BronzeCustomer;
import com.zubaer.customer.catergory.GoldCustomer;
import com.zubaer.customer.catergory.SilverCustomer;
import com.zubaer.customer.catergory.SuperCustomer;

public class ProvideNewPaymentCalculation implements CustomerVisitor {

	@Override
	public void visitBronzeCustomer(BronzeCustomer bronzeCustomer) {
		System.out.println("Another new implementation for BRONZE: Shows details cost information "
				+ "Fron Visitor class");

	}

	@Override
	public void visitSilverCustomer(SilverCustomer silverCustomer) {
		System.out.println("Another new implementation for SILVER: Shows details cost information "
				+ "Fron Visitor class");

	}

	@Override
	public void visitGoldCustomer(GoldCustomer goldCustomer) {
		System.out.println("Another new implementation for GOLD: Shows details cost information "
				+ "Fron Visitor class");

	}

	@Override
	public void visitSuperCustomer(SuperCustomer superCustomer) {
		System.out.println("Another new implementation for SUPER: Shows details cost information "
				+ "Fron Visitor class");

	}

}
