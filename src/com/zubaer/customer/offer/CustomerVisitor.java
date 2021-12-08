package com.zubaer.customer.offer;

import com.zubaer.customer.catergory.BronzeCustomer;
import com.zubaer.customer.catergory.GoldCustomer;
import com.zubaer.customer.catergory.SilverCustomer;
import com.zubaer.customer.catergory.SuperCustomer;

public interface CustomerVisitor {
	void visitBronzeCustomer(BronzeCustomer bronzeCustomer);
	void visitSilverCustomer(SilverCustomer silverCustomer);
	void visitGoldCustomer(GoldCustomer goldCustomer);
	void visitSuperCustomer(SuperCustomer superCustomer);

}
